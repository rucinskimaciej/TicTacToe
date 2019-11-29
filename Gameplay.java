package game;
import player.*;
import board.Board;

public class Gameplay{

	private Player winner;
	
	public Player getWinner()
	{
		return winner;
	}

	public Player isWinner(int[][] board, Player player)
	{
		
		int[][] winOption = 
		{
			{board[0][0], board[0][1], board[0][2]},
			{board[1][0], board[1][1], board[1][2]},
			{board[2][0], board[2][1], board[2][2]},
			{board[0][0], board[1][0], board[2][0]},
			{board[0][1], board[1][1], board[2][1]},
			{board[0][2], board[1][2], board[2][2]},
			{board[0][0], board[1][1], board[2][2]},
			{board[0][2], board[1][1], board[2][0]}
		};
		
		for (int i=0; i < winOption.length; i++)
		{
			if (winOption[i][1] != 0 && winOption[i][0] == winOption[i][1] && winOption[i][1] == winOption[i][2])
				if (winOption[i][1] == player.getPlayerMark())
					winner = player;
		}

		return winner;
	}

	public void winCheck(Player player, Board board, int[][] playBoard)
	{
		isWinner(playBoard, player);
		if (getWinner() == player)
		{	
			board.printBoard(playBoard);
			System.out.println("\n" + getWinner().getName() + " wins!");
		}	

	}

}