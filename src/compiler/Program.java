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
		
		EsperCompiler compiler = new EsperCompiler("asd=3;  b=2;");
		System.out.println("Compiled!");
		System.out.println("Lexer status: " + successOrFailure(compiler.lexerSuccess));
		System.out.println("Parser status: " + successOrFailure(compiler.parserSuccess));
	}

}
