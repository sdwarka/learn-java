public class EnvironmentVariablePrinter{
	public static void main(String[] args){
		String computerName = System.getenv("COMPUTERNAME");
		String sessioName = System.getenv("SESSIONNAME");
		String prompt = System.getenv("PROMPT");
		String path = System.getenv("PATH");
		String psModulePath = System.getenv("PSModulePath");
		
		
		System.out.println("Printing Environment variables");
		
		System.out.println("COMPUTERNAME = " + computerName);
		System.out.println("SESSIONNAME = " + sessioName);
		System.out.println("PROMPT  = " + prompt);
		System.out.println("PATH = " + path);
		System.out.println("psModulePath = " + psModulePath);		
	}
}