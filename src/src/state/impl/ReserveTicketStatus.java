package state.impl;

import state.TicketStatus;
import ticket.Ticket;

public class ReserveTicketStatus implements TicketStatus {

    @Override
    public boolean availableTicket(Ticket ticket) {
        System.out.println("Ticket" + ticket + " is not available any more");
        return false;
    }

    @Override
    public void reserveTicket(Ticket ticket) {
        System.out.println("ticket " + ticket + "is reserved now, please pay for it");
    }

    @Override
    public void buyTicket(Ticket ticket) {
        System.out.println("Pay for reserved ticket " + ticket.toString());
    }
}
