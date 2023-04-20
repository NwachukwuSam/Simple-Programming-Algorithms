package SunderyAlgorithms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int reverse = 0, temporal, remainder;

        System.out.println("Enter a Number: ");
        int number = input.nextInt();
        temporal = number;
        while (temporal !=0){
            remainder = temporal % 10;
            reverse = reverse * 10 + remainder;
            temporal /=10;
        }
        if (number == reverse){
            System.out.println(number + " Is a Palindrome");
        }else System.out.println(number +" Is not a Palindrome");
    }
}
