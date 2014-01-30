
public class Fight {
	
	public int fight() 
	{
		// TODO Auto-generated method stub
		
		Foo p1 = new Foo();
		Foo2 p2 = new Foo2();
		Attack attack = new Attack();
		Results results = new Results();
		
		int rounds = 0;
		String player1 = "ernie";
		String player2 = "bert";
			
		int p1hp = p1.hp;
		int p2hp  = p2.hp;
	
		while((p1hp  > 0) && (p2hp > 0) )
		{
			
			System.out.println("Round Number:" + (rounds += 1));
			
			p1hp = attack.attack(p1hp);
			p2hp = attack.attack(p2hp);
			
			results.health(player1, p1hp, player2, p2hp);
			results.winner(player1,p1hp,player2,p2hp);
			results.dead(player1,p1hp,player2,p2hp);
			
			System.out.println("");	
		}
		
		return rounds;
	}

}
