package Day_3;

public class LogicalOperators {

	public static void main(String[] args) {
	
			// and &&
			// left side | right side = result
			//		T	 |		T	  =  T	
			//		T	 |		F	  =  F	
			//		F	 |		T	  =  F	
			//		F	 |		F	  =  F
		
		// OR ||
		// left side | right side = result
		//		T	 |		T	  =  T	
		//		T	 |		F	  =  T	
		//		F	 |		T	  =  T	
		//		F	 |		F	  =  F
		
		System.out.println(90 < 78 && 45 <=67 );
		System.out.println(90 < 78 || 45 <=67 );
		System.out.println(90!=90);
					

	}

}
