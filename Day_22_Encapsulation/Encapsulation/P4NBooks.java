package Day_22_Encapsulation.Encapsulation;


class DBook{

    int price;
    int qt;
    String bookName;

    public DBook(int price, int qt, String bookName) {
        this.price = price;
        this.qt = qt;
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public int getQt() {
        return qt;
    }

    public String getBookName() {
        return bookName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }  
}


public class P4NBooks {


    public static void main(String[] args) {
    
        DBook db = new DBook(450, 12, "codeswithpankaj");

        System.out.println("Book Name : "+db.getBookName());
        int total_price =  db.getPrice()*db.getQt();
        System.out.println("Total Price Name : "+total_price);

        db.setPrice(750);
        db.setQt(56);
        System.out.println("New price : - "+db.getPrice());
        int total_price1 =  db.getPrice()*db.getQt();
        System.out.println("Total Price Name : "+total_price1);
        

    }
    
}
