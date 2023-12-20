import java.util.Scanner;
class WeekName{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Day Number : 1 Monday, 2 Tuesday, 3 Wednesday, 4 Thursday, 5 Friday, 6 Saturday, and 7 Sunday.");

        int day = sc.nextInt();
        switch (day) {
            
            case 1: System.out.println("the Day is Monday : ");
            break;
            case 2: System.out.println("the Day is Tuesday : ");
            break;
            case 3: System.out.println("the Day is Wednesday : ");
            break;
            case 4: System.out.println("the Day is Thursday : ");
            break;
            case 5: System.out.println("the Day is Friday : ");
            break;
            case 6: System.out.println("the Day is Saturday : ");
            break;
            case 7: System.out.println("the Day is Sunday : ");
            default:
                    System.out.println("Enter only 1 - 7 : ");
        }


    }


}