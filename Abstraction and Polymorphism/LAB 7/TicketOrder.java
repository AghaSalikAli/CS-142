public class TicketOrder {
    public static void main(String[] args) {
        Ticket[] tickets = new Ticket[6];
        tickets[0] = new ComplimentaryTicket();
        tickets[1] = new WalkUpTicket();
        tickets[2] = new AdvanceTicket(11);
        tickets[3] = new AdvanceTicket(4);
        tickets[4] = new StudentAdvanceTicket(7);
        tickets[5] = new StudentAdvanceTicket(23);
        for (int i = 0; i < tickets.length; i++) {
            System.out.print(tickets[i]);
            System.out.println();
        }
    }
}