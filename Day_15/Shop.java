package Aug_23_2023;

public class Shop {


        int price;
        String food;

        void get_info(int price , String food){
            this.price = price;
            this.food = food;
        }

        void info(){
            System.out.println(price);
            System.out.println(food);
        }

    public static void main(String[] args) {
        Shop s = new Shop();
        s.get_info(400,"samosa");
        s.info();
        s.get_info(405,"toy");
        s.info();
    }

}
