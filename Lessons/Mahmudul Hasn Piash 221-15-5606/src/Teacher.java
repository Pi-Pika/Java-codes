import java.util.List;

public class Teacher extends Person{
    private String TeacherInitial;
    private int EmployeeId;

    public Teacher(String TeacherInitial, int EmployeeId) {
        this.TeacherInitial = TeacherInitial;
        this.EmployeeId = EmployeeId;
    }

    public void AddDetails(List<Teacher> Teacher){
        for (Teacher t : Teacher){
            System.out.println("Name: " + t.getName());
            System.out.println("Initial: " + t.TeacherInitial + " ID: " + t.EmployeeId + "\n");
        }
    }
    public void ModifyDetails(){
        Refund refund = new Refund();
        System.out.print(""+getName()+"'s ");
        refund.RefundAmount();
        System.out.println();
    }
}
