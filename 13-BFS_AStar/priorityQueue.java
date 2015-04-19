public class priorityQueue {

    private int length;
    private Node front, end;

    public priorityQueue() {
	front = null;
	end = front;
	length = 0;
    }

    public void enqueue(Node n) {
	if (front == null) {
	    front = n;
	    end = front;
	} else {
	    Node tmp = front;
	    int i = tmp.getPriority();
	    while (tmp != null && i < n.getPriority()) {
		tmp = tmp.getNext();
		if (tmp != null) {
		    i = tmp.getPriority();
		}
	    }
	    Node previous;
	    if (tmp == null) {
		previous = end;
	    } else {
		previous = tmp.getPrevious();
	    }
	    insert(previous, tmp, n);
	}
	length++;
    }

    public void enqueue(int x, int y, int distance) {
	Node tmp = new Node(x, y, distance);
	enqueue(tmp);
    }

    public Node dequeue() {
	if (!empty()) {
	    Node retNode = front;
	    front = front.getNext();
	    if (front != null) {
		front.setPrevious(null);
	    }
	    retNode.setNext(null);
	    length--;
	    return retNode;
	} else {
	    return null;
	}
    }

     public void insert(Node previous, Node next, Node insert) {
	if (previous == null) {
	    insert.setNext(next);
	    next.setPrevious(insert);
	    front = insert;
	} else if (next == null) {
	    previous.setNext(insert);
	    insert.setPrevious(previous);
	    insert.setNext(next);
	    end = insert;
	} else {
	    previous.setNext(insert);
	    insert.setPrevious(previous);
	    insert.setNext(next);
	    next.setPrevious(insert);
	}
    }

    public boolean empty() {
	return front == null;
    }

    public Node head() {
	return front;
    }

    public int length() {
	return length;
    }

    public String toString() {
	Node tmp = front;
	String s = "";
	while (tmp != null) {
	    s += "(" + tmp.getX() + "," + tmp.getY() + ") ---> ";
	    tmp = tmp.getNext();
	}
	return s;
    }
}
