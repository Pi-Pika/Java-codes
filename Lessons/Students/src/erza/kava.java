package erza;

public class kava {
    private String id;
    private String name;
    private double cgpa;
    public void insert_Record(String id, String name,double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
    public void display_Record(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(cgpa);
    }


}
