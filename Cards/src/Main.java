import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] cardsNominal = new String[9];
        cardsNominal[0] = "6";
        cardsNominal[1] = "7";
        cardsNominal[2] = "8";
        cardsNominal[3] = "9";
        cardsNominal[4] = "10";
        cardsNominal[5] = "Валет";
        cardsNominal[6] = "Дама";
        cardsNominal[7] = "Король";
        cardsNominal[8] = "Туз";

        String[] cardType = {"Пики", "Черви", "Бубны", "Крести"};

        String card = null;
        String cardT = null;
        int cardSequence = 0;

        Random random = new Random();

        System.out.println("Введите количество карт: ");
        Scanner scanner = new Scanner(System.in);
        int cardsNumber = scanner.nextInt();

            for (int i = 0; i < cardsNumber; i++) {
                int randomNominal = random.nextInt(0, 9);
                card = cardsNominal[randomNominal];
                int randomType = random.nextInt(0, 4);
                cardT = cardType[randomType];
                cardSequence++;

                System.out.println("Ваша карта нр. " + cardSequence + " : " + card + " " + cardT);
            }
    }
}
