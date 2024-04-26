package associationclass;
import java.util.List;
public class Teacher {
    String name;
    int eid;
    public void Teach(List<Student> std)
    {
        System.out.print("The list of students taught by: "+this.name);
        System.out.println("and his Employee ID: "+this.eid);
        for(Student s:std)
        {
            System.out.println(s.name);
            System.out.println(s.sid);
        }
    }
    
}
