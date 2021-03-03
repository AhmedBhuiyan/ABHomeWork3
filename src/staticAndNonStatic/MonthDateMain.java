package staticAndNonStatic;

public class MonthDateMain {

	public static void main(String[] args) {
    
		
		MonthDate month=new MonthDate();
		month.setMonth("January");
		System.out.println("This is "+month.Month +"month and");
		
	
		MonthDate date=new MonthDate();
		date.setDate(20);
		System.out.println("Today is "+ date.Date);
	}

}
