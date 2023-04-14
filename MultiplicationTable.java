package SunderyAlgorithms;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Row: ");
        int row = input.nextInt();

        System.out.println("Enter the Column: ");
        int column = input.nextInt();

        System.out.println();

        System.out.print("                         MULTIPLICATION TABLE");
        System.out.println();
            int i;
        for (i = 1; i <= row; i++) {
            System.out.print(" ");
            System.out.printf("%6d",i);

        }
        System.out.println();
        System.out.print("--------------------------------------------------------------------");
        System.out.println();

            for (int j = 1; j <= column; j++) {
                System.out.print(j+"|");
                for (int x = 1; x <= column; x++) {
                System.out.printf("%7d",j*x);

        }
        System.out.println();
//        
        }



    }
}
