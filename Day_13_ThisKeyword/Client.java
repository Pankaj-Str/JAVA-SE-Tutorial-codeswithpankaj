package jan_18_2024;

public class Client {


	String Client_Name;
	int Client_Id;
	
	public Client(String Client_Name, int Client_Id) {
		this.Client_Name = Client_Name;
		this.Client_Id = Client_Id;
	
	}
	
	void info() {
		
		if(Client_Name != null) {

			System.out.println("Customer Name "+Client_Name);
			System.out.println("Customer ID "+Client_Id);
		}else {
			System.out.println("Data Not Found...");
		}
	}
	
	
	
	
}
