public class Node {

    private int xCor, yCor;    
    private Node next;
    private boolean processed;

    public Node(int x, int y) {
	xCor = x;
	yCor = y;
	next = null;
	processed = false;
    }

    public void setNext(Node n) {
	next = n;
    }

    public Node getNext() {
	return next;
    }

    public int getX() {
	return xCor;
    }
    
    public int getY() {
	return yCor;
    }

    public boolean getProcessed() {
	return processed;
    }

    public void setProcessed(boolean b) {
	processed = b;
    }
