class Car extends Vehicle implements Drive{

    public Car(double price){
        super(price);
    }

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}