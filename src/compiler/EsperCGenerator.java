package compiler;

public class EsperCGenerator {
	
	public static String go(ParseTree parseRoot) {
	
		String code = "";
		
		for (int i = 0; i < parseRoot.children.size(); i++) {
			code += generate(parseRoot.children.get(i));
		}
		
		return code;
	}

	public static String generate(ParseTree parseRoot) {
		
		String code = "";
		
		switch (parseRoot.attribute) {
		
		//Arithmetic
		case "PLUS":
		case "MULT":
		case "MINUS":
		case "DIV":
			
			code += " (";
			code += generate(parseRoot.children.get(0));
			
			if (parseRoot.attribute.equals("PLUS"))
				code += " +";
			else if (parseRoot.attribute.equals("MULT"))
				code += " *";
			else if (parseRoot.attribute.equals("MINUS"))
				code += " -";
			else if (parseRoot.attribute.equals("DIV"))
				code += " /";
			
			code += generate(parseRoot.children.get(1));
			code += " )";
			break;
			
		//Condition
		case "LESSTHAN":
		case "GREATERTHAN":
		case "LESSTHANEQUAL":
		case "GREATERTHANEQUAL":
		case "EQUALTO":
		
			code += " (";
			code += generate(parseRoot.children.get(0));
			
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

			code += generate(parseRoot.children.get(1));
			code += ")";
			
			break;
			
		//Number
		case "DIGITS":
			code += " " + parseRoot.value;
			break;
			
		//While loop
		case "WHILE":
			
			code += " while";
			code += generate(parseRoot.children.get(0));
			code += " {";
			
			//Generate the statements
			for (int i = 1; i < parseRoot.children.size(); i++)
				code += generate(parseRoot.children.get(i));
			
			code += " }";
			
			break;
			
		//Variable declaration
		case "DECLARE":
			
			code += " " + parseRoot.children.get(1).value + " " + parseRoot.children.get(0).value + ";";
			
			break;
			
		//Variable setting
		case "ASSIGN":
		
			code += " " + parseRoot.children.get(0).value + " = " + parseRoot.children.get(1).value + ";";
			
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
			
			code += ") {";
			
			//Generate the statements
			for (int i = 1; i < parseRoot.children.size(); i++)
				code += generate(parseRoot.children.get(i));
			
			code += " }";
			
			break;
			
		//Print function
		case "PRINT":
			
			code += " printf(\"";
			
			//Need a variable list to determine type
			
			code += "%s\\n\",";

			for (int i = 0; i < parseRoot.children.size(); i++)
				code += generate(parseRoot.children.get(i));
			
			code += ");";
			
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

