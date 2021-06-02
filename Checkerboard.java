
/* This program takes a command-line integer n and plots an n-by-n checkerboard pattern to
 * standard drawing. Color the squares blue and light gray, with the bottom-left square
 * blue.
 */

public class Checkerboard 
{
	public static void main (String args[])
	{
		double n = Integer.parseInt(args[0]);
		StdDraw.setScale(0, n);
		StdDraw.setPenRadius();
		for(int a = 0; a < n; a++)
		{
			for(int b = 0; b < n; b++)
			{
				if((a % 2) == (b % 2))
				{
					StdDraw.setPenColor(StdDraw.BLUE);
				}
				else
				{
					StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
				}
				StdDraw.filledSquare((0.5+b), (0.5+a), 0.5);
			}
		}
	}
}
