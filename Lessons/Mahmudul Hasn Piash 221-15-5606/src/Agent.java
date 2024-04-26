import java.sql.SQLOutput;

public class Agent implements Function{
    private int AgentId;
    private String Name;

    public Agent(int AgentId, String Name) {
        this.AgentId = AgentId;
        this.Name = Name;
        System.out.println("Agent Name: "+ Name);
        System.out.println("Agent ID: "+ AgentId);
        System.out.println();
    }

    public void SearchTicket() {
        System.out.println("Searching Ticket");
    }

    public void BookTicket() {
        System.out.println("Booking Ticket");
    }

    public void CancelTicket() {
        System.out.println("Canceling Ticket");
    }

    public void MakePayment() {
        System.out.println("Making Payment");
    }

    public void FillDetails() {
        System.out.println("Filling Details");
    }
}
