import org.w3c.dom.ls.LSOutput;

public class SecondHandVehicle extends Vehicle{
    private int numberofOwners;

    public SecondHandVehicle(String regNo, String make, int yearOfManufracture, double value, int numberofOwners) {
        super(regNo, make, yearOfManufracture, value);
        this.numberofOwners = numberofOwners;
    }

    public int getNumberofOwners() {
        return numberofOwners;
    }
    public void sellVehicle(double price){
        System.out.println("Vehicle Sold"+ price);
    }
    void display(){
        System.out.println("Reg No of Car: "+ getRegNo());
        System.out.println("Make of Car: "+ getMake());
        System.out.println("Year of Manufracture: "+ getYearOfManufracture());
        System.out.println("Value of car: "+ getValue());
        System.out.println("Number of owners: "+ getNumberofOwners());
        calculateAge(10);
        //System.out.println(calculateAge(10));
    }
}
