
/* This program takes an integer command-line argument r and simulates the motion of a
 * random walk until the random walker is at Manhattan distance r from the starting point.
 * Prints the coordinates at each step of the walk (including the starting and ending
 * points), treating the starting point as (0, 0). Also prints the total number of steps
 * taken.
 */

public class RandomWalker 
{
	public static void main (String args[])
	{
		int r = Integer.parseInt(args[0]);
		int x = 0;
		int y = 0;
		int steps = 0;
		double a;
		
		System.out.println("(" + x + ", " + y + ")");
		
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
			System.out.println("(" + x + ", " + y + ")");
			a = 0;
		}
		System.out.println("steps = " + steps);
		
	}
}
