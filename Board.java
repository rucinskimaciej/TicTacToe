package board;

public class Board{
		
	public int[][] makeBoard()
	{
		int[][] board = new int[3][3];
		return board;
	}
	
	public void printBoard(int[][] board)
	{
		
		System.out.println();
		
		System.out.println("    1 | 2 | 3 ");
		System.out.println("=============");
		System.out.println("1 | " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("  | " + "---------");
		System.out.println("2 | " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("  | " + "---------");
		System.out.println("3 | " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
		
		System.out.println();
	}
}