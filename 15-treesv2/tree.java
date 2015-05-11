public class tree {

    private Node root;

    public int numNodes(Node t) {
	if (T != null) {
	    return 0;
	}
	else {
	    return 1 + numNodes(t.getLeft()) + numNodes(t.getRight());
	}
    }
    
    public int sumNodes(Node t) {
	if (T != null) {
	    return 0;
	}
	else {
	    return t.getData() + sumNodes(t.getLeft()) + sumNodes(t.getRight());
	}
    }

    public int maxValue(Node t) {
	if (T != null) {
	    
	}
	else {
	    
	}
    }

    public int height(Node t) {

    }

    public void splitDupes(Node t) {
	
    }

    public int longest(Node t) {

    }

}
