package bookingservice;

import state.TicketStatus;
import state.impl.AvailableTicketStatus;
import state.impl.BuyTicketStatus;
import state.impl.ReserveTicketStatus;
import ticket.Ticket;

public class Booking {

    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(1, 1);
        TicketStatus ticketStatus = new AvailableTicketStatus();
        ticket1.setTicketStatus(ticketStatus);
        ticketStatus.availableTicket(ticket1);
        ticketStatus.reserveTicket(ticket1);
        ticketStatus.buyTicket(ticket1);

        Ticket ticket2 = new Ticket(1,2);
        TicketStatus ticketStatus2 = new BuyTicketStatus();
        ticket2.setTicketStatus(ticketStatus2);
        ticketStatus2.availableTicket(ticket2);
        ticketStatus2.reserveTicket(ticket2);
        ticketStatus2.buyTicket(ticket2);


        Ticket ticket3 = new Ticket(1,3);
        TicketStatus ticketStatus3 = new ReserveTicketStatus();
        ticket3.setTicketStatus(ticketStatus3);
        ticketStatus3.availableTicket(ticket2);
        ticketStatus3.reserveTicket(ticket3);
        ticketStatus3.buyTicket(ticket3);
    }

}
