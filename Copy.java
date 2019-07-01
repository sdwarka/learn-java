public class Copy
{
  public static void main(String[] args) {
	int len = args.length;
	
	//if you dont have 2 args, print usage and exit
	if(len!=2) {
		System.out.println("usage: Copy <source> <dest>");
		return;
	}
	//otherwise, if both args are the same, print message and exit
	else if(args[0].equals(args[1])) {
		System.out.println("Copy: <source> and <dest> are the same.");
		return;
	}

	//print what you are going to do and exit
	System.out.println("Copying " + args[0] + " to " + args[1]);

  }
}
  