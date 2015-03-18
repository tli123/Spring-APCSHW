public class LListDummy {

    private Node l = null;
    private Node dummy;
    private int len = 0;

    public void add(int n){
	Node tmp = new Node(n);
	tmp.setNext(l);
	l = tmp;
	len++;
    }

    public int get(int index) {
	if (index > size() - 1) {
	    throw new IndexOutOfBoundsException("Invalid Index");
	}
	Node tmp = l;
	for (int i = 0; i < size(); i++) {
	    if (i == index) {
		return tmp.getData();
	    }
	    tmp = tmp.getNext();
	}
	return -1;
    }
    
    public void add(int index, int num) {
	if (index > size() - 1) {
	    throw new IndexOutOfBoundsException("Invalid Index");
	}
	Node tmp = l;
	for (int i = 0; i < size(); i++) {
	    if (i == index) {
		break;
	    }
	    tmp = tmp.getNext();
	}
	if (index == size() - 1) {
	    System.out.println("added dummy");
	    add(dummy.getData());
	}
	Node n = new Node(num);
	n.setNext(tmp.getNext());
	tmp.setNext(n);
	len++;
    }
    
    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l ; tmp != null ; tmp = tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
    /*
    public void remove(int index) {
    }

    public boolean removev2(int n) {
    }

    public int sum() {
    }

    */

    public int size() {
	return len;
    }


    public static void main(String[] args) {
	LListDummy ll = new LListDummy();
	ll.add(1);
	ll.add(2);
	ll.add(3);
	ll.add(4);
	ll.add(5);
	System.out.println(ll);
	System.out.println(ll.get(2));
	ll.add(3, 9);
	System.out.println(ll);
	ll.add(5, 10);
	System.out.println(ll);
	System.out.println(ll.get(3));
	System.out.println(ll.get(4));
    }
}
