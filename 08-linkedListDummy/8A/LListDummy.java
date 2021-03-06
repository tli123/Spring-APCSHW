public class LListDummy {

    private Node l = null;
    private Node dummy = new Node("");
    private int len = 0;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
	len++;
    }

    public String get(int n) {
	int count = 0;
	Node tmp = l;
	while (tmp != null) {
	    if (count == n) {
		return tmp.getData();
	    }
	    tmp = tmp.getNext();
	    count++;
	}
	return "";
    }

    public void add(int index, String s) {
	int count = 0;
	Node tmp = l;
        while (count - 1 < index) {
	    tmp = tmp.getNext();
	    count++;
	}
	if (index == len - 2) {
	    tmp.getNext().setNext(dummy);
	}
	Node n = new Node(s);
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

    public String remove(int index) {
	int count = 0;
	Node tmp = l;
        while (count - 1 < index) {
	    tmp = tmp.getNext();
	    count++;
	}
	if (index == len - 2) {
	    tmp.getNext().setNext(dummy);
	}
	String s = tmp.getNext().getData();
	tmp.setNext(tmp.getNext().getNext());
	len--;
	return s;
    }

    public static void main(String[] args) {
	LListDummy ll = new LListDummy();
	ll.add("computer");
	ll.add("laptop");
	ll.add("hi");
	ll.add("yay");
	System.out.println(ll);
	System.out.println(ll.remove(2));
	ll.add(1, "great");
	ll.get(1);
	System.out.println(ll);
    }
}
