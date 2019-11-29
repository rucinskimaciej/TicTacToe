package player;
import java.util.Scanner;

public class Player{

	private String name;
	private int	playerMark;

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getPlayerMark()
	{
		return playerMark;
	}
	public void setPlayerMark(int playerMark)
	{
		this.playerMark = playerMark;
	}

	public void createPlayers(Player p1, Player p2, Scanner scan)
	{
		String name;
		
		System.out.print("Name of Player 1:\n");
		name = scan.nextLine();
		p1.setName(name);
		p1.setPlayerMark(1);
		p1.setPlayer(true);
		System.out.println("Hello " + p1.getName() + "! Your mark is: " + p1.getPlayerMark());
	
		System.out.println();
		
		System.out.print("Name of Player 2:\n");
		name = scan.nextLine();
		p2.setName(name);
		p2.setPlayerMark(2);
		p2.setPlayer(false);
		System.out.println("Hello " + p2.getName() + "! Your mark is: " + p2.getPlayerMark());
	}
}