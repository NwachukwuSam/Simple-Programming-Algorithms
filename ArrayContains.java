package AlgorithmsSundry;

public class ArrayContains {

    public static boolean checkNumbers(int num){
        int numbers [] = {10, 4, 5, 7, 8, 11};
        for (int i = 0; i < numbers.length ; i++) {
            if (num == numbers[i]){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkNumbers(100));
    }

}
