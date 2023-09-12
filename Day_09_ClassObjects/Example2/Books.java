package Day_09_ClassObjects.Example2;
public class Books {

    void GetBooksInfo(){
        System.out.println("Codeswithpankaj- java hub");
    }
    
    void GetBooksPrice(int price){
        System.out.println("Books Price -- "+price);
    }
    
    public static void main(String[] args) {
        //ClassName ObjectName = new ClassName();
        Books obj = new Books();
        obj.GetBooksInfo(); 
        obj.GetBooksPrice(1300);
    }
}