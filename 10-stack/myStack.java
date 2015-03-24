public class myStack<E> {

    private Node<E> top;

    public myStack() {
	top = new Node<E>();
    }

    public void push(E data) {
	Node<E> tmp = new Node<E>(data);
	tmp.setPrevious(top);
	top.setNext(tmp);
	top = tmp;
    }

    
    public E pop() {
	Node<E> tmp = top;
	top = tmp.getPrevious();
	top.setNext(null);
	return tmp.getData();
    }

    public boolean empty() {
	return top.getData() == null;
    }

    public E top() {
	return top.getData();
    }

    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = top; tmp != null && tmp.getData() != null; tmp = tmp.getPrevious()){
	    s = s + tmp + " --> ";
	}
	s += "null";
	return s;
    }

}
