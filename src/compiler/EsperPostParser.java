package compiler;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public class EsperPostParser {
	
	private ParseTree parseTree;
	public ArrayList<VariableInformation> variableList = new ArrayList<VariableInformation>();
	
	public void getVariableList() {
		getNodeVariableList(parseTree);
	}
	
	private void getNodeVariableList(ParseTree node) {
		
		if (node.attribute.equals("DECLARE"))
			if (!containsVariable(node.children.get(0).value))
				variableList.add(new VariableInformation(node.children.get(0).value, node.children.get(1).value));
		
		//Iterate children
		for (int i = 0; i < node.children.size(); i++)
			getNodeVariableList(node.children.get(i));
	}
	
	/**
	 * If the variable list has a variable with a certain name
	 * @param name The name to check for
	 * @return The existance of the variable
	 */
	private boolean containsVariable(String name) {
		for (VariableInformation var : variableList)
			if (var.name.equals(name))
				return true;
		return false;
	}
	
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
