package conditionalStatement;

public class CombinedOperator {
	
	public  static void main(String[] args) {
		int number1=43;
		int number2=43;
				
				if ((number1 %2 == 0)&&(number1>number2)) {
					System.out.println(number1 +" is even and greater than" + number2);
				
				}else if((number1 %2 == 0)&&(number1<number2)) {
					System.out.println(number1 +" is even and smaller than" + number2);
				}else if((number1 %2 == 1)&&(number1>number2)) {
					System.out.println(number1 +" is odd and greater than" + number2);
				}else if((number1 %2 == 1)&&(number1<number2)) {
					System.out.println(number1 +" is odd and smaller than" + number2);
				}else if ((number1 %2 == 0)&&(number1==number2)) {
					System.out.println(number1 +" is even and equal to" + number2);
				}else if((number1 %2 == 1)&&(number1==number2)) {
					System.out.println(number1 +" is odd and equal to" + number2);
				}
	}

}
