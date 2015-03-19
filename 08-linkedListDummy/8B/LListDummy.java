import java.util.*;
import java.io.*;

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

    public boolean remove(int index) {
	boolean found = false;
	if (index > size() - 1) {
	    throw new IndexOutOfBoundsException("Invalid Index");
	}
	Node tmp = l;
	for (int i = 0; i < size(); i++) {
	    if (i == index) {
		found = true;
		break;
	    }
	    tmp = tmp.getNext();
	}
	if (found = true) {
	    tmp.setNext(tmp.getNext().getNext());
	}
	return found;
    }

    public int sum() {
	int sum = 0;
	for (int i = 0; i < size(); i++) {
	    sum += get(i);
	}
	return sum;
    }


    public int size() {
	return len;
    }


    public static void main(String[] args) {
	LListDummy ll = new LListDummy();
        LinkedList<Integer> l = new LinkedList<Integer>();
	ArrayList<Integer> nums = new ArrayList<Integer>();
	Random r = new Random();
	long start;
	for (int i = 0; i < 10000; i++) {
	    int num = r.nextInt();
	    ll.add(num);
	    l.add(num);
	    nums.add(num);
	}
	start = System.currentTimeMillis();
	int lldsum = ll.sum();
	System.out.println("Written LinkedList sum: " + lldsum);
	System.out. println("Time: " + (System.currentTimeMillis() - start));
	int llsum = 0;
        start = System.currentTimeMillis();
	for (int i = 0; i < l.size(); i++) {
	    llsum += l.get(i);
	}
	System.out.println("Built-in LinkedList sum: " + llsum);
	System.out.println("Time: " + (System.currentTimeMillis() - start));
	int alsum = 0;
        start = System.currentTimeMillis();
        for (int i = 0; i < nums.size(); i++) {
	    alsum += nums.get(i);
	}
	System.out.println("ArrayList sum: " + alsum);
	System.out. println("Time: " + (System.currentTimeMillis() - start));
    }

    /*
      The written LinkedList took much longer than the built-in version.
      However, the ArrayList sum took the fastest.
    */
}
