package conditionalStatement;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
      
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Have key? Type true or false");
		 
		boolean carKey=sc.nextBoolean();
		
		if (carKey) {
    	   System.out.println("You have key and car so Drive");
    	   
      }else {
    	  System.out.println("Take a Taxi.");
      }
	}

}
