package jun_12_2023;

public class If_else2 {

	public static void main(String[] args) {
	
		
		int num1, num2, num3;
		num1 = 10;
		num2 = 8;
		num3 = 0;
		
		if(num1 < num2 && num1 < num3) {
			
			System.out.println("number 1 is smallest .. " +num1);
		}else {
			
			
			if(num2 < num1 && num2 < num3) {
				
				System.out.println("number 2 is smallest .. " +num2);
			}else {
				
				System.out.println("number 3 is smallest .. " +num3);
				
			}
			
		}

	}

}
