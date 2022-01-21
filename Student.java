public class Student implements Comparable<Student>{
    public String name;
    public Integer experience;
    public Integer roll;
    public Address address=new Address();


    public Student(String name, Integer experience, Integer roll, String country,int countryCode) {
        this.name = name;
        this.experience = experience;
        this.roll = roll;
        this.address.country=country;
        this.address.countryCode=countryCode;
    }
    public String toString()
    {
        return this.name+" "+this.experience+" "+this.roll+" "+this.address.country+" "+this.address.countryCode;
    }


    @Override
    public int compareTo(Student o) {
        if(this.experience>o.experience)
            return 1;
        else if(this.experience==o.experience)
            return 0;
        else
            return -1;
    }
}
