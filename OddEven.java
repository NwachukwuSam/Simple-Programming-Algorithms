package ChapterFour;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oddNumber = 0;
        int evenNumber = 0;
        int sumEven = 0;
        int sumOdd = 0;
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        while (number >0) {
        if (number % 2 == 0) {
        evenNumber += 1;
        sumEven += number;
        }
        else {
            oddNumber += 1;
            sumOdd += number;
        }
        System.out.print("Enter a number, Enter any Negative Number to exit: ");
        number = input.nextInt();
        }
        System.out.printf(" Number of oddNumbers is %d%n", oddNumber);
        System.out.printf(" Number of evenNumbers is %d%n", evenNumber);
        System.out.printf(" Sum of oddNumbers is %d%n", sumOdd);
        System.out.printf(" Sum of evenNumbers is %d%n", sumEven);

        }

}

