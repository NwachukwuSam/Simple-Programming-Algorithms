package SunderyAlgorithms;

import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int winningCode = (int) (Math.random()*1000);

        System.out.println("Enter Your three digit lucky number: ");
        int luckyNumber = input.nextInt();

        int luckyNumberDigit1 = luckyNumber/100%10;
        int luckyNumberDigit2 = luckyNumber/10%10;
        int luckyNumberDigit3 = luckyNumber%10;
        
        int winningCodeDigit1 = winningCode/100%10;
        int winningCodeDigit2 = winningCode/10%10;
        int winningCodeDigit3 = winningCode%10;

        System.out.println("Your Lottery Number is "+winningCode);
        
        if (luckyNumber == winningCode)
            System.out.println("Congratulations!! You just won €10,000");
         else if (luckyNumberDigit1 == winningCodeDigit2
        && luckyNumberDigit2 == winningCodeDigit3
        && luckyNumberDigit3 == winningCodeDigit1
        && luckyNumberDigit1 == winningCodeDigit3
        && luckyNumberDigit2 == winningCodeDigit1
        && luckyNumberDigit3 == winningCodeDigit2)
            System.out.println("Congratulations You match all digits!! You just won €3,000");
         else if (luckyNumberDigit1 == winningCodeDigit1
        || luckyNumberDigit2 == winningCodeDigit1
        || luckyNumberDigit3 == winningCodeDigit3
        || luckyNumberDigit2 == winningCodeDigit3
        || luckyNumberDigit3 == winningCodeDigit1
        || luckyNumberDigit1 == winningCodeDigit3
        || luckyNumberDigit3 == winningCodeDigit2)
             System.out.println("Congratulations You Match one digit!! You just won €1,000");
         else
            System.out.println("Sorry! Try Again Some other time");

    }
}
