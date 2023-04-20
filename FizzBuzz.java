package SunderyAlgorithms;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number to Stop: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
             if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");
            }else if (i % 5 ==0) {
                System.out.println("BUZZ");
            } else if (i % 3 == 0){
                System.out.println("FIZZ");
            } else  System.out.println(i);

        }
    }
}
