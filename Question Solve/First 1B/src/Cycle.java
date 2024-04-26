class Cycle extends  Vehicle implements Drive {
    public Cycle (double price){
        super(price);
    }

    @Override
    public void start() {
        System.out.println("Cycle is starting");
    }
    @Override
    public void stop() {
        System.out.println("Cycle is stopping");
    }
}