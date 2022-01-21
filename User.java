import java.io.IOException;
import java.io.InputStream;
public class User
{
	public String name;
	public String age;
	
	public static void main(String args[])
	{
		System.out.println(System.getenv("username")); //prints the environment variables
		System.out.println("=================================================================");
		System.out.println(System.getProperty("java.vendor"));
		try{
			Process process=Runtime.getRuntime().exec("notepad.exe",null);//Executes any command line argument
			ThreadClass t1=new ThreadClass();
			//Runtime is a Singleton thread
			Runtime.getRuntime().addShutdownHook(new ThreadClass());//Runs the thread one last time before shutting down the process
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
		
	}
}