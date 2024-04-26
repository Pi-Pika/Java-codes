package erza;
class Person{
    protected String name;
    protected int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class Animal extends Person{
        private int id;
        private double cgpa;
        public Animal(String name,int age,int id, double cgpa) {
            super("monnaf",342);
            this.name=super.name;
            this.age=super.age;
            this.id=id;
            this.cgpa=cgpa;
        }
        public void display(){
            super.display();
            System.out.println(id);
            System.out.println(cgpa);
        }

    public static void main(String[] args) {
        Animal a= new Animal("Monnaf",37,3242,3.5);
        a.display();
    }
}
