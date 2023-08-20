package Day_09;

public class Methods {

    // basic function 

    static void web(){
        System.out.println("www.codeswithpankaj.com");
    }

    // with arg.(peramiter)

    static void info(String website){
        System.out.println("Website Name "+website);
    }
    

    public static void main(String[] args) {
        web();
        web();
        info("@p4n.in");
        info("@codeswithpankaj.com");
    }
    
}
