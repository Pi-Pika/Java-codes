public class Car {
    public String name;
    public int model_no;
    public int price;
    public int year;

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        c1.displayInfo("BMW", 007, 12000, 2000);
        c2.displayInfo("Audi", 1828, 15000, 2006);
        c3.displayInfo("GTR", 5287, 18000, 2008);

    }

    public void displayInfo(String a, int b, int c, int d) {
        this.name = a;
        this.model_no = b;
        this.price = c;
        this.year = d;
        System.out.println("Car Name: " + a);
        System.out.println("Model No: " + b);
        System.out.println("Price: " + c);
        System.out.println("Year: " + d);
    }

}