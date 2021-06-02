
/* This program takes two integer command-line arguments r and trials. In each of trials
 * independent experiments, it simulates a random walk until the random walker is at
 * Manhattan distance r from the starting point. Prints the average number of steps.
 */

public class RandomWalkers 
{
	public static void main (String args [])
	{
		int r = Integer.parseInt(args[0]);
		int trials = Integer.parseInt(args[1]);
		int x = 0;
		int y = 0;
		int steps = 0;
		double totalSteps = 0;
		double a;
		for (int i = 0; i < trials; i++)
		{
			x = 0;
			y = 0;
			steps = 0;
			
			while ((Math.abs(x) + Math.abs(y)) != r)
			{
				a = Math.random();
				if (a > 0.75)
				{
					x += 1;
				}
				else if (a > 0.5) 
				{
					x -= 1;
				}
				else if (a > 0.25)
				{
					y += 1;
				}
				else
				{
					y -= 1;
				}
				steps++;
				a = 0;
			}
			totalSteps += steps;
		}
		System.out.println("average number of steps = " + (totalSteps/trials));
	}
}
