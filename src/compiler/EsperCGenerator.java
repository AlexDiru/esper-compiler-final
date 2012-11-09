package compiler;

import java.util.ArrayList;

public class EsperCGenerator {

	private static ArrayList<VariableInformation> variableList;

	private static String getVariableTypeFromName(String name) {

		for (VariableInformation var : variableList)
			if (var.name.equals(name))
				return var.type;
		return "unknown";
	}

	/**
	 * Generates the left brace with the required indentation
	 * 
	 * @param indent
	 *            The number of tabs to indent with
	 * @return The string with the left brace
	 */
	private static String leftBrace(int indent) {
		return "\n" + getIndentString(indent) + "{\n";
	}

	/**
	 * Generates the right brace with the required indentation
	 * 
	 * @param indent
	 *            The number of tabs to indent with
	 * @return The string with the right brace
	 */
	private static String rightBrace(int indent) {
		return getIndentString(indent) + "}\n";
	}

	/**
	 * Gets the string with the correct number of indentations
	 * 
	 * @param indent
	 *            The number of indentations
	 * @return The string of indentation
	 */
	private static String getIndentString(int indent) {
		String indentString = "";

		for (int i = 0; i < indent; i++)
			indentString += "\t";
		return indentString;
	}

	/**
	 * Generates the C code for the given tree
	 * 
	 * @param parseRoot
	 *            The root node of the tree to parse
	 * @param tvariableList
	 *            The list of variables in the code
	 * @return The generated C code
	 */
	public static String generate(ParseTree parseRoot,
			ArrayList<VariableInformation> tvariableList) {

		variableList = tvariableList;

		String code = "#include <stdio.h>\nint main() \n{\n";

		for (int i = 0; i < parseRoot.children.size(); i++) {
			code += generateNode(parseRoot.children.get(i), 1);
		}

		return code + "}\n";
	}

