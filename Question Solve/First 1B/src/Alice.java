class Alice extends Human {
    private Car toyota;
    private int speed;

    public Alice(double height, double weight, int speed, Car toyota) {
        super(height, weight);
        this.speed = speed;
        this.toyota = toyota;
    }

    public Car getToyota() {
        return toyota;
    }

    public int getSpeed() {
        return speed;
    }
}