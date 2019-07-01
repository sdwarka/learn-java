public class AsciiChar{
	
	public static void main(String[] args){
		for(char a = 0; a<=0xFF; a++){
			if(a == 10) continue;
			System.out.print( a +" ");
			if(a%15 ==0 )
			{
				System.out.println();
			}
		}
	}
}