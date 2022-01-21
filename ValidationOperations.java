import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ValidationOperations
{
	/*
	public void getValidUsers(ArrayList<Person> list,CheckPerson tester)
	{
		for(Person p:list)
		{
			if(tester.test(p))
				System.out.println(p.toString());
		}
	}*/
	/*
	public void getValidUsers(ArrayList<Person> list, Predicate<Person> tester)
	{
		for(Person p:list)
		{
			if(tester.test(p))
				System.out.println(p.toString());
		}
	}

	 */
	/*
	public void getValidUsers(ArrayList<Person> list, Predicate<Person> tester, Consumer<Person> accepter)
	{
		for(Person p:list)
		{
			if(tester.test(p))
				accepter.accept(p);

		}
	}

	 */

	/*
	public void getValidUsers(ArrayList<Person> list, Predicate<Person> tester, Consumer<Person> accepter, Function<Person,String> applier)
	{
		for(Person p:list)
		{
			if(tester.test(p))
			{

				accepter.accept(p);
				System.out.println(applier.apply(p));
			}


		}
	}

	 */
	public void getValidUsers(ArrayList<Person> list, Predicate<Person> tester, Consumer<Person> accepter, Function<Person,String> applier,Predicate<Person> tester2)
	{
		for(Person p:list)
		{
			if(tester.test(p))
			{
				if(tester2.test(p))
				{
					accepter.accept(p);
					System.out.println(applier.apply(p));
				}

			}


		}
	}
}
