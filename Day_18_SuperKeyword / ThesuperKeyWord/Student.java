class Books{

    void info(){
        System.out.println("JAVA Development....");
    }

}

class topic extends Books{
    void info(){
        super.info();
        System.out.println("Use Super Keyword");
    }
}


class Student{
    public static void main(String[] args) {
       topic t = new topic();
       t.info(); 
       
    }
}