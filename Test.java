import java.util.logging.Logger;
import java.lang.reflect.Method;
public class Test 
{
	public static void withdraw(int balance,int amount)throws InsufficientBalanceException,WithdrawalException// throws just declares the Exception
	{
		if(amount>balance)
		{
			throw new InsufficientBalanceException("Low Balance");
		}
	}
	public static void main(String args[]) throws ClassNotFoundException
	{
		try {
		try
		{
			withdraw(400,2000);
		}
		catch(InsufficientBalanceException ex)
		{
			System.out.println("==================== Print Stack Trace ==============");
			ex.printStackTrace();
			throw new WithdrawalException("Invalid Withdrawal Request",ex);//wrapping the Insufficient Balance exception with WithdrawalException
		}
		}
		catch(WithdrawalException ex2)
		{
			
			/*
			System.out.println(ex2.getCause());
			System.out.println("==================== Stack Trace ==============");
			StackTraceElement[] stackTraceElement=ex2.getStackTrace();
			System.out.println(	stackTraceElement[0]);
			
			for(StackTraceElement ste:stackTraceElement)
			{
				System.out.println("printing stack trace Elements");
				System.out.println(ste);
			}
			*/
			ex2.printStackTrace();
			
			System.out.println("==================== Schema of the class ==============");
			Class aclass=Class.forName("Test");
		Method[] methods=aclass.getDeclaredMethods();
		for(Method method:methods)
		{
			System.out.println(method);
		}
		}
		finally
		{
			System.out.println("==================== LOGGED info of the class ==============");
			System.out.println("Reached here");
			Logger logger= Logger.getLogger("Test");
			logger.info("log of wood");
			logger.info("Log of one is zero");
			//either use log or throw 
			
			try{
				throw new ArithmeticException("Arithmetic Exception Occured");
			}
			catch (ArithmeticException ex3)
			{
				ex3.printStackTrace();
			}
			
		}
		
		
	}
}