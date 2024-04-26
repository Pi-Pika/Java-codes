public class Apollo extends Spacecraft implements Drive,Shuttle{

    int nowWheel;

    public Apollo(String model, int nowWheel) {
        super(model);
        this.nowWheel = nowWheel;
    }

    @Override
    public void display() {
        System.out.println(model+" "+nowWheel);
    }

    @Override
    public void drive() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void turn() {

    }

    @Override
    public void startShuttle() {

    }

    @Override
    public void stopShuttle() {

    }
    public static void main(String[] args) {
        Apollo a1 = new Apollo("123",2);
        a1.display();
    }
}
