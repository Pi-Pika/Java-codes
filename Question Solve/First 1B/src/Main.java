public class Main {
    public static void main(String[] args) {
        Car toyota = new Car(169.89);
        Cycle roadShow = new Cycle(69.69);

        Alice alice  = new Alice(120, 49, 12, toyota);
        Bob bob = new Bob(121, 34,12, roadShow);

        alice.getToyota().start();
        bob.getRoadShow().start();
        alice.getToyota().stop();
        bob.getRoadShow().stop();


        System.out.println("Alice height " + alice.getHeight());
        System.out.println("Bob's height " + bob.getHeight());

        System.out.println("Toyota's price " +alice.getToyota().getPrice());
        System.out.println("RoadShow's price " + bob.getRoadShow().getPrice());

        System.out.println("The are running at speed " +alice.getSpeed());
    }
}