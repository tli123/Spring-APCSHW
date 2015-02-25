import java.util.*;
import java.io.*;

public class MakeLake {

    public int[][] lake = new int[4][6];

    public MakeLake() {
	try {
	    Scanner sc = new Scanner(new File("makelake.txt"));
	    int x = 0;
	    while (sc.hasNext()) {
		String s  = sc.nextLine();
		String[] nums = s.split(" ");
		int[] numbers = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
		    numbers[i] = Integer.parseInt(nums[i]);
		}
		lake[x] = numbers;
		x++;
	    }
	} catch (Exception e){}
    }

    public void Stomp(int row, int col, int depth) {
	int r = 0;
	int c = 0;
	if (row + 2 > lake.length) {
	    r += row + 2 - lake.length;
	}
	else {
	    r += 3;
	}
	if (col + 2 > lake.length) {
	    c += col + 2 - lake.length;
	}
	else {
	    c += 3;
	}
	int[] nums = new int[r * c];
	int counter = 0;
	int rcount = 0;
	int ccount = 0;
	for (int i = row - 1; i < lake.length && rcount < r; i++) {
	    for (int j = col - 1; j < lake[i].length && ccount < c; j++) {
		nums[counter] = lake[i][j];
		counter++;
		rcount++;
		ccount++;
	    }
	}
	int maxnum = 0;
	for (int i = 0; i < nums.length; i++) {
	    maxnum = Math.max(maxnum, nums[i]);
	}
	int newdepth = maxnum - depth;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] > newdepth) {
		nums[i] = newdepth;
	    }
	}
	counter = 0;
	rcount = 0;
	ccount = 0;
	for (int i = row - 1; i < lake.length && rcount < r; i++) {
	    for (int j = col - 1; j < lake[i].length && ccount < c; j++) {
		lake[i][j] = nums[counter];
		counter++;
		rcount++;
		ccount++;
	    }
	}
    }

    public void Final(int d) {
	for (int i = 0; i < lake.length; i++) {
	    for (int j = 0; j < lake[i].length; j++) {
		lake[i][j] -= d;
		lake[i][j] *= -1;
		if (lake[i][j] < 0) {
		    lake[i][j] = 0;
		}
	    }
	}
    }

    public int volume() {
	int depth = 0;
	for (int i = 0; i < lake.length; i++) {
	    for (int j = 0; j < lake[i].length; j++) {
		depth += lake[i][j];
	    }
	}
	return 72 * 72 * depth;
    }

    public String toString() {
	String s = "";
	for (int i = 0; i < lake.length; i++) {
	    for (int j = 0; j < lake[i].length; j++) {
		s += lake[i][j] + " ";
	    }
	    s+= "\n";
	}
	return s;
    }

    public static void main(String[] args) {
	MakeLake m = new MakeLake();
	System.out.println(m.toString());
	m.Stomp(1, 4, 4);
	System.out.println(m.toString());
	m.Stomp(1, 1, 10);
	m.Final(22);
	System.out.println(m.toString());
    }

}
