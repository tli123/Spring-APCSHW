import java.io.*;
import java.util.*;

public class Selection {

    public static int[] partition(int[] L, int start, int end) {
	int[] D = new int[L.length];
	for (int i = 0; i < start; i++) {
	    D[i] = L[i];
	}
	for (int i = end + 1; i < L.length; i++) {
	    D[i] = L[i];
	}
	int pivot = L[start];
	start++;
        int ending = end;
	for (int i = start; i < ending; i++) {
	    if (L[i] < pivot) {
		D[start] = L[i];
		start++;
	    }
	    else if (L[i] > pivot) {
		D[ending] = L[i];
		ending--;
	    }
	}
	D[start] = pivot;
	return D;
    }

    public static void main(String[] args) {
	Selection s = new Selection();
	int[] array = new int[] {10, 3, 7, 8, 2, 9, 4, 6, 1, 5};
	System.out.println(Arrays.toString(partition(array, 0, array.length - 1)));
    }
}
