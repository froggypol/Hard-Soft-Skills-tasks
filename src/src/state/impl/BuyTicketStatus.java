package state.impl;

import state.TicketStatus;
import ticket.Ticket;

public class BuyTicketStatus implements TicketStatus {

    @Override
    public boolean availableTicket(Ticket ticket) {
        System.out.println("Ticket " + ticket.toString() + "is not available any more");
        return false;
    }

    @Override
    public void reserveTicket(Ticket ticket) {
        System.out.println("Ticket " + ticket.toString() + "was already reserved");
    }

    @Override
    public void buyTicket(Ticket ticket) {
        System.out.println("Ticket " + ticket.toString() + "is bought");
    }
}
