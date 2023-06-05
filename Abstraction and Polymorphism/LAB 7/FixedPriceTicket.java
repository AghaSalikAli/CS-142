public abstract class FixedPriceTicket extends Ticket {

    public FixedPriceTicket (int price) {
        super();
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
