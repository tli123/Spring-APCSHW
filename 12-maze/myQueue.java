public class myQueue {

    private Node front, back = null;

    public void enqueue(int xCor, int yCor) {
	Node tmp = new Node(xCor, yCor);
	if (empty()) {
	    front = tmp;
	    back = tmp;
	} else {
	    back.setNext(tmp);
	    back = tmp;
	}
	tmp.setProcessed(false);
    }

    public String dequeue() {
	if (empty()) {
	    throw new NullPointerException();
	}
	String retVal = head();
	front = front.getNext();
	if (front == null) {
	    back == null;
	}
	return retval;	
    }

    public String head() {
	return "xCor: " + front.getX() + "; yCor: " + front.getY();
    }

    public boolean empty() {
	return back == null;
    }

}
