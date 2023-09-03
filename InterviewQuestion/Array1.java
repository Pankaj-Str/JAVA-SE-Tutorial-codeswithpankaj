package InterviewQuestion;

import java.util.Scanner;


public class Array1 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);


       int size = 1;
       String product[] = new String[100];
       System.out.println("Enter a Product " + size + " :=");


       for (int i = size - 1; i < size; i++) {
           product[i] = sc.next();
       }
//        System.out.println("Do you Want to add more [Y/N] :=");
//        char user=sc.next().charAt(0);
//        char temp=user;
       for (int k = 1; k < 100; k++) {
           System.out.println("Do you Want to add more [Y/N] :=");
           char user = sc.next().charAt(0);
           char temp = user;


           if (temp == 'n' || temp == 'N') {
               k = k + 100;
           } else if (temp == 'y' || temp == 'Y') {
               //while (temp == 'y' || temp == 'Y') {
               size = size + 1;
               int m = size - 1;
               System.out.println("Enter a Product " + size + " :=");
               for (int j = m; j < size; j++) {
                   product[j] = sc.next();


               }
//                    System.out.println("Do you Want to add more [Y/N] :=");
//                    char user2 = sc.next().charAt(0);
//                    temp = user2;
               //}
           } else {
               {
                   System.out.println("----------->Error<----------");
//                    System.out.println("Do you Want to add more [Y/N] :=");
//                    char user3 = sc.next().charAt(0);
//                    temp = user3;
               }
           }
       }




       int price[] = new int[size];
       int total = 0;
       for (int i = 0; i < size; i++) {
           System.out.println("Enter " + product[i] + " Price :=");
           price[i] = sc.nextInt();
           total = total + price[i];
       }
       System.out.println("Do you want to add GST [Y/N] := ");
       char input = sc.next().charAt(0);
       char copy = input;


       int gst = 0;
       int netgst = 0;
       for (int l = 1; l < 100; l++) {
           if (copy == 'y' || copy == 'Y') {
               System.out.println("Enter GST % :=");
               gst = sc.nextInt();
               System.out.println("------------");
               netgst = (total * gst) / 100;
               netgst = total + netgst;
               l = l + 100;
           } else if (copy == 'n' || copy == 'N') {
               System.out.println("------------");
               l = l + 100;
           } else {
               System.out.println("--------->Error<--------");
               System.out.println("Do you want to add GST [Y/N] := ");
               input = sc.next().charAt(0);
               copy = input;
           }
       }
       for (int i = 0; i < size; i++) {
           System.out.println((i + 1) + ". " + product[i] + " = " + price[i] + " Rs");


       }
       System.out.println("------------");
       System.out.println("Total := " + total);
       if (input == 'y' || input == 'Y') {
           System.out.println("GST := " + gst);
           System.out.println("------------");
           System.out.println("Final Total :=" + netgst);




       }
   }
}

