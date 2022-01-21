public class CheckByAge implements CheckPerson{

    @Override
    public boolean test(Person p) {
        if(p.getAge()>6 && p.getAge() <24)
            return true;
        else
            return false;
    }
}
