public class SysEnv
{
	public static void main(String[] args) {
		String rdlHome = System.getenv("RDL_HOME");

		if(rdlHome == null) {
			System.out.println("Warning: RDL_HOME is null.");
		}
		else
			System.out.println("RDL_HOME = " + rdlHome);
	}
}
