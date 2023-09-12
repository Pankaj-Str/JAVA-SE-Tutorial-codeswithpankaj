package Day_09.Function;

class Function4{
    // - With Return type and With Arguments 
    
    static int tax(int price, int gst){
        gst = (price * gst)/100;
        int final_price = gst+price;
        return final_price;
    }
   
    
    public static void main(String[] agr){
            // call static function
            
            int mrp = tax(1200, 18);
            System.out.println(mrp+20);
            
       
    }

}