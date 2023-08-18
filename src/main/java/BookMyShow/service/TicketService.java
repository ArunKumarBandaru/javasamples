package BookMyShow.service;

import BookMyShow.modal.Show;
import BookMyShow.modal.ShowSeat;
import BookMyShow.modal.ShowSeatType;
import BookMyShow.modal.Theater;
import BookMyShow.modal.Ticket;
import BookMyShow.repository.TicketRepository;

public class TicketService {
	
	TicketRepository ticketRepo;	
	
	public Ticket generateTicket(Theater theater, Show show, ShowSeatType showSeatTypes, ShowSeat showSeat) {
		
		//Theater theaterFromDB = ticketRepo.getTheater(theater.getTheaterId());
		
		return null;
	}

}
