public class SavingsAccount extends BankAcc{
    private double rate=0.025;
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount (String Name, double Amount) {
        super(Name, Amount);
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }
    public SavingsAccount (SavingsAccount oldaccount, double amount) {
        super(oldaccount, amount);
        savingsNumber++;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }
    public void postinterest () {
        deposit(rate*getBalance()/12);
    }
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }
}

