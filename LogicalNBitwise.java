public class LogicalNBitwise{
	public static void main(String[] args){
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println((a<b)&&(a<c));//false && true = false
		System.out.println((a<b)&(a<c));//false & true = false
		
		//Logical && vs Bitwise &
		
		System.out.println((a<b)&&(a++<c));//false && true = false
		System.out.println(a);//10 because 2nd condition is not checked
		System.out.println((a<b)&(a++<c)); //false && true = false
		System.out.println(a);// 11 because second condition is checked


		System.out.println(a>b||a<c);//true||true = true
		System.out.println(a>b| a<c);//true|true = true
		
		//||vs |
		System.out.println(a);
		System.out.println((a>b)||(a++<c));//true || true = true
		System.out.println(a);//10 because 2nd condition is not checked
		System.out.println((a>b)|(a++<c)); //true | true = true
		System.out.println(a);// 11 because second condition is checked

	}
}