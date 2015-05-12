import java.util.*;
import java.io.*;

public class tree {

    private Node root;

    public tree() {
	root = null;
    }

    public tree(Node n) {
	root = n;
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

    public int numNodes(Node t) {
	if (T != null) {
	    return 0;
	} else {
	    return 1 + numNodes(t.getLeft()) + numNodes(t.getRight());
	}
    }
    
    public int sumNodes(Node t) {
	if (t != null) {
	    return 0;
	} else {
	    return t.getData() + sumNodes(t.getLeft()) + sumNodes(t.getRight());
	}
    }

    /*
    public boolean isChild(Node t) {
	if (t.getNext() == null) {
	    return true;
	}
	return false;
    }
    */

    public int maxValue(Node t) {
        if (t.getNext() == null) {
	    return t.getData();
	} else {
	    return Math.max(maxValue(t.getLeft()), maxValue(t.getRight());
	}
    }

    public int height(Node t) {
	if (t != null) {
	    return 0;
	} else {
	    return 1 + Math.max(height(t.getLeft()) + height(t.getRight()));
	}
    }

    public void splitDupes(Node t) {
        if (t != null) {
	    if (t.getData() == t.getLeft().getData()) {
	        Node after = t.getLeft();
		t.setLeft(new Node(t.getData() - 1));
		t.getLeft().setLeft(after);
	    } else if (t.getData() == t.getRight().getData()) {
		Node after = t.getRight();
		t.setRight(new Node(t.getData() - 1));
		t.getLeft().setLeft(after);
	    }
	    splitDupes(t.getLeft());
	    splitDupes(t.getRight());
	}
	
    }

    public int longest(Node t) {
	if (t == null) {
	    return 0;
	}
	else {
	    int r = 1 + height(t.getLeft()) + height(t.getRight());
	    int left = longest(t.getLeft());
	    int right = longest(t.getRight());
	    return Math.max(r, left, right);
	}

    public static void main(String[] args) {
	tree t = new tree(23);
	t.setLeft(22);
	t.setRight(24);
	t.getLeft().setLeft(21);
	t.getRight().setRight(25);
	t.getLeft().getLeft().setLeft(20);
	t.getRight().getRight().setRight(26);
	t.getLeft().getLeft().setRight(21);
	t.getRight()getRight().setLeft()(25);
	System.out.println(t.longest(t));
	System.out.println(t.splitDupes(t));
	System.out.println(t.maxValue(t));
	System.out.println(t.height(t));
	
    }

}
