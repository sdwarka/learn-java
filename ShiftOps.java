public class ShiftOps{
	public static void main(String[] args)
	{
		System.out.println("10<<2 = " + (10<<2));
		System.out.println("10<<3 = " + (10<<3));
		System.out.println("20<<3 = " + (20<<2));
		System.out.println("15<<4 = " + (15<<4));
		
		//Right Shift ops
		System.out.println("10>>2 = " + (10>>2));
		System.out.println("10>>3 = " + (10>>3));
		System.out.println("20>>3 = " + (20>>3));
		System.out.println("15>>4 = " + (15>>4));
		
		//Shift OPerator >> Vs >>>
		
		//For positive number, >> and >>> works same
		System.out.println("20>>2 = " + (20>>2));
		System.out.println("20>>>2 = " + (20>>>2));
		//For negative number, >>> changes parity bit (MSB) to 0
		System.out.println("-20>>2 = " + (-20>>2));
		System.out.println("-20>>>2 = " + (-20>>>2));
		
	}
}