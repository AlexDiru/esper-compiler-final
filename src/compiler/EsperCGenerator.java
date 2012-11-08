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
			
		case "WHILE":
			
			code += " while";
			code += generate(parseRoot.children.get(0));
			code += " {";
			
			//Generate the statements
			for (int i = 1; i < parseRoot.children.size(); i++)
				code += generate(parseRoot.children.get(i));
			
			code += " }";
			
			break;
			
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

