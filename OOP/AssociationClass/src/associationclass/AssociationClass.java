package associationclass;
import java.util.ArrayList;
import java.util.List;
public class AssociationClass {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Karim";
        s1.sid = 123;
        
        Student s2 = new Student();
        s2.name = "Rahim";
        s2.sid = 456;
        
        Student s3 = new Student();
        s3.name = "Abdul";
        s3.sid = 789;
        
        List<Student> slist = new ArrayList<Student>();
        slist.add(s1);
        slist.add(s2);
        slist.add(s3);

        Teacher t1 = new Teacher();
        t1.name = "Bijoy";
        
        t1.Teach(slist);
    }
}
