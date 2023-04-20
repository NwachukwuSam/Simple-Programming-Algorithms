package SunderyAlgorithms;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
    public static Period calculateAge(String dateOfBirth){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(dateOfBirth, dateFormat);

        LocalDate todayDate = LocalDate.now();

        Period age = Period.between(localDate,todayDate);
        return age;

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Date of Birth: ");
        String date = input.nextLine();

        System.out.println("You Are "+calculateAge(date).getYears() +" Years "+calculateAge(date).getMonths()+" Months and "+calculateAge(date).getDays()+ " days old");
    }
}
