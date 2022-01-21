import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionDemo {
    public static void main(String args[])
    {



        ArrayList<String> ll = new ArrayList<>();
        ll.add("nandu");
        ll.add("parth");
        ll.add("din");
        ll.add("mukesh");
        System.out.println(ll);//toString implemented in the Abstract Collection class

//        for(int i=0;i<ll.size();i++)
//        {
//            System.out.println(ll.get(i));
//            if(i==ll.size()-1)
//            {
//                ll.remove(i);// concurrent modifications not allowed in for loop use Iterator
//            }
//        }
//        for(String str:ll)
//        {
//            if(str.startsWith("di"))
//            {
//                ll.remove(str);// concurrent modifications not allowed in for loop use Iterator
//            }
//        }

//        Iterator<String> iterator=ll.iterator();//this iterator.next will give String value
//        while(iterator.hasNext())
//        {
//            if(iterator.next().startsWith("di"))
//            {
//                iterator.remove();
//            }
//        }
//        System.out.println(ll);

//        Deque<String> ll=new LinkedList<>();
//        ll.add("nandu");
//        ll.add("parth");
//        ll.add("din");
//        ll.add("mukesh");
//        System.out.println(ll);
//        ArrayList<String> ll2=new ArrayList<>();
//        ll2.addAll(ll);
//        ll.removeAll(ll2);
//        System.out.println(ll2);
//        ll.push("manu");//linked list has push and pop method
//        ll.push("ninad");
//        ll.push("maya");
//        ll.pop();
//        System.out.println(ll);

//        HashMap<String,Integer> hm=new HashMap<>();//hashing implemented | Ordering not maintained
//        hm.put("raj",4);
//        hm.put("nandu",150);
//        hm.put("harsh",20);
//        hm.put("parth",300);
//
//        for(Map.Entry<String,Integer> entry: hm.entrySet())
//        {
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
//        LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();//hashing implemented | Ordering maintained
//        hm.put("raj",4);
//        hm.put("nandu",150);
//        hm.put("harsh",20);
//        hm.put("parth",300);
//
//        for(Map.Entry<String,Integer> entry: hm.entrySet())
//        {
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }

//        Set<String> stringSet=new HashSet<>();//Duplicate Elements not allowed | ordering not maintained
//        stringSet.add("nandu");
//        stringSet.add("parth");
//        stringSet.add("din");
//        stringSet.add("mukesh");
//        stringSet.add("mukesh");
//        System.out.println(stringSet);

//        Set<String> stringSet=new LinkedHashSet<>();//Duplicate Elements not allowed | ordering not maintained
//        stringSet.add("nandu");
//        stringSet.add("parth");
//        stringSet.add("din");
//        stringSet.add("mukesh");
//        stringSet.add("mukesh");
//        System.out.println(stringSet);


//        Set<String> stringSet=new TreeSet<>();//Duplicate Elements not allowed | By default Ascding order is maintained
//        stringSet.add("nandu");
//        stringSet.add("parth");
//        stringSet.add("din");
//        stringSet.add("mukesh");
//        stringSet.add("mukesh");
//        System.out.println(stringSet);

        //but using the User defined class, ordering in ascending creates problm class Student cannot be cast to class java.lang.Comparable
        //so we need to implement Comparable with User Defined object

//        Set<Student> stringSet=new TreeSet<>();//Duplicate Elements not allowed | By default Ascnding order is maintained
//        stringSet.add(new Student("harsh",12,2));
//        stringSet.add(new Student("parth",1,3));
//        stringSet.add(new Student("din",13,1));
//        stringSet.add(new Student("mukesh",7,5));
//        stringSet.add(new Student("raj",5,4));
//        //Here TreeSet is uses comparable method to sort the objects in Ascnding order
//        for(Student s:stringSet)
//        {
//            System.out.println(s.name+" "+s.experience+" "+s.roll);
//        }

        ArrayList<Student> stringSet=new ArrayList<>();//Duplicate Elements not allowed | By default Ascnding order is maintained
        stringSet.add(new Student("harsh",12,2,"India",1));
        stringSet.add(new Student("parth",1,3,"Russia",2));
        stringSet.add(new Student("din",13,1,"USA",3));
        stringSet.add(new Student("mukesh",7,5,"China",4));
        stringSet.add(new Student("raj",5,4,"India",1));
        Collections.sort(stringSet,new CriteriaV1());//CriteriaV1 is the Comparator implementation

        Collections.sort(stringSet, new Comparator<Student>() { //another way to implement Comparator anonymous class used
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.experience>o2.experience)
                    return 1;
                else if(o1.experience==o2.experience)
                    return 0;
                else
                    return -1;
            }
        });
        Collections.sort(stringSet,(Student o1, Student o2)-> { //lambda Expression used
                if(o1.address.countryCode>o2.address.countryCode)
                {
                    return 1;
                }
                else if(o1.address.countryCode<o2.address.countryCode)
                {
                    return -1;
                }
                else
                     return 0;
            }
        );
        for(Student s:stringSet)
        {
            System.out.println("Student: "+s);
        }
        String st="nand";
        stringSet.stream().filter(new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return false;
            }
        });


    }
}
