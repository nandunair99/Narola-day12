import pack.Ganit;
public class MathDemo
{
	public static void main(String args[])
	{
		
		Operation op=new Operation();
		/*
		op.adds(new Ganit()//anonymous class
		{
			public int jod(int n1,int n2)
			{
				return n1+n2;
			}
		},3,1);
		*/
		op.adds(((n1,n2)->{return n1+n2;}),1,2);//passing lambda expression as argument to function i.e. passing functiona as argument
		op.adds(((n1,n2)->{return Integer.sum(n1,n2);}),2,2);//passing lambda expression as argument to function
		//here i can pass any no. of implemetations that returns integer value which is the major advantage of functional Interface
		
		// as function takes Functional Interface as input
	}
}