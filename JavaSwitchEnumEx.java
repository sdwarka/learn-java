public class JavaSwitchEnumEx{
	
	//define an enumerated list representing the days of a week
	public enum Day {Sun, Mon, Tue, Wed, Thu, Fri, Sat}
	
	public static void main(String[] args)
	{
		//get an array of values representing days of the week
		Day[] days = Day.values();
		
		//iterate through the days of the week array and println
		//the values

		/* the code below represents the short form of the
		   for loop below
		for(int i = 0; i<days.length; i++) {
			Day today = days[i];
			System.out.println(today);
		}
		*/
		
		//"for each day in days[]"
		//short form of the for loop
		for(Day today : days)
		{
			System.out.println(today);
			
			switch(today)
			{
				case Sun:
					System.out.println("Sunday");
					break;
				case Mon:
					System.out.println("Monday");
					break;
				case Tue:
					System.out.println("Tuesday");
					break;
				case Wed:
					System.out.println("Wednesday");
					break;
				case Thu:
					System.out.println("Thursday");
					break;
				case Fri:
					System.out.println("Friday");
					break;
				case Sat:
					System.out.println("Saturday");
					break;
			}
		}
	}
}
