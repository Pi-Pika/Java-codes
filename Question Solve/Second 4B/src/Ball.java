public class Ball implements Tossable{

    private String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    @Override
    public void toss() {

    }
    public void bounce(){

    }
}