	/**
	 * Generates C code for the given node
	 * 
	 * @param parseRoot
	 *            The node to generate the code for
	 * @param indent
	 *            The number of indents
	 * @return The C code
	 */
	private static String generateNode(ParseTree parseRoot, int indent) {

		String indentString = getIndentString(indent);

		String code = "";

		switch (parseRoot.attribute) {

		// Arithmetic
		case "PLUS":
		case "MULT":
		case "MINUS":
		case "DIV":

			code += " (";
			code += generateNode(parseRoot.children.get(0), 0);

			if (parseRoot.attribute.equals("PLUS"))
				code += " +";
			else if (parseRoot.attribute.equals("MULT"))
				code += " *";
			else if (parseRoot.attribute.equals("MINUS"))
				code += " -";
			else if (parseRoot.attribute.equals("DIV"))
				code += " /";

			code += generateNode(parseRoot.children.get(1), 0);
			code += " )";
			break;

		// Condition
		case "LESSTHAN":
		case "GREATERTHAN":
		case "LESSTHANEQUAL":
		case "GREATERTHANEQUAL":
		case "EQUALTO":

			code += " (";
			code += generateNode(parseRoot.children.get(0), 0);

			if (parseRoot.attribute.equals("LESSTHAN"))
				code += " <";
			else if (parseRoot.attribute.equals("GREATERTHAN"))
				code += " >";
			else if (parseRoot.attribute.equals("LESSTHANEQUAL"))
				code += " <=";
			else if (parseRoot.attribute.equals("GREATERTHANEQUAL"))
				code += " >=";
			else
				code += " ==";

			code += generateNode(parseRoot.children.get(1), 0);
			code += ")";

			break;

		// Number
		case "DIGITS":
			code += " " + parseRoot.value;
			break;

		// While loop
		case "WHILE":

			code += " while";
			code += generateNode(parseRoot.children.get(0), 0);
			code += leftBrace(indent);

			// Generate the statements
			for (int i = 1; i < parseRoot.children.size(); i++)
				code += generateNode(parseRoot.children.get(i), indent + 1);

			code += rightBrace(indent);

			break;

		// Variable declaration
		case "DECLARE":

			code += indentString + parseRoot.children.get(1).value + " "
					+ parseRoot.children.get(0).value + ";\n";

			break;

		// Variable setting
		case "ASSIGN":

			code += indentString + parseRoot.children.get(0).value + " = "
					+ parseRoot.children.get(1).value + ";\n";

			break;

		// For loop
		case "FOR":

			code += " for (";
			// Get identifier
			String indexIdentifier = parseRoot.children.get(0).children.get(0).value;
			code += " " + indexIdentifier + "; " + indexIdentifier;

			String target = parseRoot.children.get(0).children.get(1).value;

			if (parseRoot.children.get(0).attribute.equals("INCREASING"))
				code += " <= " + target + "; " + indexIdentifier + "++";
			else
				code += " >= " + target + "; " + indexIdentifier + "--";

			code += ")" + leftBrace(indent);

			// Generate the statements
			for (int i = 1; i < parseRoot.children.size(); i++)
				code += generateNode(parseRoot.children.get(i), indent + 1);

			code += rightBrace(indent);

			break;

		// If statement
		case "IF":

			code += indentString + "if"
					+ generateNode(parseRoot.children.get(0), 0)
					+ leftBrace(indent);

			// Generate the statements
			for (int i = 1; i < parseRoot.children.size(); i++)
				code += generateNode(parseRoot.children.get(i), indent + 1);

			code += rightBrace(indent);

			break;

		// Else if statement
		case "ELSEIF":

			code += indentString + "else if"
					+ generateNode(parseRoot.children.get(0), 0)
					+ leftBrace(indent);

			// Generate the statements
			for (int i = 1; i < parseRoot.children.size(); i++)
				code += generateNode(parseRoot.children.get(i), indent + 1);

			code += rightBrace(indent);

			break;

		// Else statement
		case "ELSE":

			code += indentString + "else " + leftBrace(indent);

			// Generate the statements
			for (int i = 0; i < parseRoot.children.size(); i++)
				code += generateNode(parseRoot.children.get(i), indent + 1);

			code += rightBrace(indent);

			break;

		// Print function
		case "PRINT":

			code += indentString + "printf(\"";

			// Need a variable list to determine type
			String variableName = parseRoot.children.get(0).value;
			String variableType = getVariableTypeFromName(variableName);

			if (variableType.equals("int"))
				code += "%d";
			else if (variableType.equals("string"))
				code += "%s";

			code += "\\n\",";

			for (int i = 0; i < parseRoot.children.size(); i++)
				code += generateNode(parseRoot.children.get(i), indent + 1);

			code += ");\n";

			break;

		case "IDENTIFIER":

			code += " " + parseRoot.value;

			break;

		default:

			break;
		}

		return code;
	}

