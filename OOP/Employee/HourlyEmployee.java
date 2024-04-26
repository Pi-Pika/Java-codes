public class HourlyEmployee extends Employee{
    public int hours_worked;
    public int hourly_payment;

    public int getHours_worked() {
        return hours_worked;
    }

    public void setHours_worked(int hours_worked) {
        this.hours_worked = hours_worked;
    }

    public int getHourly_payment() {
        return hourly_payment;
    }

    public void setHourly_payment(int hourly_payment) {
        this.hourly_payment = hourly_payment;
    }
    public void payment(){
        System.out.println(" "+hours_worked*hourly_payment);
    }
    public void display(){
        System.out.println(getEmp_id()+" "+getEmpName()+" "+getDesignation());
        payment();
    }
}
