package compiler;

public class EsperOptimiser {

	public ParseTree optimise(ParseTree root) {
		
		ParseTree optimisedTree = new ParseTree();
		
		for (int i = 0; i < root.children.size(); i++)
			optimisedTree.children.add(optimiseNode(root.children.get(i)));
		
		return optimisedTree;
	}
	
	public ParseTree optimiseNode(ParseTree root) {
		
		return root;
	}

}
