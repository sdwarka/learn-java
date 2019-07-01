public class SwitchStringEx{
	public static void main(String[] args)
	{
		//Declaring the string
		String levelString="Expert";
		int level = 0;
		switch(levelString){
			case "Beginner":level=1;
				break;
			case "Intermediate":level=2;
				break;
			case "Expert":level=3;
				break;
			default:level=0;
				break;
		}
		System.out.println("Your level is : "+level);
		
	}
}