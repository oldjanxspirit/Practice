
public class Average 
{


	
	
	public void averagerounds(int totalrounds)
	{
		Fight fight = new Fight();
		int total = 0;
		int count = 0;
		int newvalue = 0;
		double mean = 0;
	
		for(int i = 0; i <= totalrounds; i++)
		{
			newvalue = fight.fight();
			total += newvalue;
			count += 1;
			mean = (newvalue + total) / (double)count;
		
		}
	String meanout = String.format("%.3f", mean);	
	System.out.println("For " + totalrounds + " fights, average number of rounds until death: " + meanout);
	}
	
	public void averagehpplayer()
	{
		
	}
	
}
