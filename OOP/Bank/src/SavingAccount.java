public class SavingAccount extends BankAccount{
    private double interestRate;
    public SavingAccount(String acountNumber, double totalBalance, double interestRate){
        super(acountNumber,totalBalance );
        this.interestRate = interestRate;
    }
    public void addInterest(){
        System.out.println("After adding interest the total balance is " + (getTotalBalance() + (getTotalBalance()*interestRate/100.0)) );
    }

    public double getInterestRate() {
        return interestRate;
    }
}
