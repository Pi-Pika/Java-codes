public class Main {
    public static void main(String[] args) {
        int a=20, b = 30, c=10;
        int x= (a * b) / (a -b + c);
        try {
            x = x / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Result: "+ x);
    }
}