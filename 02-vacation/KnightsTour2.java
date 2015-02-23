public class KnightsTour2 {

    public int[][] board;
    public int move;
    public int spaces;
    public int[][] moves = new int[][]{{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}};
    
    public KnightsTour2(int row, int col) {
	board = new int[row][col];
	spaces = row*col;
	move = 0;
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

    public boolean tour(int x, int y) {
	board[x][y] = move;
	move++;
	if (move == spaces) {
	    return true;
	}
	int count = 0;
	while (count < 8) {
	    int row = x + moves[count][0];
	    int col = y + moves[count][1];
	    if (row < 0 || row >= board.length) {
		continue;
	    }	
	    else if (col < 0 || col >= board[0].length) {
		continue;
	    }
	    else if (board[x][y] == 0) {
		continue;
	    }
	    if (tour(row, col)) {
		count ++;
		return true;
	    }
	}
	System.out.println(this.toString());
	board[x][y] = 0;
	move--;
	return false;
    }

    public static void main(String[] args) {
	KnightsTour2 tour = new KnightsTour2(10, 10);
	tour.tour(0, 1);
    }
}
