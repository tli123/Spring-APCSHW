public class tree {

    private Node r;

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
	if (t == null) {
	    return ans;
	} else {
	    String ans = "";
	    ans += t + ", ";
	    ans += traverse(t.getLeft()); 
	    ans += traverse(t.getRight())
	}
    }

    public void remove(Node t, int i) {
	Node t2 = search(t, i);
	if (isLeaf(t2) == true) {
	    if (t2.getLeft() == null) {
		t.setRight(t2.getRight());
	    }
	    else {
		t.setLeft(t2.getLeft());
	    }
	}
	else {
	    Node L = t2.getLeft();
	    while (L.getRight() != null) {
		L = L.getRight();
	    }
	    t = L;
	    remove(T.getLeft(), L.getData())
	}
    }

    public boolean isLeaf(Node t) {
	if (t.getLeft() == null && t.getRight() == null) {
	    return false;
	}
	if (t.getLeft() == null || t.getRight() == null) {
	    return true;
	}
	return false;
    }

    public static void main(String[] args) {
    
    }


}
