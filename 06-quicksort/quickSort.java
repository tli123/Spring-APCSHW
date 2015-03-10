import java.util.*;
import java.io.*;

public class quickSort{

    private int[] a,b;
    Random rnd = new Random();

    public quickSort(){
	this(20);
    }

    public quickSort(int n){
	Random r = new Random();
	a = new int[n];
	for (int i = 0; i < a.length; i++) {
	    a[i] = r.nextInt(100);
	}
    }

    public String toString(){
	return Arrays.toString(a);
    }

    public int partition(int[] a, int l, int r) {
	int tmp;
	//int pivotIndex = l+rnd.nextInt(r-l);
	int pivotIndex=l;
	int pivot = a[pivotIndex];
	tmp = a[r];
	a[r] = a[pivotIndex];
	a[pivotIndex]=tmp;
				
	int wall=l;
	int pcount=1;
	for (int i=l;i<r;i++) {
	    if (a[i]<pivot) {
		tmp = a[i];
		a[i]=a[wall];
		a[wall]=tmp;
		wall++;
	    }
	    if (a[i]==pivot)
		pcount++;
	}
	// now copy over all the pivots
	int rwall=wall;
	tmp = a[rwall];
	a[wall]=a[r];
	a[r]=tmp;
	rwall++;
	for (int i=rwall+1;i<=r;i++) {
	    if (a[i]==pivot) {
		tmp = a[rwall];
		a[rwall]=a[i];
		a[i]=tmp;
		rwall++;
	    }
	}
	return (wall+rwall)/2;
    }		
		
    public int qselect(int[] a, int k, int l, int h){
	int pi,pval;
	pi = partition(a,l,h);
	pval = a[pi];
	if (k==pi)
	    return pval;
	else if (k > pi)
	    return qselect(a,k,pi+1,h);
	else
	    return qselect(a,k,l,pi-1);
    }

    public int[] sort(int[] A, int low, int high) {
	if (low < high) {
	    int pivotIndex = partition(A, low, high);
	    sort(A, low, pivotIndex - 1);
	    sort(A, pivotIndex + 1, high);
	}
	return A;
    }
		
    public int select(int k){
	b = Arrays.copyOf(a,a.length);
	return qselect(b,k,0,b.length-1);
    }
		
    public static void main(String[] args) {
        quickSort q = new quickSort();
	System.out.println(q);
	for (int i=0;i<5;i++) {
	    System.out.print(q.select(i)+" ");
	}
	System.out.println();
	q.sort(q.a, 0, q.a.length - 1);
	System.out.println(q);

    }
}
