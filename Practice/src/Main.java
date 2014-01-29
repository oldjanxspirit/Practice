
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Foo ernie = new Foo();
		Foo2 bert = new Foo2();
		Attack hack = new Attack();
	
		int limit = 10;
		int rounds = 0;
			
		int erniehp = ernie.hp;
		int berthp  = bert.hp;
	
		while((erniehp  > 0) && (berthp > 0) )
		{
			int oldberthp;
			int olderniehp;
			
			System.out.println("Round Number:" + (rounds += 1));
			
			oldberthp = berthp;
			olderniehp = erniehp;
			
			berthp = berthp -= hack.hack();
			erniehp = erniehp -= hack.hack();
			
			while(berthp < 0)
			{
				berthp = oldberthp;
				berthp = berthp -= hack.hack();
			}
			while(erniehp < 0)
			{
				erniehp = olderniehp;
				erniehp = erniehp -= hack.hack();
			}

			System.out.println("Heath of ernie: " + erniehp);
			System.out.println("Heath of bert: " + berthp);	
		
			if (erniehp > berthp)
				System.out.println("ernie wins");
			else
				System.out.println("bert wins");
			
			if(erniehp <= 0)
			{
				System.out.println("Ernie is dead");
				break;
			}
			if(berthp <= 0)
			{
				System.out.println("Bert is dead");
				break;
			}
			
			System.out.println("");	
		}

	}


}
