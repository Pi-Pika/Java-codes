public class Main {
    public static void main(String[] args) {
        Baseball b = new Baseball("Wilson");
        FootBall f = new FootBall("Nike");
        b.toss();
        b.bounce();
        f.bounce();
        f.toss();
        Rock r = new Rock();
        r.toss();
    }
}