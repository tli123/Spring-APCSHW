public class KnightsTour {


    public int[][] board;
    public boolean solved = false;
    public int move = 1;

    public KnightsTour(int row, int col) {
	board = new int[row][col];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
	        board[i][j] = 0;
	    }
	}
    }

    public String toString() {
	String grid = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		grid += board[i][j] + " ";
	    }
	    grid += "\n";
	}
	return grid;
    }

    public void HoldUp(int n) {
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }

    public boolean checker() {
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
	        if (board[i][j] <= 0) {
		    return false;
		}
	    }
	}
	return true;
    }

    public boolean solve(int x, int y) {
	solve(x+1, y+2);
	solve(x+1, y-2);
	solve(x-1, y+2);
	solve(x-1, y-2);
	solve(x+2, y+1);
	solve(x+2, y-1);
	solve(x-2, y+1);
	solve(x-2, y-1);
    }

    public static void main(String[] args) {
	KnightsTour tour = new KnightsTour(10, 10);
	System.out.println(tour.toString());
	tour.solve(1,0);
	System.out.println("The solution to this Knights Tour is\n" + tour.toString());
    }

}
