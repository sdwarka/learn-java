public class ShortOpEx{
	public static void main(String[] args){
		short a = 10;
		short b = 10;
		//a+=b; //a= a+b internally so fine
		//a = a+b; // compile time error because 10+10 = 20 now int
		//System.out.println(a);
		
		a =(short)(a+b);//20 which is now converted to short
		System.out.println(a);
	}

}