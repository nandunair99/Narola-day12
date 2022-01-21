import java.time.LocalDate;

public class Person
{
	public int no;
	public String name;
	public LocalDate dob;
	
	public int getAge()
	{
		return (LocalDate.now().getYear())-(dob.getYear());
	}
	public Person(int no,String name,LocalDate dob)
	{
		this.no=no;
		this.name=name;
		this.dob=dob;
	}
	public String toString()
	{
		return "Person: "+no+" "+name+" "+dob.toString();
	}
	
}