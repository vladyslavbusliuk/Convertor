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






