import java.util.*;
import java.io.*;

public class MergesortArray {

    public int[] Sort(int[] a) {
	if (a.length <= 1) {
	    return a;
	}
	int[] one = new int[a.length/2];
	int[] two = new int[a.length - a.length/2];
	for (int i = 0; i < a.length / 2; i++) {
	    one[i] = a[i];
	}
	int counter = 0;
	for (int i = a.length/2; i < a.length; i++) {
	    two[counter] = a[i];
	    counter++;
	}
	int[] first = Sort(one);
        int[] second = Sort(two);
	return Merge(first, second);
    }

    public int[] Merge(int[] a, int[] b) {
        int[] ans = new int[a.length + b.length];
	int acount = 0;
	int bcount = 0;
	int counter = 0;
	while (acount < a.length && bcount < b.length) {
	    if (a[acount] < b[bcount]) {
		ans[counter] = a[acount];
		counter++;
		acount++;
	    }
	    else {
		ans[counter] = b[bcount];
		counter++;
		bcount++;
	    }
	}
	if (acount < a.length) {
	    for (int i = acount; i < a.length; i++) {
		ans[counter] = a[i];
		counter++;
	    }
	}
	else {
	    for (int i = bcount; i < b.length; i++) {
		ans[counter] = b[i];
		counter++;
	    }
	}
	return ans;
    }
    public static void main(String[] args) {
	MergesortArray s = new MergesortArray();
        int[] a = new int[]{1, 3, 4, 2, 1, 2, 3, 10, 12, 34, 12, 11, 10, 32, 12, 123, 23, 21}; 
	System.out.println(Arrays.toString(s.Sort(a)));
    }
}
