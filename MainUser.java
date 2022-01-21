public class MainUser
{
	public static void main(String args[])
	{
		Rider rider=new Rider(VehicleType.BIKE);
		System.out.println(rider.vehicle.getName());
		System.out.println(rider.vehicle.getNo());
		System.out.println(rider.vehicle.getPrice());
		rider.vehicle.getService();
	}
}