package composition;
public class Engine {
    private String model;
    private double power;
    public Engine(String model, double power) {
        this.model = model;
        this.power = power;
    }
    public void display() {
        System.out.println(model + " " + power);
    }
}
