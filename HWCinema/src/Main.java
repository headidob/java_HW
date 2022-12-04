public class Main {
    public static void main(String[] args) {

        Seat seat1 = new Seat("1", true);
        Seat seat2 = new Seat("2", false);
        Seat seat3 = new Seat("3", true);
        Seat seat4 = new Seat("4", false);
        Seat seat5 = new Seat("5", true);


        seat1.book();
        seat2.book();
        seat3.book();
        seat4.book();
        seat5.book();

    }
}