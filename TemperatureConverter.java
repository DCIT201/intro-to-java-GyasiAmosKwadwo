
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
        int option;

        do {
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            if (option < 1 || option > 2) {
                System.out.println("Invalid option. Please choose a number between 1 and 2.");
            }
        } while (option < 1 || option > 2);

        if (option == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        } else {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");


        }


    }
}