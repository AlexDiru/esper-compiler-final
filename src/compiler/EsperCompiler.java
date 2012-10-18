package compiler;

import java.lang.reflect.Field;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import antlrGenerated.EsperLexer;
import antlrGenerated.EsperParser;

public class EsperCompiler {

	// Used when printing the syntax tree
	private static String depth = ">";

	public boolean lexerSuccess = false;
	public int lexerErrors = 0;
	public boolean parserSuccess = false;
	public int parserErrors = 0;

	// http://www.antlr.org/wiki/pages/viewpage.action?pageId=789
	public EsperCompiler(String sourceCode, boolean print) {

		// Strip whitespace, tabs - both are irrelevant
		sourceCode = sourceCode.replace("\n", "").replace("\r", "")
				.replace("\t", "");

		// Lexical analysis
		EsperLexer lexer = new EsperLexer(new ANTLRStringStream(sourceCode));
		lexerSuccess = (lexerErrors = lexer.getNumberOfSyntaxErrors()) <= 0;

		// Parser
		EsperParser parser = new EsperParser(new CommonTokenStream(lexer));
		EsperParser.program_return ret;
		try {
			ret = parser.program();
		} catch (RecognitionException e) {
			System.out.println("Exception occurred in parser!");
			e.printStackTrace();
			return;
		}
		parserSuccess = (parserErrors = parser.getNumberOfSyntaxErrors()) <= 0;

		// Acquire parse result
		CommonTree ast = (CommonTree) ret.getTree();

		if (print) {
			// Print Lexical Output
			System.out.println("Lexer output: ");
			Token token;
			lexer = new EsperLexer(new ANTLRStringStream(sourceCode));
			while ((token = lexer.nextToken()).getType() != -1) {
				// Ignore whitespace
				if (token.getType() != EsperLexer.WHITESPACE)
					System.out.println("Token: " + token.getText() + " | "
							+ getTokenName(token.getType()));
			}
			
			try {
			// Print parser output
			System.out.println("Parser output: ");
			printTree2(ast,0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// Uses reflection to get the token names from their types
	private static String getTokenName(int tokenType) {
		// Get all the fields of the lexical analyser - will be the token type
		// variables
		Field[] fields = EsperLexer.class.getFields();

		// Iterate through the fields
		for (Field field : fields) {
			if (field.getType() == int.class) {
				try {
					// If the field matches the token type then that field is
					// the token
					if (field.getInt(null) == tokenType) {
						return field.getName();
					}
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}

		return "UNKNOWN TOKEN";
	}
	
	private void printTree2(CommonTree ast, int indent) { 
		if (ast != null) {
			String indentstr = "";
			for (int i = 0; i < indent; i++)
				indentstr += " ";
			for (int i = 0; i < ast.getChildCount(); i++) {
				System.out.println(indentstr + ast.getChild(i).toString());
				printTree2((CommonTree)ast.getChild(i), indent+1);
			}
				
		}
	}

	private void printTree(CommonTree ast) {

		try {
			System.out.println(depth + " " + ast.getText() + " | "
					+ getTokenName(ast.getToken().getType()));
		} catch (Exception ex) {
			System.out.println(depth + " root");
		}

		if (ast.getChildren() != null) {
			depth += ">";
			for (Object child : ast.getChildren()) {
				printTree((CommonTree) child);
			}
			depth = depth.substring(depth.length() - 1);
		}

	}

}