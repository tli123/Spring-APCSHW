public class KnightsTour {

    public Object[][] board;
    public char knight = 'k';
    public boolean solved = false;
    public int move = 1;

    public KnightsTour(int size) {
	board = new Object[size][size];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j] = -1;
	    }
	}
    }

    public KnightsTour() {
	this(8);
    }

    public void HoldUp(int n) {
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }

    public boolean check() {
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		if (board[x][y] == -1) {
		    return false;
		}
	    }
	}
	return true;
    }

    public String toString() {
	String ans = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		ans+=board[i][j]+ " ";
	    }
	    ans += "\n";
	}
	return ans;
    }

    public void solve(int x, int y) {
	try {
	    if (solved) {
		return;
	    }
	    if (check() = true) {
		solved = true;
	    }
	    if (!solved) {
		HoldUp(100);
		System.out.println(this.toString());
		board[x][y] = knight;
		solve(x+2, y+1);
		solve(x+2, y-1);
		solve(x-2, y-1);
		solve(x-2, y+1);
		solve(x+1, y-2);
		solve(x-1, y-2);
		solve(x+1, y+2);
		solve(x-1, y+2);
		if (!solved) {
		    board[x][y] = move;
		    move++;
		}
	    }

	} catch (Exception e) {}
    }

    public static void main(String[] args) {
	KnightsTour kn = new KnightsTour(10);
	System.out.println(kn.toString());
	kn.solve(0,0);
	System.out.println(kn.toString());
    }

}
