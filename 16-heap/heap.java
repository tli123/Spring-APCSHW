import java.io.*;
import java.util.*;

public class heap {

    private int[] heaparray;
    
    public heap() {
	this(20);
    }

    public heap(int n) {
	heaparray = new int[n];
	for (int i = 0; i < n; i++) {
	    Random r = new Random();
	    heaparray[n] = r.nextInt(n);
	}
    }

    public void sort() {

    }

}
