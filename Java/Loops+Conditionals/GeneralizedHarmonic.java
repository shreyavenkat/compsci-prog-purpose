
/* This program takes two integer command-line arguments n and r and uses a for loop to
 * compute the nth generalized harmonic number of order r 
 */

public class GeneralizedHarmonic 
{
	public static void main (String args [])
	{
		int n = Integer.parseInt(args[0]);
		int r = Integer.parseInt(args[1]);
		double harmSum = 0;
		
		for (int denom = 1; denom <= n; denom++)
		{
			harmSum += 1 /Math.pow(denom,r );
		}
		System.out.println(harmSum);
	}
	
}
