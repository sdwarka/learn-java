public class ifElseIfExample{
	public static void main(String[] args){
		int marks = 75;
		if(marks<50){
			System.out.println("Marks is less than 50, result is " + "fail");
		}	
		else if(marks >= 50 && marks <60){
			System.out.println("Marks is >= 50 & < 60, grade is " + "D grade");
		}	
		else if(marks >= 60 && marks <70){
			System.out.println("Marks is >=60 & <70 , grade is " + "C grade");
		}	
		else if(marks >= 70 && marks <80){
			System.out.println("Marks is >= 70 & < 80, grade is "  + "B grade");
		}	
		else if(marks >= 80 && marks <90){
			System.out.println("Marks is >=80 & <90 , grade is "   + "A grade");
		}	
		else if(marks >= 90 && marks <100){
			System.out.println("Marks is >=90 & <100 , grade is "   + "A+ grade");
		}	
		else
		{
			System.out.println("invalid option");
				
		}
			
		
	}
}



