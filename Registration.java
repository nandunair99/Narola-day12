import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Registration
{
	public static void main(String args[])
	{
		Person p1=new Person(1,"nandu", LocalDate.of(1999,07,21));
		Person p2=new Person(2,"manu",LocalDate.of(2006,05,6));
		Person p3=new Person(3,"maya",LocalDate.of(1973,10,3));
		Person p4=new Person(4,"unni",LocalDate.of(1970,11,29));
		
		ArrayList<Person> list=new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

		ValidationOperations valOps=new ValidationOperations();
		//method1
		//valOps.getValidUsers(list,new CheckByAge());

		//method2
		/*
		valOps.getValidUsers(list, new CheckPerson() {
			@Override
			public boolean test(Person p) {
				if(p.getAge()>6 && p.getAge() <24)//test body
					return true;
				else
					return false;
			}
		});

		 */
		/*
		valOps.getValidUsers(list, p-> {  //implementing test method of functional interface
				if(p.getAge()>6 && p.getAge() <24)//test body
					return true;
				else
					return false;

		});

		 */
//------------------------------------------------------------
		//method1
		/*
		valOps.getValidUsers(list, new Predicate<Person>() {
					@Override
					public boolean test(Person p) {
						if (p.getAge() > 6 && p.getAge() < 24)//test body
							return true;
						else
							return false;
					}
				},
				new Consumer<Person>() {
					@Override
					public void accept(Person person) {
						System.out.println(person.toString());
					}
				});
		//method2
		valOps.getValidUsers(list,  p-> {
						if (p.getAge() > 6 && p.getAge() < 24)
							return true;
						else
							return false;

				},
				p->System.out.println(p.toString())
		);

		 */
		//-------------------------------------------
		//method1
		/*
		valOps.getValidUsers(list, new Predicate<Person>() {
					@Override
					public boolean test(Person p) {
						if (p.getAge() > 6 && p.getAge() < 24)//test body
							return true;
						else
							return false;
					}
				},
				new Consumer<Person>() {
					@Override
					public void accept(Person person) {
						System.out.println(person.name);
					}
				},
				new Function<Person, String>() {
					@Override
					public String apply(Person person) {
						return String.valueOf(person.getAge());
					}
				});

		 */

		//method2
		/*
		valOps.getValidUsers(list,p-> {
						if (p.getAge() > 6 && p.getAge() < 24)//test body
							return true;
						else
							return false;

				},
				person->System.out.println(person.name),//accept body
				person->{return String.valueOf(person.getAge());});//apply body

		 */
		//------------------------------------------
		//method1
		/*
		valOps.getValidUsers(list, new Predicate<Person>() {
					@Override
					public boolean test(Person p) {
						if (p.getAge() > 6 && p.getAge() < 24)//test body
							return true;
						else
							return false;
					}
				},
				new Consumer<Person>() {
					@Override
					public void accept(Person person) {
						System.out.println(person.name);
					}
				},
				new Function<Person, String>() {
					@Override
					public String apply(Person person) {
						return String.valueOf(person.getAge());
					}
				},
				new Predicate<Person>() {
					@Override
					public boolean test(Person person) {
						if(person.name.startsWith("m"))return true;
						else
							return false;
					}
				});

		 */
		//method2
		valOps.getValidUsers(list,
				p->{ if(p.getAge() > 6 && p.getAge() < 24)//test body
						return true;
					else
						return false;},
				p->System.out.println(p.name),
				p->{return String.valueOf(p.getAge());},
				p->{
					if(p.name.startsWith("m"))return true;
					else return false;

				});


	}
}