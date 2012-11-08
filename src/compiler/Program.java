package compiler;

public class Program {

	public static String successOrFailure(boolean b) {
		if (b)
			return "Success";
		return "Failure";
	}

	// Runs tests for the grammar, all should pass
	public static void test() {
		String[] testCode = new String[] { "if eq a b set a b endif",
				"set a b", "set b 5", "declare a int set a 5" };

		for (String code : testCode) {
			EsperCompiler compiler = new EsperCompiler(code, false);
			if (!compiler.lexerSuccess || !compiler.parserSuccess) {
				System.out.println("Failed test: ");
				System.out.println(code);
			}
		}
	}

	public static void main(String[] args) {

		// Command line arguments
		for (String arg : args) {
			System.out.println(arg);
		}

		// test();

		//String code =
		 //"declare a int if eq a b if eq a b print * b / 7 - a 1 set a - b 1 endif set b + 3 2 elseif lt a b set a 2 else set a 3 endif set a + 8 7 declare s str print \"hullo\"";
		//String code = "for from a 3\n print a\n print b\n endfor";
		String code = "while lte 1 1 print a endwhile";
		EsperCompiler compiler = new EsperCompiler(code, true);
		System.out.println("Compiled!");
		System.out.println("Lexer status: "
				+ successOrFailure(compiler.lexerSuccess) + " | Errors: "
				+ compiler.lexerErrors);
		System.out.println("Parser status: "
				+ successOrFailure(compiler.parserSuccess) + " | Errors: "
				+ compiler.parserErrors);
	}

}
