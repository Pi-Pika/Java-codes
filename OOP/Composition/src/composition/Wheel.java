package composition;
public class Wheel {
    private String make;
    private int noWheel;
    public Wheel(String make, int noWheel) {
        this.make = make;
        this.noWheel = noWheel;
    }
    public void display() {
        System.out.println(make + " " + noWheel);
    }
}
