import java.util.List;

public class Company {
    public String name;
    public String reg_no;
    public String type;

    public Company(String name, String reg_no, String type) {
        this.name = name;
        this.reg_no = reg_no;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReg_no() {
        return reg_no;
    }

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void display(){
        System.out.println(name+" "+reg_no+" "+type);
    }
    public void HasSalariedEmployee(List<SalariedEmployee> salariedEmployees){
        System.out.println("Details: ");
        for(SalariedEmployee semp: salariedEmployees){
            semp.display();
        }
    }
    public void HasHourlyEmployee(List<HourlyEmployee> hourlyEmployees){
        System.out.println("Details: ");
        for (HourlyEmployee hemp: hourlyEmployees){
            hemp.display();
        }
    }
}
