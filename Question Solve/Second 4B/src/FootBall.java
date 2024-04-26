public class FootBall extends Ball{
    public FootBall(String brandName) {
        super(brandName);
    }
    public void toss(){
        System.out.println("Tossing the "+getBrandName());
    }
    public void bounce(){
        System.out.println("Bouncing the "+getBrandName());
    }
}
