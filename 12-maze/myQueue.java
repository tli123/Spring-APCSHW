public class myQueue<E> {

    private Node<E> front, back = null;

    public void enqueue(E data) {
	Node<E> tmp = new Node<E>(data);
	if (empty()) {
	    front = tmp;
	    back = tmp;
	} else {
	    back.setNext(tmp);
	    back = tmp;
	}
    }

    public E dequeue() {
	if (empty()) {
	    throw new NullPointerException();
	}
	E retval = head();
	front = front.getNext();
	if (front == null) {
	    back == null;
	}
	return retval;	
    }

    public E head() {
	return front.getData();
    }

    public boolean empty() {
	return back == null;
    }

}
