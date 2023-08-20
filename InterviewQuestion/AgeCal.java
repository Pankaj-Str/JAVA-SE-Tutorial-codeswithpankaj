package InterviewQuestion;
import java.util.Scanner;
import java.time.LocalDate;
public class AgeCal {
    public static void main(String[] args) {
        int b_day,b_month,b_year;
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter you name :-");
        name=sc.next();

        System.out.println("Enter your birthday date:-");
        b_day=sc.nextInt();

        System.out.println("Enter your birthday month:-");
        b_month=sc.nextInt();

        System.out.println("Enter your birthday year:-");
        b_year=sc.nextInt();

        int c_day=LocalDate.now().getDayOfMonth();
        System.out.println(c_day);
        int c_month=LocalDate.now().getMonthValue();
        System.out.println(c_month);
        int c_year=LocalDate.now().getYear();
        System.out.println(c_year);

        if (c_day>=b_day && c_month>=b_month && c_year>=b_year) {

            b_day=c_day-b_day;
            b_month=c_month-b_month;
            b_year=c_year-b_year;

            System.out.println(name+"Your Age:"+b_day+"Days"+b_month+" Months "+b_year+" Years");

        }
        else {

            //find day
            b_day=(c_day+30)-b_day;
            c_month--;
            c_month+=b_day/30;
            b_day=b_day%30;

            //find months
            b_month=(c_month+12)-b_month;
            c_year--;
            c_year+=b_month/12;
            c_month=b_month%12;

            //find years
            b_year=c_year-b_year;

            //print Age on Screen

            System.out.println(name+" Your Current Age: "+b_day+" Days "+b_month+" Months "+b_year+" Years Old");

        }
}
}
