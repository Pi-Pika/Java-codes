import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee semp1 = new SalariedEmployee();
        semp1.setEmpName("rererere");
        semp1.setEmp_id("qwer");
        semp1.setDesignation("shudi");
        semp1.setSalary(696969);
        SalariedEmployee semp2 = new SalariedEmployee();
        semp2.setEmp_id("asdf");
        semp2.setDesignation("shudi2");
        semp2.setSalary(69696);
        HourlyEmployee hemp1 = new HourlyEmployee();
        hemp1.setEmp_id("iop");
        hemp1.setEmpName("Tamtam");
        hemp1.setDesignation("rururu");
        hemp1.setHourly_payment(45446);
        hemp1.setHours_worked(69);
        HourlyEmployee hemp2 = new HourlyEmployee();
        hemp2.setEmp_id("top");
        hemp2.setEmpName("lal");
        hemp2.setDesignation("rip");
        hemp2.setHourly_payment(69);
        hemp2.setHours_worked(69);
        List<SalariedEmployee> salg = new ArrayList<>();
        salg.add(semp1);
        salg.add(semp2);
        List<HourlyEmployee> halg = new ArrayList<>();
        halg.add(hemp1);
        halg.add(hemp2);
        Company c1 = new Company("tttt","789","tutut");
        c1.display();
        c1.HasSalariedEmployee(salg);
        c1.HasHourlyEmployee(halg);

    }
}