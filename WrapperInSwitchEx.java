public class WrapperInSwitchEx{
	public static void main(String[] args)
	{
		Integer age = 65;
		switch(age)
		{
			case(16):
				System.out.println("You are under 18");
				break;
			case(18):
				System.out.println("You are eligible to vote");
				break;
			case(65):
				System.out.println("You are a Senior Citizen");
				break;
			default:
				System.out.println("Please gave a valid age");
				break;
		}
				
	}
	
}