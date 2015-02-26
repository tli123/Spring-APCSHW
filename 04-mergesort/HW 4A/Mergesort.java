import java.util.*;
import java.io.*;

public class Mergesort {

    public ArrayList<Integer> Sort(ArrayList<Integer> a) {
	ArrayList<Integer> one = new ArrayList<Integer>();
	ArrayList<Integer> two = new ArrayList<Integer>();
	for (int i = 0; i < a.size() / 2; i++) {
	    one.add(a.get(i));
	}
	for (int i = 0; i < a.size() / 2; i++) {
	    two.add(a.get(i));
	}
	return Merge(Sort(one), Sort(two));
    }

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
