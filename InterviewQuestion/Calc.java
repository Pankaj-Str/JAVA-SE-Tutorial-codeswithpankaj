package InterviewQuestion;

import java.util.Scanner;
class Calc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Birth Year: ");
        int birth_year = sc.nextInt();
        System.out.println("Enter Your Birth Month: ");
        int birth_month = sc.nextInt();
        System.out.println("Enter Your Birth Day: ");
        int birth_day = sc.nextInt();
        
        System.out.println("\n");
        System.out.println("Enter Current Year: ");
        int current_year = sc.nextInt();
        System.out.println("Enter Current Month: ");
        int current_month = sc.nextInt();
        System.out.println("Enter Current Day: ");
        int current_day = sc.nextInt();

        //years
        if(current_year>birth_year){

            System.out.println("year: "+(current_year-birth_year));
        }
        else {
            System.out.println("year: "+(birth_year-current_year));
        }

        //months
        if(current_month>birth_month){
            System.out.println("month: "+(current_month - birth_month));
        }
        else {
            System.out.println("month: "+(birth_month-current_month));
        }

        //days
        if(current_day>birth_day){

            System.out.println("days: "+(current_day - birth_day));
        }
        else {
            System.out.println("days: "+(birth_day-current_day));
        }
    }
}