	public static String getTransrealLibrary() {

		StringBuilder sb = new StringBuilder();

		sb.append("#define INF 1\n");
		sb.append("#define NINF 2\n");
		sb.append("#define NULLITY 3\n");

		sb.append("struct _transreal\n");
		sb.append("{\n");
		sb.append("int special_case; //0 = nothing, 1 = -inf, 2 = inf, 3 = nullity\n");
		sb.append("float value;\n");
		sb.append("};\n");

		sb.append("typedef struct _transreal transreal;\n");

		sb.append("void transreal_print(transreal t)\n");
		sb.append("{\n");
		sb.append("if (t.special_case == 0)\n");
		sb.append("printf(\"%f\\n\", t.value);\n");
		sb.append("else if (t.special_case == NINF)\n");
		sb.append("printf(\"-INFINITY\\n\");\n");
		sb.append("else if (t.special_case == INF)\n");
		sb.append("printf(\"INFINITY\\n\");\n");
		sb.append("else if (t.special_case == NULLITY)\n");
		sb.append("printf(\"NULLITY\\n\");\n");
		sb.append("}\n");

		sb.append("transreal get_negative_infinity()\n");
		sb.append("{\n");
		sb.append("transreal t;\n");
		sb.append("t.special_case = NINF;\n");
		sb.append("return t;\n");
		sb.append("}\n");

		sb.append("transreal get_infinity()\n");
		sb.append("{\n");
		sb.append("transreal t;\n");
		sb.append("t.special_case = INF;\n");
		sb.append("return t;\n");
		sb.append("}\n");

		sb.append("transreal get_nullity()\n");
		sb.append("{\n");
		sb.append("transreal t;\n");
		sb.append("t.special_case = NULLITY;\n");
		sb.append("return t;\n");
		sb.append("}\n");

		sb.append("transreal get_value(float v)\n");
		sb.append("{\n");
		sb.append("transreal t;\n");
		sb.append("t.special_case = 0;\n");
		sb.append("t.value = v;\n");
		sb.append("return t;\n");
		sb.append("}\n");

		sb.append("transreal negative(transreal t)\n");
		sb.append("{\n");
		sb.append("if (t.special_case == NULLITY)\n");

		sb.append("return get_nullity();\n");

		sb.append("if (t.special_case == INF)\n");
		sb.append("return get_negative_infinity();\n");

		sb.append("if (t.special_case == NINF)\n");
		sb.append("return get_infinity();\n");

		sb.append("return get_value(-t.value);\n");
		sb.append("}\n");

		sb.append("transreal transreal_add(transreal a, transreal b)\n");
		sb.append("{\n");
		sb.append("//Nullity\n");
		sb.append("if (a.special_case == NULLITY || b.special_case == NULLITY)\n");
		sb.append("return get_nullity();\n");

		sb.append("//+INF + -INF\n");
		sb.append("if ((a.special_case == INF && b.special_case) == NINF ||\n");
		sb.append("(a.special_case == NINF && b.special_case == INF))\n");
		sb.append("return get_nullity();\n");

		sb.append("//INF\n");
		sb.append("if (a.special_case == INF || b.special_case == INF)\n");
		sb.append("return get_infinity();\n");

		sb.append("//NINF\n");
		sb.append("if (a.special_case == NINF || b.special_case == NINF)\n");
		sb.append("return get_negative_infinity();\n");

		sb.append("//Regular\n");
		sb.append("return get_value(a.value + b.value);\n");
		sb.append("}\n");

		sb.append("transreal transreal_sub(transreal a, transreal b)\n");
		sb.append("{\n");
		sb.append("return transreal_add(a, negative(b));\n");
		sb.append("}\n");

		sb.append("transreal transreal_mult(transreal a, transreal b)\n");
		sb.append("{\n");
		sb.append("//Regular numbers\n");
		sb.append("if (a.special_case == 0 && b.special_case == 0)\n");
		sb.append("return get_value(a.value*b.value);\n");

		sb.append("//Zero\n");
		sb.append("if ((a.special_case == 0 && a.value == 0) ||\n");
		sb.append("(b.special_case == 0 && b.value == 0) ||\n");
		sb.append("a.special_case == NULLITY ||\n");
		sb.append("b.special_case == NULLITY)\n");
		sb.append("return get_nullity();\n");

		sb.append("//PINF * NINF\n");
		sb.append("if ((a.special_case == NINF && b.special_case == INF) ||\n");
		sb.append("(a.special_case == INF && b.special_case == NINF))\n");
		sb.append("return get_negative_infinity();\n");

		sb.append("//INF * x\n");
		sb.append("if (a.special_case == INF || b.special_case == INF)\n");
		sb.append("return get_infinity();\n");

		sb.append("//NINF * x\n");
		sb.append("return get_negative_infinity();\n");
		sb.append("}\n");

		sb.append("transreal invert(transreal a)\n");
		sb.append("{\n");
		sb.append("if (a.special_case == 0)\n");
		sb.append("if (a.value == 0)\n");
		sb.append("return get_infinity();\n");
		sb.append("else\n");
		sb.append("return get_value(1/a.value);\n");

		sb.append("if (a.special_case == INF || a.special_case == NINF)\n");
		sb.append("return get_value(0);\n");

		sb.append("return get_nullity();\n");
		sb.append("}\n");

		sb.append("transreal transreal_div(transreal a, transreal b)\n");
		sb.append("{\n");
		sb.append("return transreal_mult(a, invert(b));\n");
		sb.append("}\n");
		
		return sb.toString();
	}
}
