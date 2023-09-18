package codeswithpankaj.com.Polymorphism;

public class Food {
    // Overloading
    void info(){
        System.out.println("Food Name - 1 Samosa");
        System.out.println("Food Name - 2 kachori");
        System.out.println("Food Name - 3 fafda");
    }
    void info(int price){
        System.out.println("Food Price - "+price);
    }

    void info(int price , int gst){
        System.out.println("MRP : - "+(price+gst));
    }

    public static void main(String[] args) {
        Food food = new Food();
        food.info();
        food.info(1200);
        food.info(1200,18);
    }
}
