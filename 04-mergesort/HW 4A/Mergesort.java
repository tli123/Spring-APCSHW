import java.util.*;
import java.io.*;

public class Mergesort {

    public ArrayList<Integer> Merge(ArrayList<Integer> a, ArrayList<Integer> b) {
	ArrayList<Integer> ans = new ArrayList<Integer>();
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
	ArrayList<Integer> b = new ArrayList<Integer>();
	a.add(2);
	a.add(4);
	a.add(7);
	a.add(10);
	b.add(3);
	b.add(6);
	b.add(6);
	b.add(7);
	b.add(17);
	System.out.println(s.Merge(a, b));
    }
}
