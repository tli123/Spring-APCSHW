public class myStack {

    private Node current;

    public myStack() {
	current = new Node();
    }

    public void push(int xCor, int yCor) {
	Node tmp = new Node(xCor, yCor);
	tmp.setProcessed(false);
	current.setNext(tmp);
	tmp.setPrevious(current);
	current = tmp;
    }

    public String pop() {
	Node tmp = current;
	Node next = current.getPrevious();
	current = next;
	current.setNext(null);
	return "xCor: " + tmp.getX(); + "; yCor: " + tmp.getY;
    }

    public boolean empty() {
	return current.getPrevious() == null;
    }

    public String top() {
	return "xCor: " + current.getX(); + "; yCor: " + current.getY;
    }

    public String toString() {
	String s = "";
	Node<E> tmp = current;
	while (tmp.getPrevious() != null) {
	    s += tmp.getData() + " --> ";
	    tmp = tmp.getPrevious();
	}
	return s;
    }
    
}
