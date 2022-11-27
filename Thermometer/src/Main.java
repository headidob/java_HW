import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter temperature in Celsius with decimal value: ");
        double inputTempInC = scanner.nextDouble();

        int finalTempInF = Thermometer.tempConverterTempCtoF(inputTempInC);

        System.out.println("Temperature " + inputTempInC + " C  = " + finalTempInF + " F");

        System.out.println("Please enter temperature in Fahrenheit with decimal value: ");
        double inputTempInF = scanner.nextDouble();

        int finalTempInC = Thermometer.tempConverterTemFtoC(inputTempInF);

        System.out.println("Temperature " + inputTempInF + " F = " + finalTempInC + " C");

    }

}