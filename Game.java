package game;
import board.Board;
import player.*;
import java.util.Scanner;

public class GameApplication{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Move move = new Move();
		Gameplay winner = new Gameplay();

		Board board = new Board();
		int[][] playBoard = board.makeBoard();

		Player master = new Player();
		Player p1 = new Player();
		Player p2 = new Player();
		
		master.createPlayers(p1, p2, scan);

		move.cycle(p1, p2, board, playBoard, scan, winner);
		
		scan.close();
	}
}