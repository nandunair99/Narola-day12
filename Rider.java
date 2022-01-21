import java.util.Scanner;
public class Rider
{
			
		Vehicle vehicle;
		public Rider(VehicleType t)
		{
			if(t==(VehicleType.BIKE))
				vehicle=new Bike();
			if(t==(VehicleType.CAR))
				vehicle=new Car();
		}
		public static void main(String args[])
		{}
		
		
		

}