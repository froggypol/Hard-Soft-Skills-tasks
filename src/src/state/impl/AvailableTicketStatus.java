package state.impl;

import state.TicketStatus;
import ticket.Ticket;

public class AvailableTicketStatus implements TicketStatus {

    @Override
    public boolean availableTicket(Ticket ticket) {
        System.out.println("Ticket " + ticket.toString() + "is available for reservation");
        return true;
    }

    @Override
    public void reserveTicket(Ticket ticket) {
        System.out.println("Ticket " + ticket.toString() + "must be checked for availability firstly");

    }

    @Override
    public void buyTicket(Ticket ticket) {
        System.out.println("Ticket " + ticket.toString() + "must be available and reserved firstly");
    }
}
