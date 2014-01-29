
public class Results {
	
	public void winner(String player1, int p1hp, String player2, int p2hp)
	{
		if (p1hp > p2hp)
			System.out.println(player1 +" wins");
		else
			System.out.println(player2 + " wins");
	}
	
	public void health(String player1, int p1hp, String player2, int p2hp)
	{
		System.out.println("Heath of " + player1 + ": " + p1hp);
		System.out.println("Heath of " + player2 + ": " + p2hp);
	}
	
	public void dead(String player1, int p1hp, String player2, int p2hp)
	{
		if(p1hp <= 0)
		{
			System.out.println(player1 + " is dead");
		}
		if(p2hp <= 0)
		{
			System.out.println(player2 + " is dead");
		}
		
	}
}
