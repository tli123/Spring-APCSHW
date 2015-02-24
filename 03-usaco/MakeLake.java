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

    public void Stomp(int r, int c, int d) {
	int arraylen;
	boolean ispast = false;
	if (r + 2 > lake.length) {
	    arraylen = r+2 - lake.length;
	    isrpast = true;
	}
	if (c + 2 > lake.length) {
	    arraylen = c+2 - lake.length;
	    ispast = true;
	}	
	else if (ispast == false){
	    arraylen = 9;
	}
	int[] nums = new int[arraylen];
	int counter = 0;
	for (int i = r-1; i < lake.length; i++) {
	    for (int j = c-1; j < lake.length; j++) {
		nums[counter] = lake[i][j];
		counter++;
	    }
	}
	int maxnum = 0;
	for (int i = 0; i < nums.length; i++) {
	    maxnum = Math.max(maxnum, nums[i]);
	}
	int newdepth = maxnum - d;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == maxnum) {
		nums[i] -= d;
	    }
	}
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] > newdepth) {
		nums[i] = newdepth;
	    }
	}
	int count = 0;
	for (int i = r; i < lake.length; i++) {
	    for (int j = c; j < lake.length; j++) {
		lake[i][j] = nums[count];
		count++;
	    }
	}
	
    }

    public void Final(int d) {
	
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
	System.out.println(m.toString());
    }

}
