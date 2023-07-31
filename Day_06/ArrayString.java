

public class ArrayString {
    
    public static void main(String[] args) {
        
        // Step 1 Declare an array of integers

        String website[] = new String[4];

        // Step 2 Initialize the array with values
        
       website[0] = "www.p4n.in";
       website[1] = "www.codeswithpankaj.com";
       website[2] = "www.p4n.store";
       website[3] = "www.pn2.in";     

        // Step 3  Access all and print array elements  

        // System.out.println(website[2]);

        System.out.println("======= website list ==========");

        for (int i = 0; i < website.length; i++) {
            System.out.println((i+1)+" - "+website[i]);
        }
      
    }

}
