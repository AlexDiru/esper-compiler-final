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
	 * @param indent The number of tabs to indent with
	 * @return The string with the left brace
	 */
	private static String leftBrace(int indent) {
		return "\n" + getIndentString(indent) + "{\n";
	}
	
	/**
	 * Generates the right brace with the required indentation
	 * @param indent The number of tabs to indent with
	 * @return The string with the right brace
	 */
	private static String rightBrace(int indent) {
		return getIndentString(indent) + "}\n";
	}
	
	/**
	 * Gets the string with the correct number of indentations
	 * @param indent The number of indentations
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
	 * @param parseRoot The root node of the tree to parse
	 * @param tvariableList The list of variables in the code
	 * @return The generated C code
	 */
	public static String generate(ParseTree parseRoot, ArrayList<VariableInformation> tvariableList) {
	
		variableList = tvariableList;
		
		String code = "#include <stdio.h>\nint main() \n{\n";
		
		for (int i = 0; i < parseRoot.children.size(); i++) {
			code += generateNode(parseRoot.children.get(i), 1);
		}
		
		return code + "}\n";
	}

	/**
	 * Generates C code for the given node
	 * @param parseRoot The node to generate the code for
	 * @param indent The number of indents
	 * @return The C code
	 */
	private static String generateNode(ParseTree parseRoot, int indent) {
		
		String indentString = getIndentString(indent);
		
		String code = "";
		
		switch (parseRoot.attribute) {
		
		//Arithmetic
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
			
		//Condition
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
			
		//Number
		case "DIGITS":
			code += " " + parseRoot.value;
			break;
			
		//While loop
		case "WHILE":
			
			code += " while";
			code += generateNode(parseRoot.children.get(0), 0);
			code += leftBrace(indent);
			
			//Generate the statements
			for (int i = 1; i < parseRoot.children.size(); i++)
				code += generateNode(parseRoot.children.get(i), indent + 1);
			
			code += rightBrace(indent);
			
			break;
			
		//Variable declaration
		case "DECLARE":
			
			code += indentString + parseRoot.children.get(1).value + " " + parseRoot.children.get(0).value + ";\n";
			
			break;
			
		//Variable setting
		case "ASSIGN":
		
			code += indentString + parseRoot.children.get(0).value + " = " + parseRoot.children.get(1).value + ";\n";
			
			break;
			
		//For loop
		case "FOR":
			
			code += " for (";
			//Get identifier
			String indexIdentifier = parseRoot.children.get(0).children.get(0).value;
			code += " " + indexIdentifier + "; " + indexIdentifier;
			
			String target = parseRoot.children.get(0).children.get(1).value;
			
			if (parseRoot.children.get(0).attribute.equals("INCREASING"))
				code += " <= " + target + "; " + indexIdentifier + "++";
			else
				code += " >= " + target + "; " + indexIdentifier + "--";
			
			code += ")" + leftBrace(indent);
			
			//Generate the statements
			for (int i = 1; i < parseRoot.children.size(); i++)
				code += generateNode(parseRoot.children.get(i), indent + 1);
			
			code += rightBrace(indent);
			
			break;
			
		//If statement
		case "IF":
			
			code += indentString + "if" + generateNode(parseRoot.children.get(0), 0) + leftBrace(indent);
			
			//Generate the statements
			for (int i = 1; i < parseRoot.children.size(); i++)
				code += generateNode(parseRoot.children.get(i), indent + 1);
			
			code += rightBrace(indent);
			
			break;
			
		//Else if statement
		case "ELSEIF":
			
			code += indentString + "else if" + generateNode(parseRoot.children.get(0), 0) + leftBrace(indent);
			
			//Generate the statements
			for (int i = 1; i < parseRoot.children.size(); i++)
				code += generateNode(parseRoot.children.get(i), indent + 1);
			
			code += rightBrace(indent);
			
			break;
			
		//Else statement
		case "ELSE":
			
			code += indentString + "else " + leftBrace(indent);
			
			//Generate the statements
			for (int i = 0; i < parseRoot.children.size(); i++)
				code += generateNode(parseRoot.children.get(i), indent + 1);
			
			code += rightBrace(indent);
			
			break;
			
			
		//Print function
		case "PRINT":
			
			code += indentString + "printf(\"";
			
			//Need a variable list to determine type
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
}

