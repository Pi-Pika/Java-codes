public class Car implements Machine{
    @Override
    public void start() {
        System.out.println("Car Starts");
    }

    @Override
    public void stop() {
        System.out.println("Car Stops");
    }
}
