public class AdvanceTicket extends FixedPriceTicket{
    public AdvanceTicket(int days) {
        super(40);
        if (days>9)
            super.price = 30;
    }
}
