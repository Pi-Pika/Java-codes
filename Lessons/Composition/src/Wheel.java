public class Wheel {
    String wheel_type= "Moto";
    int wheel_price=1200;

    public Wheel(String wheel_type, int wheel_price) {
        this.wheel_type = wheel_type;
        this.wheel_price = wheel_price;
    }
    void display(){
        System.out.println(wheel_type);
        System.out.println(wheel_price);
    }
}
