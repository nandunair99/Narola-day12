import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.function.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class SimpleMain
{
	 
	public static void main(String args[])
	{
		
		List<String> list=new ArrayList<String>();
		list.add("Nandu");
		list.add("Manu");
		list.add("maya");
		list.add("unni");
		final List<String> uppercaseNames = new ArrayList<String>(); 
		
		System.out.println("Implementing accept method of Consumer Interface");
		list.forEach(new Consumer<String>() {
        @Override
        public void accept(String name) {
            System.out.println(name);
        }
    });
		
		list.forEach(name->uppercaseNames.add(name.toUpperCase()));//just iterates through all the elements
		System.out.println(uppercaseNames);
		//another alternative to this is Stream
		
		
		list.stream().map(name->name.toUpperCase())// The map() method applies the given lambda expression or block of
		//code within the parentheses on each element in the Stream. 
		// and then collects the result of running the lambda expression 
		//and returns the resulting collection
		.forEach(newName->System.out.println(newName));//this collection is then passed to forEach to display
		
		list=list.stream().map(String::toUpperCase).collect(Collectors.toList());//Converting to upper case and hen turning into list using Collector
		System.out.println("Orginal List updated: "+list);
		
		list.stream().map(String::length)// we can pass method reference instead of lambda expression
		.forEach(newName->System.out.println(newName));
		
		System.out.println("===method 1===");
		for(String name:list)
		{
			if(name.startsWith("M"))
			{
				System.out.println(name);
			}
		}
		
		System.out.println("===method 2===");
		list.forEach(name->{if(name.startsWith("M"))System.out.println(name);});
		
		System.out.println("===method 3===");
		List<String> MList=list.stream().filter(new Predicate<String>() { //filter expexts Boolean interface
            @Override
            public boolean test(String name) { //if true then that particular list element is added to Collection
                return name.startsWith("M");
            }
        }).collect(Collectors.toList()); //that collection is converted to list
		System.out.println(MList);
		
		System.out.println("===method 4===");
		List<String> MList2=list.stream().filter(name->name.startsWith("M"))//return true if found
		.collect(Collectors.toList());
		System.out.println(MList2);
		
		
		System.out.println(
   String.format( 
      "Found %d names", MList.size()));
	  
	  
		/*
		Logger logger = Logger.getGlobal();
		String data = new SimpleData().setData("Baeldung").getData();
		logger.log(Level.INFO, new SimpleData().setData("Baeldung").getData());//replacing this with just value loses the log info
		logger.log(Level.INFO, data);//Simple data is mutable 
		logger.log(Level.INFO, "Baeldung");//for referal transparency the function needs to be pure and immutable
		
		Function<Double,Double> log=(value) -> Math.log(value);
		Function<Double,Double> sqrt=(value) -> Math.sqrt(value);
		Function<Double,Double> logThenSqrt=log.andThen(sqrt);
		logger.log(Level.INFO,String.valueOf(logThenSqrt.apply(8.0)));
		double x=Math.log(8);
		System.out.println(x);
		double y=Math.sqrt(x);
		System.out.println(y);
		
		Function<Double,Double> log2=(value) -> Math.log(value);//Lambda expressions can be stored in variables if the variable's type is an interface which has only one method.
		Function<Double,Double> sqrt2=(value) -> Math.sqrt(value);// The lambda expression should have the same number of parameters and the same return type as that method
		Function<Double,Double> sqrtThenLog=log2.compose(sqrt2);
		logger.log(Level.INFO,String.valueOf(sqrtThenLog.apply(8.0)));
		double y2=Math.sqrt(8);
		System.out.println(y2);
		double x2=Math.log(y2);
		System.out.println(x2);
		*/
		/*
		Function<Double, Double> log = (value) -> Math.log(value);
		Function<Double, Double> sqrt = (value) -> Math.sqrt(value);
		Function<Double, Double> logThenSqrt = sqrt.compose(log);
		logger.log(Level.INFO, String.valueOf(logThenSqrt.apply(3.14)));
		// Output: 1.06
		Function<Double, Double> sqrtThenLog = sqrt.andThen(log);
		logger.log(Level.INFO, String.valueOf(sqrtThenLog.apply(3.14)));
		*/
	}
}