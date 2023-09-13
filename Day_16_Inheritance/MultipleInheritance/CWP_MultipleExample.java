package Day_16_Inheritance.MultipleInheritance;


class student{
        void GetStudentInfo(){
            System.out.println("Student : Mumtaz");
            System.out.println("Student  : Joy");
        }
}
class books extends student{
        void GetBooks(){
            System.out.println("JAVA Development");
            System.out.println("Python development");
        }
}
class Subject extends student{
        void GetSubejct(){
            System.out.println("Inheritance....");
            System.out.println("Numpy....");
        } 
}


public class CWP_MultipleExample {
        public static void main(String[] args) {
          
          
          books book = new books();
          book.GetBooks();
          book.GetStudentInfo();  

          Subject subjects = new Subject();
          subjects.GetSubejct();
          subjects.GetStudentInfo();


        }
}
