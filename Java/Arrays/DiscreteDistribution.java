
/* This program takes an integer command-line argument m, followed by a sequence of
 * positive integer command-line arguments a1,a2,…,an, and prints m random indices
 * (separated by whitespace), choosing each index i with probability proportional to ai.
 */

public class DiscreteDistribution 
{
	public static void main (String args[])
	{
		int m = Integer.parseInt(args[0]);
		int sumPart = 0;
		int[] values = new int[(args.length) - 1];
		int[] sums = new int[(args.length)];
		sums[0] = 0;

		for (int i = 0; i < args.length - 1; i++)
		{
			values[i] = (Integer.parseInt(args[i+1]));
			sumPart += values[i];
			sums[i+1] = sumPart;
		}
		
		int count = 0;
		while (count < m)
		{
			int r = (int) (Math.random() * sums[sums.length - 1]);
			for (int k = 1; k < sums.length; k++)
			{
				if ((r < sums[k]) && (r >= sums[k-1]))
				{
					System.out.print(k + " ");
					count++;
				}
			}
		}
	}
	
}
