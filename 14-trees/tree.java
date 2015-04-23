public class tree {

    public Node root;

    public tree(int i) {
	root = new Node(i);
    }

    public void insert(Node n, int i) {
	t = root;
	while (t != null) {
	    t2 = t;
	    if (t2.getData() != i) {
		if (t2.getData() < i) {
		    t2 = t2.getLeft();
		}
		else {
		    t2 = t2.getRight();
		}
	    }
	    else {
		break;
	    }
	}
	/* Insertion here */
	n = new Node(i);
    }

    public Node search(Node t, int i) {
	t = root;
	while (t != null) {
	    int c = T.getData().compareTo(i);
	    if (c == 0) {
		return T;
	    }
	    else if (c > 0) {
		T = T.getRight();
	    }
	    else {
		T = T.getLeft();
	    }
	}
    }

    public static void main(String[] args) {
    
    }


}
