import java.util.List;

public class Student {
    public String name;
    public int sid;

    public Student(String name, int sid) {
        this.name = name;
        this.sid = sid;
    }
    public void TeachBy(List<Teacher> std1)
    {
        System.out.println("Student Name is : "+ name + " id is: "+ sid);
        for (Teacher t: std1){
            System.out.println("Name: "+t.tname);
        }
    }
}
