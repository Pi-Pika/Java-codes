public class WaterPump implements Machine{
    @Override
    public void start() {
        System.out.println("Water pump Starts");
    }
    @Override
    public void stop() {
        System.out.println("Water pump Stops");
    }
}
