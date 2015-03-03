import java.util.*;
import java.io.*;

public class Mergesort {

    public int[] ArrayList<Integer> Sort(int[] a) {
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
	}
	int[] first = Sort(one);
        int[] second = Sort(two);
	return Merge(first, second);
    }

    public int[] Merge(int[] a, int[] b) {
        int[] ans = new int[a.length + b.length];
	int acount = 0;
	int bcount = 0;
	while (acount < a.size() && bcount < b.size()) {
	    if (a.get(acount) < b.get(bcount)) {
		ans.add(a.get(acount));
		acount++;
	    }
	    else {
		ans.add(b.get(bcount));
		bcount++;
	    }
	}
	if (acount < a.size()) {
	    for (int i = acount; i < a.size(); i++) {
		ans.add(a.get(i));
	    }
	}
	else {
	    for (int i = bcount; i < b.size(); i++) {
		ans.add(b.get(i));
	    }
	}
	return ans;

    }
    public static void main(String[] args) {
	Mergesort s = new Mergesort();
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(4);
	a.add(1);
	a.add(3);
	a.add(0);
	a.add(10);
	a.add(3);
	a.add(6);
	a.add(8);
	a.add(4);
	System.out.println(s.Sort(a));
    }
}
