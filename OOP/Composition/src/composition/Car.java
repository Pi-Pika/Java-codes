package composition;
public class Car {
    private String make, model, color;
    private Wheel w;
    private Engine engine;
    public Car(String make, String model, String color, String wm, int noW, String em, double pe) {
        this.make = make;
        this.model = model;
        this.color = color;

        w = new Wheel(wm, noW);
        engine = new Engine(em, pe);
    }

    public void display() {
        System.out.println(make + " " + model + " " + color);
        w.display();
        engine.display();
    }
}
