import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1ю из 6 цифр в двоичной системе: ");
        int binNumber1 = scanner.nextInt();
        System.out.println("Введите 2ю из 6 цифр в двоичной системе: ");
        int binNumber2 = scanner.nextInt();
        System.out.println("Введите 3ю из 6 цифр в двоичной системе: ");
        int binNumber3 = scanner.nextInt();
        System.out.println("Введите 4ю из 6 цифр в двоичной системе: ");
        int binNumber4 = scanner.nextInt();
        System.out.println("Введите 5ю из 6 цифр в двоичной системе: ");
        int binNumber5 = scanner.nextInt();
        System.out.println("Введите 6ю из 6 цифр в двоичной системе: ");
        int binNumber6 = scanner.nextInt();

        binaryToDecimal binaryToDecimal = new binaryToDecimal(binNumber1, binNumber2, binNumber3, binNumber4, binNumber5, binNumber6);

        System.out.println(binaryToDecimal.getDecimal());

    }
}