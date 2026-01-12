package login;

import java.util.Scanner;


public class CompanyLoginSystem {
	
	public static void main(String[] args) {
		
        Scanner sk = new Scanner(System.in);

        int correctPassword = 1234;
        
        boolean success = false;

        for (int i = 1; i <= 3; i++) {
        	
            int enteredPassword = sk.nextInt();

            if (enteredPassword == correctPassword) {
            	
                success = true;
                break;
            }
        }

        if (success) {
        	
            System.out.println("LOGIN SUCCESSFUL");
        } else {
        	
            System.out.println("ACCOUNT LOCKED");
        }

        sk.close();
    }

}
