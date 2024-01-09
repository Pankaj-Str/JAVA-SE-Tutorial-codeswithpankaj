package Methods;

public class Client {
	
//	- Non Return type and Non Arguments 
    void get_info() {
		
		System.out.println("codeswithpankaj.com");
		System.out.println(" this is java tutorial....");
		System.out.println("client info : name : joy ");
	}
//	- Non Return type and With Arguments 
    
    void getresult(int price,int qt) {
    	
    	int mrp = price*qt;
    	
    	System.out.println("MRP : "+mrp);
    }
    
//	- With Return type and Non Arguments 
    
    int mrp() {
    	
    	return 900;
    }
    
//	- With Return type and With Aruments 
    
   long tax(long price,int gst) {
    	
    	long gst_price = (price*gst)/100;
    	long total_amount = gst_price+price;
    	
    	return total_amount;
    }
    
	
	
	

}
