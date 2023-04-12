package ChapterFour;

import java.util.Scanner;

public class LargestSmallest {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a Number: ");
            int number = input.nextInt();

            int largestNumber = number;
            int smallestNumber = number;

            while (number != 0) {
                System.out.print("Enter another Number or 0 to quit: ");
                number = input.nextInt();

                if (number > largestNumber) {
                    largestNumber = number;
                }
                if (number < smallestNumber) {
                    smallestNumber = number;
                }
            }
            System.out.printf("largest number is %d%n ", largestNumber);
            System.out.printf("Smallest Number is %d%n ", smallestNumber);
        }
}

