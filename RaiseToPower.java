package SunderyAlgorithms;

import java.util.Scanner;

public class RaiseToPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number and the power to which it should be raised: ");
        int num = input.nextInt();
        int pow = input.nextInt();


        System.out.println(num+ " raised to the power of "+ pow +" is == "+ raiseToPower(num, pow));
    }
    public static int raiseToPower(int number, int power){
        int answer =1;
        for (int i = 1; i <= power; i++) {
            answer*=number;
        }
        return answer;
    }
}
