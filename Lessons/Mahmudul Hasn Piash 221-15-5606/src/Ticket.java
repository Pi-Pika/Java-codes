import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Ticket {
    private String TicketId;
    private Date Date;
    private Time Time;
    private String SeatNo;
    private String Source;
    private String Destination;

    public Ticket(String TicketId, java.util.Date Date, java.sql.Time Time, String SeatNo, String Source, String Destination) {
        this.TicketId = TicketId;
        this.Date = Date;
        this.Time = Time;
        this.SeatNo = SeatNo;
        this.Source = Source;
        this.Destination = Destination;

    }
    public void addTicketDetails(List<Ticket> tickets, String personName) {
        System.out.println("Ticket ID: " + TicketId);
        System.out.println("Date: " + Date);
        System.out.println("Time: " + Time);
        System.out.println("Seat No: " + SeatNo);
        System.out.println("Source: " + Source);
        System.out.println("Destination: " + Destination);
        System.out.println("Person Name: " + personName);
        System.out.println();

    }

}
