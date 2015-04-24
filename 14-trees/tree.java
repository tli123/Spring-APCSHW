public class tree {

    public Node root;

    public tree(int i) {
	root = new Node(i);
    }

    public void insert(Node n, int i) {
	Node t = root;
	while (t != null) {
	    if (t.getData() != i) {
		if (t.getData() < i) {
		    t = t.getLeft();
		}
		else {
		    t = t.getRight();
		}
	    }
	}
	n = new Node(i);
	if (t.getData() > i) {
	    t.setLeft(n);
	}
	else {
	    t.setRight(n);
	}
    }

    public Node search(Node t, int i) {
	t = root;
	while (t != null) {
	    int c = t.getData().compareTo(i);
	    if (c == 0) {
		return t;
	    }
	    else if (c > 0) {
		t = t.getRight();
	    }
	    else {
		t = t.getLeft();
	    }
	}
	return null;
    }

    public static void main(String[] args) {
    
    }


}
