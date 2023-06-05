public class StudentAdvanceTicket extends AdvanceTicket{
    public StudentAdvanceTicket(int days) {
        super(days);
        super.price = super.price/2;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "(student)";
    }
}
