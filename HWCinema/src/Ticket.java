import java.util.Random;

public class Ticket {
    String seatNumber;
    int ticketNumber;

    public int getTicketNumber() {
        Random random = new Random();
        int ticketNumber = random.nextInt(1000, 10000);
        return ticketNumber;
    }

public Ticket(String seatNumber){
        this.seatNumber = seatNumber;
        this.ticketNumber = getTicketNumber();


}

    @Override
    public String toString() {
        return "Your ticket - " +
                "Seat Number " + seatNumber +
                ", Ticket Number " + ticketNumber;
    }
}

