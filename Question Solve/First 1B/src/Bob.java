class Bob extends Human{
    private Cycle roadShow;
    private int speed;
    public Bob(double height, double weight, int speed, Cycle roadshow){
        super(height,weight);
        this.speed = speed;
        this.roadShow = roadshow;
    }
    public int getSpeed(){
        return speed;
    }
    public Cycle getRoadShow(){
        return roadShow;
    }

}