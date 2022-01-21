import pack.Employee;
import pack.Address;
import java.util.Comparatable;
public class Register
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.firstname="nandu";
		e1.lastname="nair";
		Address a1=new Address();
		a1.street="ramnagar";
		a1.city="surat";
		a1.pincode="395009";
		e1.address=a1;
		
		System.out.println("E1:"+e1.firstname+" "+e1.lastname+" "+e1.address.street+" "+e1.address.city+" "+e1.address.pincode);
		try
		{
		
			Employee e2=e1.clone();
			
			System.out.println("E2:"+e2.firstname+" "+e2.lastname+" "+e2.address.street+" "+e2.address.city+" "+e2.address.pincode);
			e1.firstname="nandu";
			e1.address.street="Palanpur";
			System.out.println("After changing e1"); 
			System.out.println("E1:"+e1.firstname+" "+e1.lastname+" "+e1.address.street+" "+e1.address.city+" "+e1.address.pincode);
			System.out.println("E2:"+e2.firstname+" "+e2.lastname+" "+e2.address.street+" "+e2.address.city+" "+e2.address.pincode);
			
			System.out.println(e1.hashCode()+" "+e2.hashCode());
			System.out.println(e1.equals(e2));
			System.out.println(e1); //this invokes the toString method of Employee class
			String country="India";
			System.out.println(country);//this invokes toString method of String 
			
			
			String str1="hello";
			String str2=" world";
			System.out.println(str1.substring(0,4));
			
			System.out.println(e1.firstname.compareTo(e2.firstname));
			System.out.println(e1.equals(e2));
			
		}
		catch (CloneNotSupportedException e)
		{
			System.out.println(e);
		}
		
		
	}
}
