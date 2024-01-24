package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть відстань в милях: ");
        double miles = scanner.nextDouble();
        printResult(miles, "миль", "кілометрів");

        System.out.print("Введіть відстань в кілометрах: ");
        double kilometers = scanner.nextDouble();
        printResult(kilometers, "кілометрів", "миль");

        scanner.close();
    }
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }

    // Метод для виведення результату в консоль
    public static void printResult(double value, String fromUnit, String toUnit) {
        System.out.println(value + " " + fromUnit + " = " + milesToKilometers(value) + " " + toUnit);
    }
}







