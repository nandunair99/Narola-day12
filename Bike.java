public class Bike extends Vehicle
{
	public Bike()
	{
		this.vehicleNo="GJ 05 JC 1763";
		this.name="Bullet 350";
		this.price=170000;
	}
	
	public void openStand()
	{
		System.out.println("The side stand is opening");
	}
	public void getService()
	{
		System.out.println("The chain cleaning is done here");
	}
}