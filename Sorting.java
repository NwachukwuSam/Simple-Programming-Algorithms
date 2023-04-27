package SunderyAlgorithms;


import java.util.Scanner;

public class Sorting {

    public static int sortNumber(int number){
        String outCome = "";
        for (int i =0; i < String.valueOf(number).length(); i++){
            String newNumber = "";
            for (int j =0; j < String.valueOf(number).length(); j++){
                if (Integer.parseInt(String.valueOf(String.valueOf(number).charAt(j)))  < Integer.parseInt(String.valueOf(String.valueOf(number).charAt(i)))){
                    newNumber = String.valueOf(String.valueOf(number).charAt(j));
                }

            }
            if (!newNumber.equals("")){
                number = Integer.parseInt(String.valueOf(number).replace(newNumber, ""));
                outCome+=newNumber;
            }
        }
        return Integer.parseInt(outCome+number);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number:  ");
        int userInput = input.nextInt();
        System.out.println(sortNumber(userInput));

    }
}
