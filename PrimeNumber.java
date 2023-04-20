package SunderyAlgorithms;

import java.util.Scanner;

public class PrimeNumber {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            System.out.print("Enter a Number: ");
            int number = input.nextInt();
            int primeNumber = 0;
            int f = 2;

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    primeNumber++;
                }
            }
                if(primeNumber == 1)
                System.out.println(number + " is a Prime Number");
                else{
                    System.out.println(number + " is Not a Prime Number");
                }



        }

    }

