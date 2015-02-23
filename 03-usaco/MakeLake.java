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
		x++;
	    }
	} catch (Exception e){}
    }

}
