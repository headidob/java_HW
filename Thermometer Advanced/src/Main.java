import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter temperature in Celsius to convert to Fahrenheit: ");
        double tempCInput = scanner.nextDouble();
        System.out.println("Please enter temperature in Fahrenheit to covert to Celsius: ");
        double temFInput = scanner.nextDouble();


        Thermometer thermometer = new Thermometer(tempCInput, temFInput);
        int finalcalcF = thermometer.getFahrenheit(tempCInput);
        int finalcalcC = thermometer.getCelsius(temFInput);


        System.out.println("Temperature " + tempCInput + " C = " + finalcalcF + " F");
        System.out.println("Temperature " + temFInput + " F = " + finalcalcC + " C");


    }


}
