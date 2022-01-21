import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Collection;
public class CollectionClass
{
	
	public static void main(String args[])
	{
		List ll = new ArrayList();
		ll.add("nandu");
		ll.add("parth");
		ll.add(12);
		ll.add(14);
		int val=24;
		System.out.println(val<<1);
		//List<String> ll2=ll;// this will not raise an exception even if ll has incompatible type values 
		//System.out.println(ll2.get(2));// this will raise an exception as get has "E get(int index)" this signature
		//this should not be the case exception should be raised while assigning wrong values
		Collection<String> ll2=Collections.checkedCollection(ll,String.class);//Any attempt to insert an element of the wrong type will result in an immediate
		//ClassCastException. Assuming a collection contains no incorrectly typed elements prior to the time a dynamically typesafe view is generated,
		//ll2.add(12); // this will give error as the ll2 is now dynamically type safe 
		int distance=10;
		int size=3;
		
		distance=distance%size;
		System.out.println(distance);
		System.out.println(ll2);
		
		/*
		System.out.println(ll.get(2));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.peek());//gives head i.e. first
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		System.out.println(ll.push("First"));
		System.out.println(ll.pop());
		System.out.println(ll);
		System.out.println(ll.removeFirst());
		System.out.println(ll.peekLast());
		*/
		/*
		ArrayList<Integer> arr=new ArrayList<Integer>();
		System.out.println();
		arr.add(1);
		arr.add(3);
		arr.add(1,2); //index,value
		System.out.println(arr);
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		arr2.add(99);
		arr2.add(98);
		arr2.add(97);
		arr2.add(96);
		System.out.println(arr2);
		arr2.addAll(0,arr); //index,collection
		
		System.out.println(arr2);
		
		System.out.println(arr2.get(3));
		System.out.println(arr2.indexOf(99));
		System.out.println("==============method 1======================");
		for(Integer n : arr)
		{
			System.out.println(n);
		}
		System.out.println("==============method 2=========================");
		arr.forEach((n)->System.out.println(n));
		System.out.println("==============method 3=========================");
		Iterator<Integer> it=arr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		arr2.set(0,96);
		System.out.println(arr2);
		Collections.sort(arr2);
		System.out.println(arr2);
		*/
		
		
		
	}
}