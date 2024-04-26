import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ashib",5137);
        Student s2 = new Student("Piash",5606);
        Student s3 = new Student("Shuvro",5287);
        List<Student> srgroup = new ArrayList();
        srgroup.add(s1);
        srgroup.add(s2);
        srgroup.add(s3);

        Teacher t1 =new Teacher();
        t1.tname="Imam";
        Teacher t2 =new Teacher();
        t2.tname="Hasan";
        Teacher t3 =new Teacher();
        t3.tname="Bijoy";

        List<Teacher> tgroup = new ArrayList();
        tgroup.add(t1);
        tgroup.add(t2);
        tgroup.add(t3);

        s2.TeachBy(tgroup);
        System.out.println();
        t1.teach(srgroup);

    }
}