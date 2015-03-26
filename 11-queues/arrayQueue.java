import java.util.*;

public class arrayQueue {

    private Object[] array;
    private int len;

    public arrayQueue() {
	array = Object[0];
	len = 0;
    }

    public void enqueue(Object obj) {
	Object[] newarray = new Object[len + 1];
	for (int i = 0; i < len; i++) {
	    array[i] = newarray[i];
	}
	newarray[len] = obj;
	array = newarray;
	len++;
    }

    public Object dequeue() {
	if (!empty()) {
	    Object[] newarray = new Object[len - 1];
	    for (int i = 0; i < len - 1; i++) {
		array[i] = newarray[i];
	    }
	    Object returnthis = array[len - 1];
	    array = newarray;
	    len--;
	    return returnthis;
	}
	return null;
    }

    public boolean empty() {
	return len == 0;
    }

    public Object head() {
	if (!empty()) {
	    return array[0];
	}
    }

    public static void main(String[] args) {
	arrayQueue c = new arrayQueue();
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
