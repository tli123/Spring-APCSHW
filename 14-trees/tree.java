public class tree {

    priavte Node r;

    public Node Search(Node t, int i) {
	if (t == null || t.getData() == i) {
	    return t;
	}
	else if (t.getData() > i) {
	    Search(t.getRight(), i);
	}
	else if (t.getData() < i) {
	    Search(t.getLeft(), i);
	}
    }

    public void insert(int i) {
	Node n = new Node(i);
	Node t2 = null;
	Node t = r;
	if (r == null) {
	    r = n;
	    return;
	}
	while (t != null) {
	    t2 = t;
	    if (t.getData() == i) {
		return;
	    }
	    else if (t.getData() > i) {
		t = t.getRight();
	    }
	    else if (t.getData() < i) {
		t = t.getLeft();
	    }
	}
	if (i > t2.getData()) {
	    t2.setRight(n);
	}
	else {
	    t2.setLeft(n);
	}
    }


    public String traverse(Node t) {
	while (t != null) {
	    ans += t + ", ";
	    return traverse(t.getLeft()) + traverse(t.getRight())
	}
    }

    public static void main(String[] args) {
    
    }


}
