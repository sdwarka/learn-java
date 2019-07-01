public class Conversion{
	public static void main(String[] args){
		
		for(int a = 0; a<=1024; a = a+100){
			System.out.print("int a = " +a+", ");
			System.out.println("byte b = " +(byte)a);
		}
	}
}