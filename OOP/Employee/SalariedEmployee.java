public class SalariedEmployee extends Employee{
    public int salary;

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void payment(){
        System.out.println(getSalary()+" ");
    }
    public void display(){
        System.out.println(getEmp_id()+" "+getEmpName()+" "+getDesignation());
        payment();
    }
}
