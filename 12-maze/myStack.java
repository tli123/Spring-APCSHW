public class myStack<E> {

    private Node<E> current;

    public myStack() {
	current = new Node<E>();
    }

    public void push(E data) {
	Node<E> tmp = new Node<E>(data);
	current.setNext(tmp);
	tmp.setPrevious(current);
	current = tmp;
    }

    public E pop() {
	Node<E> tmp = current;
	Node<E> next = current.getPrevious();
	current = next;
	current.setNext(null);
	return tmp.getData();
    }

    public boolean empty() {
	return current.getPrevious() == null;
    }

    public E top() {
	return current.getData();
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
