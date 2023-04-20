package SunderyAlgorithms;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DateConverter {

        public static void convertDate(String input){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date date = (Date) dateFormat.parseObject(input);

            System.out.println("Actual Date: " + date);
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        }
    }

    public static String formatDate(String [] dob){
        LocalDate localDate = LocalDate.of(Integer.parseInt(dob[0]), Integer.parseInt(dob[1]), Integer.parseInt(dob[2]));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" EEEE d MMMM M yyyy");
        return formatter.format(localDate);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date in dd/mm/yyyy format: ");
        System.out.println();

        String input = scanner.nextLine();
        convertDate(input);

        System.out.println("Enter a date: ");

    }
}
