package exercise3;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int count = 0;
        double sum = 0;
        int negative = 0;
        int positive = 0;
        double average = 0;

        while (number != 0) {

            if (number < 0) {
                negative++;
            } else {
                positive++;

            }

            sum = sum + number;
            average = sum / (positive+negative);
            System.out.println("Positive numbers: " + positive);
            System.out.println("Negative numbers: " + negative);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            number = input.nextInt();
        }
    }

}