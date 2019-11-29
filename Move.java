package player;
import player.*;
import board.*;
import game.Gameplay;
import java.util.Scanner;

public class Move{

	private final int min = 0, max = 2;


	public void cycle(Player p1, Player p2, Board board, int[][]playBoard, Scanner scan, Gameplay winner)
	{
		while (winner.getWinner() == null)
		{
			
			playerCycle(p1, board, playBoard, scan, winner);
			playerCycle(p2, board, playBoard, scan, winner);
			
			// make(p1, board, playBoard, scan);
			// winner.isWinner(playBoard, p1, p2);
			// make(p2, board, playBoard, scan);
			// winner.isWinner(playBoard, p1, p2);
			// if (winner.getWinner() == p1 || winner.getWinner() == p2)
			// {	
				// board.printBoard(playBoard);
				// System.out.println("\n" + winner.getWinner().getName() + " wins!");
			// }	
		}
	}

	public void playerCycle(Player player, Board board, int[][]playBoard, Scanner scan, Gameplay winner)
	{
		make(player, board, playBoard, scan);
		winner.winCheck(player, board, playBoard);
	}
		
	public void make(Player player, Board board, int[][] playBoard, Scanner scan)
	{	
		while(true)
		{
			board.printBoard(playBoard);
			System.out.println(player.getName() + ", your move:");
			System.out.print("Row> ");
			int row = scan.nextInt() - 1;
			System.out.print("Column> ");
			int column = scan.nextInt() - 1;
			System.out.println();
		
			if (row >= min && row <= max && column >= min && column <= max)	
			{
				if(playBoard[row][column] == 0)
				{	
					playBoard[row][column] = player.getPlayerMark();
					break;
				}
				else
					System.out.println("This spot is already taken. Try somewhere else.\n");
			}
			else
				System.out.println("Value out of range (1, 2, 3) - try again.\n");
		} 
	}
}