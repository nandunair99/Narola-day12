import java.util.Comparator;

public class CriteriaV1 implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        if(o1.roll>o2.roll)
            return 1;
        else if(o1.roll==o2.roll)
            return 0;
        else
            return -1;
    }
}
