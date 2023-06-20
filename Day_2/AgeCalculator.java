// In this program, we use the Scanner class to read user input for the birth year, birth month, and birth day. 
// We create a LocalDate object for the current date using LocalDate.now().
// We also create a LocalDate object for the birth date using the provided year, month, and day.
// We calculate the age using the Period.between() method, which gives us the difference between the birth date and the current date in terms of years, months, and days. 
// We extract the years, months, and days from the Period object.

// We then calculate the total number of months, weeks, days, hours, minutes, and seconds by using appropriate methods from the LocalDate class.

// Finally, we print the calculated age in the desired format by concatenating the values with appropriate strings using the println() method of the System.out object.


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        System.out.print("Enter your birth month: ");
        int birthMonth = input.nextInt();

        System.out.print("Enter your birth day: ");
        int birthDay = input.nextInt();

        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        Period age = Period.between(birthDate, currentDate);
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();

        int totalMonths = years * 12 + months;
        int totalWeeks = (int) birthDate.until(currentDate).toTotalMonths() / 4;
        int totalDays = (int) birthDate.until(currentDate).toTotalDays();
        long totalHours = birthDate.until(currentDate).toTotalHours();
        long totalMinutes = birthDate.until(currentDate).toTotalMinutes();
        long totalSeconds = birthDate.until(currentDate).toTotalSeconds();

        System.out.println("Age:");
        System.out.println(years + " years " + months + " months " + days + " days");
        System.out.println(totalMonths + " months " + days + " days");
        System.out.println(totalWeeks + " weeks " + days + " days");
        System.out.println(totalDays + " days");
        System.out.println(totalHours + " hours");
        System.out.println(totalMinutes + " minutes");
        System.out.println(totalSeconds + " seconds");
    }
}
