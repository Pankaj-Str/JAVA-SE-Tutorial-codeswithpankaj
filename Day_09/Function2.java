package Date_16_8_2023;

public class Function2 {
 // with arg. and without return type
    void info(String name,int age , float height){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Height : "+height);
    }
    public static void main(String[] args) {
        Function2 obj = new Function2();
        obj.info("Sonu",56,5.6f);
        obj.info("Suraj",78,4.6f);
    }
}
