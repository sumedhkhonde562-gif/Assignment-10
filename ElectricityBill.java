package bill;

import java.util.Scanner;

public class ElectricityBill {
	
	  public static void main(String[] args) {
		  
	        Scanner sk = new Scanner(System.in);

	        int units = sk.nextInt();
	        
	        int bill = 0;

	        if (units <= 100) {
	        	
	            bill = units * 5;
	            
	        } else 
	        	
	        	if (units <= 200) {
	        		
	            bill = (100 * 5) + ((units - 100) * 7);
	        } else {
	        	
	            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
	        }

	        System.out.println(bill);

	        sk.close();
	    }

}
