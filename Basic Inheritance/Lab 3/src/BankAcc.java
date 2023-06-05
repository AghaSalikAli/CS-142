public class BankAcc {
    protected static int numberOfAccounts = 100001;
    private double balance;
    private String AccountNumber;
    private String Name;

    public BankAcc () {
        balance=0;
        AccountNumber = numberOfAccounts + "";
        numberOfAccounts++;
    }

    public BankAcc (String Name, double amount) {
        balance = amount;
        this.Name = Name;
        AccountNumber = numberOfAccounts + "";
        numberOfAccounts++;
    }
     public BankAcc (BankAcc oldaccount, double amount) {
        balance = amount;
        Name = oldaccount.getOwner();
        AccountNumber = oldaccount.getAccountNumber();
    }

    public void deposit (double amount) {
        balance+=amount;
    }

    public boolean withdraw (double amount) {
        if (balance>amount) {
            balance-=amount;
            return true;
        } else
            return false;
    }

    public double getBalance () {
        return balance;
    }
    public String getOwner () {
        return Name;
    }
    public String getAccountNumber() {
        return AccountNumber;
    }
    public void setbalance (double amount) {
        balance = amount;
    }
    public void setAccountNumber (String newAccountNumber) {
        AccountNumber = newAccountNumber;
    }


}
