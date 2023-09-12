public class School {
    String StudentName;
    int RollNumber;
    void info(){
        System.out.println("Student Name : "+StudentName);
        System.out.println("Student RollNumber : "+RollNumber);
    }
}
class MainSchool {

    public static void main(String[] args) {
        // Create a object
        School sc = new School();
        sc.RollNumber = 1002;
        sc.StudentName = "Mumtaz";

        sc.info();
    }
}
