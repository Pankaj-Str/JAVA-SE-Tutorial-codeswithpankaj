public class CustomerData {
    
    // Constructor
    CustomerData(){
        System.out.println("Customer Order ID : A001");
    }
    CustomerData(int id){
        System.out.println("Customer QT ID : "+id);
    }
    // methods
    void GetInfo(){
        System.out.println("Welcome To p4n");
    }
    void GetInfo(String name){
        System.out.println("Customer Name : "+name);
    }
    void GetInfo(int age){
        System.out.println("Customer Age : "+age);
    }
    void GetInfo(String Address, long mobile){
        System.out.println("Customer Address : "+Address);
         System.out.println("Customer Mobile : "+mobile);
    }

    public static void main(String[] arg){
        CustomerData cd = new CustomerData();
        CustomerData cd1 = new CustomerData(4004);
        cd.GetInfo();
        cd.GetInfo("Esha");
        cd.GetInfo(22);
        cd.GetInfo("Andheri",7894561231l);
    }
}
