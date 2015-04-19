public class Node {

    private Node next, previous, back;
    private int priority, steps, distance, x, y;

    public Node() {
	this(0, 0, 0, 0);
    }

    public Node(int x, int y, int distance) {
	this(x, y, 0, distance);
    }

    public Node(int x, int y, int steps, int distance) {
	this.x = x;
	this.y = y;
	this.steps = steps;
	next = null;
	back = null;
	this.distance = distance;
	priority = steps + distance;
    }

    public Node getNext() {
	return next;
    }

    public void setNext(Node n) {
	next = n;
    }

    public Node getPrevious() {
	return previous;
    }

    public void setPrevious(Node n) {
	previous = n;
    }
	
    public Node getBack() {
	return back;
    }
    
    public void setBack(Node n) {
	back = n;
    }
    
    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }

    public int getPriority() {
	return priority;
    }

    public int getSteps() {
	return steps;
    }

}
