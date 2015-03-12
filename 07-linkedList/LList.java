public class LList{
    private Node l=null;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }

    public String find(int n) {
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

    public void insert(int index, String s) {
	int count = 0;
	Node tmp = l;
        while (count < index && tmp != null) {
	    tmp = tmp.getNext();
	    count++;
	}
	Node n = new Node(s);
	n.setNext(tmp.getNext());
	tmp.setNext(n);
    }
    
    public String toString(){
	String s = "";
	Node tmp;;
	for (tmp=l ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public static void main(String[] args) {
	LList ll = new LList();
	Node n = new Node("Zamansky");
	Node n1 =  new Node("is");
	Node n2 = new Node("teacher");
	System.out.println(ll.find(0));
	ll.insert(2, "is");
	System.out.println(ll);
    }
}
