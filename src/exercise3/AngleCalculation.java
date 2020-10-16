package exercise3;

import java.util.Scanner;

public class AngleCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        char type = scanner.next().charAt(0);

        do {
            if (type == 'r') {
                double grad = number * (180/Math.PI);
                System.out.println("Angle: " + grad + "d");

            } else {
                double radiant = number * (Math.PI/180);
                System.out.println("Angle: " + radiant + "r");

            }
            number = scanner.nextDouble();
            type = scanner.next().charAt(0);
        } while (type == 'r' || type == 'd');
    }
}