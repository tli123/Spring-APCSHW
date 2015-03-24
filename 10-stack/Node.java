public class Node<E>{
	private E data;
	private Node<E> next, prev;

	public Node(){
		data = null;
		next = null;
		prev = null;
	}
	public Node(E s){
		data = s;
		next = null;
		prev = null	
	}
	public void setData(E s){
		data = s;
	}
	public E getData(){
		return data;
	}
	public void setNext(Node<E> n){
		next = n;
	}
	public Node<E> getNext(){
		return next;
	}
    	public void setPrev(Node<E> n){
		prev = n;
    	}
    	public Node<E> getPrev(){
		return prev;
    	}
		public String toString(){
				return ""+data;
		}
}
