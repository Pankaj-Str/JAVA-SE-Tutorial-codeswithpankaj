package Day_09.Function;

class Function2{
    // Non Return type and With Arguments 
    
    static void info(String Website){

        // function body 
        System.out.println("Your Website Name : "+Website);
    } 
    
    static void intro(String name , int age , float height){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Height : "+height);
    }

    public static void main(String[] agr){
            // call static function 
            info("@p4n.in");
            info("@codeswithpankaj.com");

            intro("Joy",12,3.4f);
            intro("Toy",22,6.7f);
    }

}