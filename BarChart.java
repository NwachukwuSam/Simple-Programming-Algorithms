package SunderyAlgorithms;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five Numbers");
        int numbers = input.nextInt();
        int num = input.nextInt();
        int num2 = input.nextInt();
        int num4= input.nextInt();
        int num3 = input.nextInt();

        inputsToManipulate(numbers,num2, num,num4,num3);
    }
    public static void inputsToManipulate(int number1, int number2, int number3, int number4, int number5){
        String first = "";
        String second = "";
        String third = "";
        String fourth = "";
        String fifth = "";

        for (int i = 0; i < number1; i++) {
            first += "* ";
        }
        for (int i = 0; i < number2; i++) {
            second+="* ";
        }
        for (int i = 0; i < number3; i++) {
            third +="* ";
        }
        for (int i = 0; i < number4; i++) {
            fourth +="* ";
        }
        for (int i = 0; i < number5; i++) {
            fifth +="* ";
        }

        System.out.println(first +"\n"+ second+"\n"+ third +"\n"+fourth+"\n"+fifth);
    }
}
