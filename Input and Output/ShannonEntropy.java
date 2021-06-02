
/* This program takes a command-line integer m; reads a sequence of integers between 1 and
 * m from standard input; and prints the Shannon entropy to standard output, with 4 digits
 * after the decimal point. 
 */

public class ShannonEntropy 
{
	public static void main(String args [])
	{
		int m = Integer.parseInt(args[0]);
		int [] set = StdIn.readAllInts();
		double prop = 0;
		double sum = 0;
		double [] counter = new double[m];
		for(int elem: set)
		{
			counter[elem-1] += 1;
		}
		for(double elem: counter)
		{
			if(elem == 0)
			{
				prop = 0;
			}
			else
			{
				prop = -(elem/set.length) * Math.log(elem/set.length)/Math.log(2);
			}
			sum += prop;
		}
		StdOut.print(String.format("%.4f", sum));
	}
}
