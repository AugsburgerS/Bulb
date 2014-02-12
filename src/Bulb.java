
public class Bulb
{
	private final static int DEFAULT_POWER = 100;
	private boolean isLit;
	private final int power;
	
	public Bulb()
	{
		power = DEFAULT_POWER;
		isLit = false;
	}
	public Bulb(int getPower)
	{
		power = getPower;
		isLit = false;
	}
	
	public void switchOn()
	{
		isLit = true;
	}
	public void switchOff()
	{
		isLit = false;	
	}
	public int getPower()
	{
		return power;
	}
	public boolean isLit()
	{
		return isLit; 
	}
	
}
