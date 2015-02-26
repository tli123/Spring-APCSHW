import java.util.*;
import java.io.*;

public class MergesortArray {

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
        int[] a = new int[]{3, 4, 17, 23, 44, 100, 111};
	int[] b = new int[]{0, 2, 3, 4, 5, 6, 7, 10, 11, 14, 17, 19};
	System.out.println(Arrays.toString(s.Merge(a, b)));
    }
}
