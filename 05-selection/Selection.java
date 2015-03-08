import java.io.*;
import java.util.*;

public class Selection {

    public static Object select(int[] A, int k, int low, int high) {
	try {
	    int pivot = A[k];
	    A = swap(A, k, high);
	    int Li = low;
	    int Hi = high - 1;
	    while (Li != Hi) {
		if (A[Li] < pivot) {
		    Li++;
		}
		else if (A[Li] > pivot) {
		    A = swap(A, Li, Hi);
		    Hi--;
		}
	    }
	    int pivotIndex;
	    if (pivot > A[Li]) {
		pivotIndex = Li + 1;
	    }
	    else {
		pivotIndex = Li;
	    }
	    for (int i = high; i > pivotIndex; i--) {
	        A = swap(A, i, i-1);
	    }
	    A[pivotIndex] = pivot;
	    if (pivotIndex > k) {
		return select(A, k, 0, pivotIndex - 1);
	    }
	    else if (pivotIndex < k) {
		return select(A, k, pivotIndex + 1, A.length - 1);
	    }
	    else if (pivotIndex == k) {
		return A[k];
	    }
	} catch(Exception e) {}
	return "You inputted a negative number";
    }
	
    public static int[] swap(int[] array, int first, int second) {
	int tmp = array[first];
	array[first] = array[second];
	array[second] = tmp;
	return array;
    }

    public static void main(String[] args) {
	Selection s = new Selection();
	int[] array = new int[]{1, 9, 2, 10, 0, 7, 6, 8, 3, 5, 4};
	System.out.println(select(array, 8, 0, array.length - 1));
    }
}
