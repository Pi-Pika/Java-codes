import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingCounter {
    public void display(){
        Student s0 = new Student("5137","4th");
        s0.setName("Ashib");
        Student s1 = new Student("5886","4th");
        s1.setName("Alvi");
        List<Student> Noobs = new ArrayList<Student>();
        Noobs.add(s0);
        Noobs.add(s1);

        Teacher t0 = new Teacher("ZSN",5172);
        t0.setName("Zakia Sultana Nisa");
        Teacher t1 = new Teacher("TS",5438);
        t1.setName("Toha Siddique");
        List<Teacher> Pros = new ArrayList<Teacher>();
        Pros.add(t0);
        Pros.add(t1);

        s0.AddDetails(Noobs);
        t0.AddDetails(Pros);

        Ticket ts0 = new Ticket("7492", new Date(), new Time(System.currentTimeMillis()), "A0", "Source0", "Bogura");
        Ticket ts1 = new Ticket("7539", new Date(), new Time(System.currentTimeMillis()), "A1", "Source2", "Narayanganj");

        Ticket tt0 = new Ticket("4679", new Date(), new Time(System.currentTimeMillis()), "B0", "Source0", "Barishall");
        Ticket tt1 = new Ticket("2407", new Date(), new Time(System.currentTimeMillis()), "B1", "Source1", "Noakhali");

        List<Ticket> ticket = new ArrayList<Ticket>();
        System.out.println("Student ticket details:");
        ticket.add(ts0);
        ticket.add(ts1);
        ts0.addTicketDetails(ticket, s0.getName());
        ts1.addTicketDetails(ticket,s1.getName());
        System.out.println("Teacher ticket details:");
        ticket.add(tt0);
        ticket.add(tt1);
        tt0.addTicketDetails(ticket,t0.getName());
        tt1.addTicketDetails(ticket,t1.getName());

        Agent a = new Agent(5648,"Shuvro Dalal");
        a.SearchTicket();
        a.SearchTicket();
        a.BookTicket();
        a.CancelTicket();
        a.MakePayment();
        a.FillDetails();
        System.out.println();

        t0.ModifyDetails();
        s0.ModifyDetails();
        t1.ModifyDetails();
        s1.ModifyDetails();

    }
    public static void main(String[] args) {
        BookingCounter Eva = new BookingCounter();
        Eva.display();
    }
}