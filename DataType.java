
public class DataType{
	
	public static void main(String[] args){
		//Define an int variable
		int num;
		num = 0;
		System.out.println("Integer num = " +num);
		
		//Define a char Variable
		char chr;
		chr = 'n';
		System.out.println("Character chr = " +chr);
		
		//Define a String variable
		String str;
		str = "Sai Geetha";
		System.out.println("String str = " +str);
		
		//Define a long Variable
		long lng;
		lng = 245665878L;
		System.out.println("long lng = " +lng);
		
		//Define a char Array
		char[] charray;
		charray = new char[5];
		charray[0] = 'a';
		charray[1] = 'b';
		charray[2] = 'c';
		charray[3] = 'd';
		charray[4] = 'e';
		System.out.println("Character array charray = " + charray[0]+charray[1]+charray[2]+charray[3]+charray[4]);
		
		//Print the length of the charray
		System.out.println("The length of charray is : " +charray.length);
		
		//Define a double variable
		double dble;
		dble = 37899798.78d;
		System.out.println("double dble = " +dble);
		
		//Define a float variable
		float flt;
		flt = 78788.9f;
		System.out.println("float flt = " +flt);
		
		//Define a boolean variable
		boolean blean;
		blean = true;
		System.out.println("boolean blean = " +blean);
	}
}