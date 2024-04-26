public class CheckAccount extends BankAccount{
    private double fee;
    public CheckAccount(String acountNumber, double totalBalance, double fee) {
        super(acountNumber, totalBalance);
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void deductFee(){
        System.out.println("After deducting fee the balance is  " + (getTotalBalance() - fee) );
    }
}