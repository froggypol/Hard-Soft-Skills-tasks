package ticket;

import state.TicketStatus;

public class Ticket {

    private int chairNumber;
    private int rowNumber;
    private TicketStatus ticketStatus;

    public Ticket(int chairNumber, int rowNumber) {
        this.chairNumber = chairNumber;
        this.rowNumber = rowNumber;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
        System.out.println( "Ticket status " + ticketStatus + " was set to " + this.toString());
    }

    @Override
    public String toString() {
        return "Ticket {" +
                "chairNumber=" + chairNumber +
                ", rowNumber=" + rowNumber +
                ", ticketStatus=" + ticketStatus +
                '}';
    }
}
