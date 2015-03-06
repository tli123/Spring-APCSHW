import java.io.*;
import java.util.*;

public class Selection {

    public int partition(int[] A, int k, int low, int high) {
	int pivot = A[k];
	int temp = A[high];
	A[high] = pivot;
	A[k] = temp;
	int Li = low;
	int Hi = high - 1;
	while (Li < Hi) {
	    if (A[Li] < pivot) {
		Li++;
	    }
	    if (A[Li] > pivot) {
		int tmp = A[Li];
		A[Li] = A[Hi];
		A[Hi] = tmp;
		Hi--;
	    }
	}
	//shift pivot into where hi and low converge
    }

    public int Select(int[] A, int k, int l, int h) {

    }

    public static void main(String[] args) {
	Selection s = new Selection();

    }
}
