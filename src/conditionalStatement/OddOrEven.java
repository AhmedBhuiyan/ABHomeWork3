package conditionalStatement;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		
		Scanner n=new Scanner(System.in);
		System.out.println("Type your desired number");

		int number=n.nextInt();
		
		if(number % 2==0){
			System.out.println("The number "+number+" is even");
			
		}else {
			System.out.println("The number "+number+" is odd.");
		}

	}

}
