
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Foo ernie = new Foo();
		Foo2 bert = new Foo2();
		Attack attack = new Attack();
		Results results = new Results();
		
		int rounds = 0;
		String player1 = "ernie";
		String player2 = "bert";
			
		int p1hp = ernie.hp;
		int p2hp  = bert.hp;
	
		while((p1hp  > 0) && (p2hp > 0) )
		{
			int oldp2hp;
			int oldp1hp;
			
			System.out.println("Round Number:" + (rounds += 1));
			
			oldp2hp = p2hp;
			oldp1hp = p1hp;
			
			p2hp = p2hp -= attack.hack();
			p1hp = p1hp -= attack.hack();
			
			while(p2hp < 0)
			{
				p2hp = oldp2hp;
				p2hp = p2hp -= attack.hack();
			}
			while(p1hp < 0)
			{
				p1hp = oldp1hp;
				p1hp = p1hp -= attack.hack();
			}
		
			results.health(player1, p1hp, player2, p2hp);
			results.winner(player1,p1hp,player2,p2hp);
			results.dead(player1,p1hp,player2,p2hp);
			
			System.out.println("");	
		}

	}


}
