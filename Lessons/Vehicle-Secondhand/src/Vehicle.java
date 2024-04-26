public class Vehicle {
    private String regNo,make;
    private int yearOfManufracture;
    private double value;

    public Vehicle(String regNo, String make, int yearOfManufracture, double value) {
        this.regNo = regNo;
        this.make = make;
        this.yearOfManufracture = yearOfManufracture;
        this.value = value;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getMake() {
        return make;
    }

    public int getYearOfManufracture() {
        return yearOfManufracture;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public int calculateAge(int age){
        System.out.println("Vehicle age "+ age);
        return age;
    }

}
