public class BankAccount {
    private String acountNumber;
    private double totalBalance;

    public BankAccount(String acountNumber, double totalBalance) {
        this.acountNumber = acountNumber;
        this.totalBalance = totalBalance;
    }

    public double getTotalBalance() {

        return totalBalance;
    }

    public String getAcountNumber() {

        return acountNumber;
    }
    public void deposit(){
        System.out.println("Deposit");
    }
    public void withdraw(){
        System.out.println("Withdraw");

    }
    public void getBalance() {
        System.out.println("Balance");
    }
}