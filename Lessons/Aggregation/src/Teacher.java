public class Teacher {
    String name;
    int eid;
    Address address;

    public Teacher(String name, int eid, Address address) {
        this.name = name;
        this.eid = eid;
        this.address = address;
    }
    void display(){
        System.out.println(address.city);
        System.out.println(address.roadNo);
        System.out.println(address.country);
        System.out.println(address.area);

        System.out.println(name);
        System.out.println(eid);
    }
}
