import java.util.Objects;

public class Employee {
    public String firstname;
    public String lastname;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstname, employee.firstname) && Objects.equals(lastname, employee.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }

    public Employee clone() throws CloneNotSupportedException
    {
        // return super.clone();   Shallow cloning
        //Deep Cloning
        Employee e3=new Employee();
        e3.firstname=this.firstname;
        e3.lastname=this.lastname;

        return e3;
    }
}
