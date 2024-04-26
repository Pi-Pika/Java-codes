public class Main {
    public static void main(String[] args) {
        CheckAccount c = new CheckAccount("1233", 400, 20);
        System.out.println("The Account number is " + c.getAcountNumber());
        System.out.println("The total balance is " + c.getTotalBalance());
        System.out.println("The deduct fee is " + c.getFee());
        c.deductFee();

        SavingAccount s = new SavingAccount("69", 100, 4);
        System.out.println("The Account number is " + s.getAcountNumber());
        System.out.println("The total balance is " + s.getTotalBalance());
        System.out.println("The interest rate is " + s.getInterestRate());
        s.addInterest();
    }
}