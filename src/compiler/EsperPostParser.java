package compiler;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public class EsperPostParser {
	
	private ParseTree parseTree;
	
	public ParseTree getParseTree(CommonTree ast) {
		
		parseTree = new ParseTree();
		parseTree.value = ast.getText();
		parseTree.attribute = EsperCompiler.getTokenName(Integer.parseInt(Integer.toString(ast.getType())));

		for (int i = 0; i < ast.getChildCount(); i++) {
			parseTree.children.add(read(ast.getChild(i)));
		}
		
		return parseTree;
	}
	
	private ParseTree read(Tree ast) {

		ParseTree parent = new ParseTree();
		parent.value = ast.toString();
		parent.attribute = EsperCompiler.getTokenName(Integer.parseInt(Integer.toString(ast.getType())));
		
		for (int i = 0; i < ast.getChildCount(); i++) {
			parent.children.add(read(ast.getChild(i)));
		}
		
		return parent;
	}
	
}
