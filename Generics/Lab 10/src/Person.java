public class Person implements PersonInterface{

    private int cashSaving;
    private int retirementFund;
    private String firstName;
    private String lastName;

    public Person(int cashSaving, int retirementFund, String firstName, String lastName) {
        this.cashSaving = cashSaving;
        this.retirementFund = retirementFund;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int ComputeTotalWealth() {
        return getCashSaving() + getRetirementFund();
    }

    public String getName() {
        return getFirstName() + " " + getLastName();
    }

    public int getCashSaving() {
        return cashSaving;
    }

    public int getRetirementFund() {
        return retirementFund;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
