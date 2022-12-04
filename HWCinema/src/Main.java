public class Main {
    public static void main(String[] args) {

        Seat seat1 = new Seat("1", true);
        Seat seat2 = new Seat("2", false);
        Seat seat3 = new Seat("3", true);
        Seat seat4 = new Seat("4", true);
        Seat seat5 = new Seat("5", true);


        seat1.booking();
        seat2.booking();
        seat3.booking();
        seat4.booking();
        seat5.booking();

    }
}