import java.util.List;

public class Teacher {
    public String tname;
    public void teach(List<Student> std){
        System.out.println("These students taught by: "+tname);
        for (Student s :std){
            System.out.println(s.name);
            System.out.println(s.sid);
        }
    }
}
