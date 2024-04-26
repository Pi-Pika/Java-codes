public class Baseball extends Ball{
    public Baseball(String brandName) {
        super(brandName);
    }
    public void toss(){
        System.out.println("Tossing the "+getBrandName());
    }
    public void bounce(){
        System.out.println("Bouncing the "+getBrandName());
    }
}
