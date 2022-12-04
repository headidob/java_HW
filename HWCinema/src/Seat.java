public class Seat {

    String seatNumber;
    boolean bookingStatus;

    public Seat (String seatNumber, boolean bookingStatus){
        this.seatNumber = seatNumber;
        this.bookingStatus = bookingStatus;

    }

    public void booking(){

        if(this.bookingStatus){
            Ticket ticket = new Ticket(this.seatNumber);
            System.out.println(ticket);
        }else{
            System.out.println("Seat nr. " + seatNumber + " is free");
        }

    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNumber='" + seatNumber + '\'' +
                ", bookingStatus=" + bookingStatus +
                '}';
    }
}
