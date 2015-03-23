import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E> {
    private Node<E> t;
    private Node<E> previous;

    public LLit(Node<E> n){
	t=n;
	p = null;
    }

    public void setPrevious(E p) {
	previous = p;
    }
    
    public Node<E> getPrevious() {
	return previous;
    }

    public boolean hasNext(){
	return t!=null;
    }

    public E next(){
	E retval = t.getData();
	setPrevious(retval);
	t=t.getNext();
	previous.setNext(t);
	return retval;
    }

    public void remove(){
	if (previous != null) {
	    previous.setNext(t.getData());
	}
    }
}

