public class myStack<E> {

    private Node<E> dummy = new Node<E>();
    private Node<E> top;

    public myStack() {
	top = new Node<E>();
    }

    public void push(E data) {
	Node<E> tmp = dummy;
	while (tmp != null) {
	    tmp = tmp.getNext();
	}
	Node<E> n = new Node<E>(data);
	n.setNext(tmp.getNext());
	tmp.setNext(n);
    }

    /*
    public E pop() {
	
    }

    public boolean empty() {
	
    }

    */

    public E top() {
	return top.getData();
    }

    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = dummy ; tmp != null ; tmp = tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public static void main(String[] args) {

    }

}
