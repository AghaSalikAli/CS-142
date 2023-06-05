public class CheckingAccount extends BankAcc{
    private static double FEE = 15;

    public CheckingAccount (String Name, double Amount) {
        super(Name, Amount);
        setAccountNumber(super.getAccountNumber() + "-10");
    }

    @Override
    public boolean withdraw(double amount) {
        return super.withdraw(amount + FEE);
    }


}
