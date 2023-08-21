package Date_21_08_2023;

public class Course {

    // default Constructor
    Course(){
        System.out.println("www.p4n.in");
    }
    Course(String web){
        System.out.println("this is website : "+web);
    }
    public static void main(String[] args) {
        // Create a object
        Course course = new Course();
        Course course1 = new Course("www.codeswithpankaj.com");

    }
}
