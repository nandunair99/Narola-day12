public abstract class Vehicle
{

	public String vehicleNo;
	public String name;
	public long price;
	public void start()
	{
		System.out.println("Vehicle started");
	}	
	public void stop()
	{
		System.out.println("Vehicle stopped");
	}
	public String getNo()
	{
		return this.vehicleNo;
	}
	public String getName()
	{
		return this.name;
	}
	public long getPrice()
	{
		return this.price;
	}
	abstract void getService();
	
}