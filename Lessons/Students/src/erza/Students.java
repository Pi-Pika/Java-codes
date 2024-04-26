package erza;
public class Students{
    int x=10;
    public Students(int y){
        this.x=y;
    }
    public static void main(String[] args) {
        Students obj = new Students(0);
        System.out.println(obj.x);
        Students obg = new Students(50);
        System.out.println(obg.x);
    }
}