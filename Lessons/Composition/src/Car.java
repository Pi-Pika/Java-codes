public class Car {
    String name;
    String model;
    int price;
    String wheel_type;
    int wheel_price;
    Wheel wheel;

    public Car(String name, String model, int price, String wheel_type, int wheel_price) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.wheel_type = wheel_type;
        this.wheel_price=wheel_price;

        wheel = new Wheel(wheel_type,wheel_price);
    }

    void display(){
        System.out.println(name);
        System.out.println(model);
        System.out.println(price);
        wheel.display();
    }
}
