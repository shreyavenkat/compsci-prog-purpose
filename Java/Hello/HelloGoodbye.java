
/* This program takes two command-line arguments as names, and prints a Hello and Goodbye message for those names */

public class HelloGoodbye 
{

	public static void main(String[] args) 
	{
		System.out.println("Hello " + args[0] + " and " + args[1] + ".");
		System.out.println("Goodbye " +args[1] + " and " + args[0] + ".");
	}

}
