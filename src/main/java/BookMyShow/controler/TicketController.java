package BookMyShow.controler;

import java.security.Timestamp;
import java.util.List;

import BookMyShow.modal.Show;
import BookMyShow.modal.ShowSeat;
import BookMyShow.modal.ShowSeatType;
import BookMyShow.modal.Theater;
import BookMyShow.service.TicketService;

//@Controller
public class TicketController {
	
	TicketService ticketService;
	
	public void generateTicket(int showId, Timestamp startTime, int theaterid, List<ShowSeatType> showSeatTypes, List<ShowSeat> showSeats) {
		
		Theater theater = new Theater();
		theater.setTheaterId(theaterid);
		
		
		
		Show show = new Show();
		show.setShowId(showId);
		show.setStartTime(startTime);
		
		ticketService.generateTicket(theater, show, showSeatTypes, showSeats);
		
		
	}

}
