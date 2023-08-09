public class Function1 {
    // Basic
    static void website(){
        System.out.println("www.codeswithpankaj.com");
    } 

    // Arg.
    static void info(String website){
        System.out.println(website);
    }

    static void add(int a,int b){
        int result = a+b;
        System.out.println("this is result : "+result);
    }

    public static void main(String[] args) {
        website();
        info("p4n.in");
        info("codeswithpankaj");
        add(45, 78);
        add(45, 455);
    }
    
}
