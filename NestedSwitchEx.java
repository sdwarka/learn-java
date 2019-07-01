public class NestedSwitchEx{
	public static void main(String[] args)
	{
		//C - CSE, E - ECE, M - Mechanical
		char branch = 'E';
		int collegeYear = 3;
		switch(collegeYear)
		{
			case 1:
				System.out.println("English, Maths, Science");
				break;
			case 2:
				switch(branch)
				{
					case 'C':
						System.out.println("Operating System, Java Data Structure");
						break;
					case 'E':
						System.out.println("Micro processors, Logic Switching hteory");
						break;
					case 'M':
						System.out.println("Drawing, Manufaturing Machines");
						break;
					}
					break;
			case 3:
				switch(branch)
				{
				case 'C':
					System.out.println("Computer Oraganization, Mutli media"); 
					break;
				case 'E':
					System.out.println("Fundamentals of Logic Design, Micro electronics{);, Logic Switching hteory");
					break;
				case 'M':
					System.out.println("Internal Combustion Engines, Mchanical Vibration");
					break;
				
				}
			break;
		case 4:
			switch(branch)
			{
				case 'C':
					System.out.println("Data Communication & Networks, MultiMedia"); 
					break;
				case 'E':
					System.out.println("Embedded System, Image Processing");
					break;
				case 'M':
					System.out.println("Production Technology, Thermal Engineering");
					break;
				
			}
			break;	
	}
}
}