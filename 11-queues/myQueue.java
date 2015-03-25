public class myQueue<E>{
    private Node<E> head;

    public myQueue() {
	head = new Node<E>();
    }
    
    public void enqueue(E data){
	Node<E> tmp = new Node<E>(data);
        tmp.setNext(head);
	head = tmp;
    }

    public E dequeue(){
	if (empty() == true) {
	    throw new NullPointerException();
	}
        Node<E> tmp = head;
	head = tmp.getNext();
	head.setPrevious(null);
	return tmp.getData();
    }

    public boolean empty(){
	return head.getNext().getData() == null;
    }

    public E head() {
        return head.getData();
    }

    public String toString(){
	String s = "null --> ";
	Node tmp;
	for (tmp = head; tmp != null && tmp.getData() != null; tmp = tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s += "null";
	return s;
    }

    public static void main(String[] args) {
	myQueue<String> s = new myQueue<String>();
	s.enqueue("hi");
	s.enqueue("hello");
	s.enqueue("ni hao");
	s.enqueue("hola");
	System.out.println(s.toString());
	s.dequeue();
	System.out.println(s.toString());
    }

}
