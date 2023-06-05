public class Driver2 {
    public static void main(String[] args) {
        BankAcc b1 = new BankAcc();
        BankAcc b2 = new BankAcc("Salik", 40000);
        BankAcc b3 = new BankAcc(b2, 20000);
        b2.deposit(10000);
        System.out.println(b2.withdraw(200000));
        System.out.println(b2.getAccountNumber());
        System.out.println(b3.getAccountNumber());
        System.out.println(b2.getBalance());
        System.out.println(b2.getOwner());
        CheckingAccount c1 = new CheckingAccount("Ali", 25000);
        System.out.println(c1.getAccountNumber());
        System.out.println(c1.withdraw(24999));
        SavingsAccount s1 = new SavingsAccount("Agha", 35000);
        System.out.println(s1.getAccountNumber());
        SavingsAccount s2 = new SavingsAccount(s1, 4000);
        System.out.println(s2.getAccountNumber());
    }
}