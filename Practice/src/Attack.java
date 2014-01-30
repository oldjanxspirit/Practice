import java.util.Random;


public class Attack {

	
	int hack()
	{
		Random random = new Random();

		int randomNumber = random.nextInt(10);
		return randomNumber;
	}
	
	public int attack(int health)
	{
		Attack attack = new Attack();
		
		int oldhp;
		
		oldhp = health;
		
		health = health -= attack.hack();
		
		while(health < 0)
		{
			health = oldhp;
			health = health -= attack.hack();
		}
		return health;
	}
}

