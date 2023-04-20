package SunderyAlgorithms;

import java.util.Scanner;


public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int prime = 0;
        System.out.println("Enter a number");
        int number = input.nextInt();

        for (int i= 2; i < number; i++){
            if(number % i == 0){
                prime++;
            }
        }
        if (prime == 0){
            System.out.print(number+ " is a prime number");}
        else {
            System.out.println(number + " is not a prime number");
        }


    }

}
