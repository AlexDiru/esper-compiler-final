package compiler;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public class EsperPostParser {
	
	private ParseTree parseTree;
	
	/**
	 * Converts ANTLRs CommonTree to a ParseTree to aid code generation
	 * @param ast The syntax tree output from the parser
	 * @return The root node of the parse tree
	 */
	public ParseTree getParseTree(CommonTree ast) {
		
		parseTree = new ParseTree();
		
		//Add the root node
		parseTree.value = ast.getText();
		parseTree.attribute = EsperCompiler.getTokenName(Integer.parseInt(Integer.toString(ast.getType())));

		//Add the children
		for (int i = 0; i < ast.getChildCount(); i++)
			parseTree.children.add(convertNode(ast.getChild(i)));
		
		return parseTree;
	}
	
	/**
	 * Converts a node (and it's children) to a parse tree
	 * @param ast The node to convert
	 * @return The root of the parse tree generated from the node
	 */
	private ParseTree convertNode(Tree ast) {

		ParseTree parent = new ParseTree();
		parent.value = ast.toString();
		parent.attribute = EsperCompiler.getTokenName(Integer.parseInt(Integer.toString(ast.getType())));
		
		for (int i = 0; i < ast.getChildCount(); i++) {
			parent.children.add(convertNode(ast.getChild(i)));
		}
		
		return parent;
	}
	
}
