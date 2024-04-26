import java.util.List;

public class Student extends Person{
    private String StudentId;
    private String Semester;

    public Student(String StudentId, String Semester) {
        this.StudentId = StudentId;
        this.Semester = Semester;
    }
    public void AddDetails(List<Student> students){
        for(Student s: students){
            System.out.println("Name: "+s.getName());
            System.out.println("ID: "+s.StudentId+" Semester: "+s.Semester+"\n");
        }
    }


    public void ModifyDetails(){
        Refund refund = new Refund();
        System.out.print(""+getName());
        refund.RefundAmount();
        System.out.println();
    }
}
