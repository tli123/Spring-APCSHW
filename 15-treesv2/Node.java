public class Node {

    private Node left;
    private Node right;
    private int data;

    public Node(int data) {
	left = null;
	right = null;
	this.data = data;
    }

    public Node() {
	this(0);
    }

    public void setData(int i) {
	data = i;
    }

    public int getData() {
	return data;
    }

    public void setLeft(Node n) {
	left = n;
    }

    public void setRight(Node n) {
	right = n;
    }

    public Node getLeft() {
	return left;
    }
    
    public Node getRight() {
	return right;
    }
}
