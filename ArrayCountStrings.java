package SunderyAlgorithms;

public class ArrayCountStrings {

    public static int CountIntegers(String [] arr){
        int count =0;
        for (String string: arr){
            for (int i = 0; i < string.length(); i++) {
                if (Character.isDigit(string.charAt(i))){
                count++;
                }
            }

        }
        return count;

    }

    public static void main(String[] args) {
        String  [] array = {"Ab15396", "Q2RBS7", "G381ac"};
        System.out.println(CountIntegers(array));
    }

}
