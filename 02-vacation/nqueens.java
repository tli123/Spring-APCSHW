import java.util.*;
import java.io.*;

public class nqueens {

    public int[] board;
    public int side;
    
    public nqueens(int size) {
	board = new int[size];
	side = size;
    }

    public boolean check(int col, int numQueens) {
	for (int i = 0; i < numQueens; i++) {
	    if (board[i] == col) {
		return false;
	    }
	    if (Math.abs(board[i] - col) == Math.abs(i - numQueens)) {
		return false;
	    }
	}
	return true;
    }

    public void placeQueens(int numQueens) {
	if (numQueens == side) {
	    System.out.println(printBoard());
	    delay(150);
	} else {
	    for (int i = 0; i < side; i++) {
		if (check(i, numQueens) == true) {
		    board[numQueens] = i;
		    placeQueens(numQueens + 1);
		}
	    }
	}
    }

    public void delay(int n) {
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }

    public String printBoard() {
	String ans = "";
	for (int i = 0; i < side; i++) {
	    for (int j = 0; j < board[i]; j++) {
		ans += " * ";
	    }
	    ans += " Q ";
	    for (int k = board[i] + 1; k < side; k++) {
		ans += " * ";
	    }
	    ans += "\n\n";
	}
	return ans;
    }

    public static void main(String[] args) {
	nqueens q = new nqueens(8);
	q.placeQueens(0);
    }
}
