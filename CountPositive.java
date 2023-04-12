package ChapterFour;

import java.util.Scanner;

public class CountPositive {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            float count = 0;
            int positiveNumbers = 0;
            int negativeNumbers = 0;
            System.out.print("Enter A Number: ");
            int number = input.nextInt();

            int total = 0;
            float average = 0;
            while (number != 0) {
                if (number > 0) {
                    positiveNumbers = positiveNumbers + number;
                }
                if (number < 0) {
                    negativeNumbers = negativeNumbers + number;
                }
                System.out.print("Enter A Number or 0 to Quit: ");
                number = input.nextInt();
                count += 1;
                total = positiveNumbers + negativeNumbers;
                average = total / count;
            }
            System.out.printf("Sum of Positive integers =%d%n", positiveNumbers);
            System.out.printf("Sum of Negative integers =%d%n", negativeNumbers);
            System.out.printf("Sum of Numbers inputed = %d%n", total);
            System.out.printf("Average of Numbers inputed = %f%n", average);
        }

}
