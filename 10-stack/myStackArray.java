import java.util.*;
import java.io.*;

public class myStackArray {

    private Object[] array;

    public myStackArray() {
	array = new Object[0];
    }

    public void push(Object data){
        Object[] newArray = new Object[array.length + 1];
	newArray[0] = data;
	for (int i = 0; i < array.length; i++) {
	    newArray[i+1] = array[i];
	}
	array = newArray;
    }

    public Object pop(){
        if (empty() == true) {
	    throw new IndexOutOfBoundsException("Empty Stack!");
	}
	Object[] newArray = new Object[array.length - 1];
	for (int i = 1; i < array.length; i++) {
	    newArray[i-1] = array[i];
	}
	Object returnthis = array[0];
	array = newArray;
	return returnthis;
    }

    public boolean empty(){
	return array.length == 0;
    }

    public Object top() {
        return array[0];
    }

    public static void main(String[] args) {
	myStackArray a = new myStackArray();
	a.push(1);
	a.push(2);
	a.push("hello");
	a.push(true);
	System.out.println(Arrays.toString(a.array));
	System.out.println(a.pop());
	System.out.println(a.top());
	System.out.println(a.empty());
    }

}
