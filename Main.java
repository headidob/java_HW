import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Первое задание
        String text, textOut;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст из нескольких слов:");

        text = scanner.nextLine();

        System.out.println("Введите слово которое нужно удалить из текста:");

        textOut = scanner.nextLine();

        text = text.replaceAll(textOut, "");
        text = text.replaceAll("\\s+"," ");

        System.out.println(text);

        //Второе задание
        System.out.println(" ");

        String binNumber;
        System.out.println("Введите введите число из 6 цифр в двоичной системе измерения");
        binNumber = scanner.nextLine();
        System.out.println("Это число в десятичной системе = " + Integer.parseInt(binNumber,2));
    }
}