package state;

import ticket.Ticket;

public interface TicketStatus {

    boolean availableTicket(Ticket ticket);
    void reserveTicket(Ticket ticket);
    void buyTicket(Ticket ticket);

}
