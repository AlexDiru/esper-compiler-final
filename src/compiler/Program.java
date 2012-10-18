package compiler;

public class Program {

	public static String successOrFailure(boolean b) {
		if (b)
			return "Success";
		return "Failure";
	}
	
	public static void main(String[] args) {

		//Command line arguments
		for (String arg : args) {
			System.out.println(arg);
		}
		
		EsperCompiler compiler = new EsperCompiler("a=3+2a=5");
		System.out.println("Compiled!");
		System.out.println("Lexer status: " + successOrFailure(compiler.lexerSuccess) + " | Errors: " + compiler.lexerErrors);
		System.out.println("Parser status: " + successOrFailure(compiler.parserSuccess) + " | Errors: " + compiler.parserErrors);
	}

}
