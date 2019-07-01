public class leapYearEx{
	public static void main(String[] args)
	{
		int year = 2019;
		if((year%4 ==0) && (year%100 !=0 ) ||(year%400 ==0)){
			System.out.print("The give year is a leap year " +year);
			}
		else{
				System.out.println("The given year is not a leap year " +year);
			}
	}
}