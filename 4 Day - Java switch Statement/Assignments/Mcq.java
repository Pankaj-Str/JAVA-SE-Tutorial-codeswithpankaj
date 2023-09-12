import java.util.Scanner;
class Mcq{


public static void main(String[] args) {
 
Scanner sc = new Scanner(System.in);    
// Question 1.
// Pollination by Bat is called :
// (a) Omithorphily
// (b) Entemophily
// (c) Cheropterophily
// (d) Hydrophily

System.out.println("\nQuestion 1.\n");
System.out.println("Pollination by Bat is called :");
System.out.println("(a) Omithorphily");
System.out.println("(b) Entemophily");
System.out.println("(c) Cheropterophily");
System.out.println("(d) Hydrophily");

System.out.println(" \nSelect One Option ---- \n");

String option = sc.next();

String answer = "Please Select One";
option = option.toLowerCase();
switch(option.toLowerCase()){

    case "a" : answer = "Omithorphily";
               System.out.println("Worng Answer"); 
    break;
    case "b" : answer = "Entemophily";
               System.out.println("Worng Answer"); 
    break;
    case "c" : answer = "Cheropterophily";
    break;
    case "d" : answer = "Hydrophily";
               System.out.println("Worng Answer"); 
    break;
    default : System.out.println("Not include into option Select Again...");

}

    System.out.println("Answer: "+answer);

}

}