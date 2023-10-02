package Day_16_Inheritance.MultipleInheritance.Example;

interface Teacher{

    public void getTeacherName();

}
class Notes{

    void getNotes(){
        System.out.println("Java Development Course Notes..");
    }

}
class Students extends Notes implements Teacher{

    public void getTeacherName(){
        System.out.println("Your Teacher Name Neha");
    }

}


public class Schools {
    public static void main(String[] args) {
        Students students = new Students();
        students.getNotes();
        students.getTeacherName();
    }
    
}
