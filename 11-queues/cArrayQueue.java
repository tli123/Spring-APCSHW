import java.util.*;

public class cArrayQueue {

    private Object[] array;
    private int len;

    public cArrayQueue() {
	array = new Object[100];
	len = 0;
    }

    public void enqueue(Object obj) {
	if (len != 100) {
	    array[len] = obj;
	    len++;
	}
    }

    public Object dequeue() {
	if (empty()) {
	    throw new NullPointerException("Empty Queue");
	}
	Object returnthis = array[len];
	array[len] = 0;
	len--;
	return returnthis;
    }

    public boolean empty() {
	return len == 0;
    }

    public Object head() {
	if (empty()) {
	    throw new NullPointerException("Empty Queue");
	}
	return array[0];
    }

    public static void main(String[] args) {
	cArrayQueue c = new cArrayQueue();
	c.enqueue("hi");
	c.enqueue(1);
	c.enqueue(true);
	c.enqueue(0.1);
	c.enqueue('w');
	System.out.println(Arrays.toString(c.array));
	c.dequeue();
	System.out.println(Arrays.toString(c.array));
    }

}
