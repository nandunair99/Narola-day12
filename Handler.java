import java.sql.Connection;
import java.sql.DriverManager;
public class Handler
{
	public static void main(String args[]) throws Exception
	{
		/*try(Connection con =DriverManager.getConnection())
		{
			System.out.println("Entered the Scope");
		}*/
		
		try{
			throw new Exception();
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException ex)//parent class of some exception cannot be used alternate exception eg. Exception cannot be an alternative Exception
		{
			if(ex instanceof ArithmeticException)
			{
				System.out.println("Arithmetic Exception");
			}
			if(ex instanceof ArrayIndexOutOfBoundsException)
			{
				System.out.println("Array Index Out Of Bounds Exception");
			}
			
		}
		catch(Exception ex)
		{
			System.out.println("general Exception");
		}
		finally
		{
			System.out.println("Finally came here");
		}
		
	}
}
