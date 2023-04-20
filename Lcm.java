package SunderyAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int nymber = scanner.nextInt();

        System.out.println(lcm(nymber));
    }
        public static String lcm(int number) {

            int divider = 2;
            int counter = 0;
            int[] array = new int[100];
            while (number > 2) {
                if (number % divider == 0) {
                    number = number / divider;
                    array[counter] = divider;
                    counter++;
                } else divider++;
            }
          return Arrays.toString(Arrays.copyOf(array, counter));

        }

}


