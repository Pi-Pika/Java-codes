
import java.util.List;

public class Player {
    private String PlayerName;
    private int PlayerNo;

    public Player(String PlayerName, int PlayerNo) {
        this.PlayerName = PlayerName;
        this.PlayerNo = PlayerNo;
    }

    public void Gets(List<Ball> ball)
    {
        System.out.println("\n\nPlayer have those Balls: ");
        for(Ball b : ball)
        {
            System.out.println("Ball Brand: "+b.getBrandname());
            System.out.println("Ball Size: "+b.getSize());
        }
    }

    public void display()
    {
        System.out.println("Player Information: ");
        System.out.println("Player Name: "+PlayerName);
        System.out.println("Jersey Number: "+PlayerNo);
    }
}
