package Day_09.Function;

class Function3{
    // - With Return type and Non Arguments 
    
   static int getnumber(){
    return 900;
   }

   static float getfloatnumber(){
    return 3.4f;
   }
   static String getname(){
    return "@p4n.in";
   }
    
    public static void main(String[] agr){
            // call static function 
            System.out.println(getnumber());
            System.out.println(getname());
            System.out.println(getfloatnumber());
       
    }

}