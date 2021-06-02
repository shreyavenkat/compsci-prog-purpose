
/* This program takes three int command-line arguments and determines whether they
 * constitute the side lengths of some right triangle.
 */

public class RightTriangle 
{
	public static void main (String args [])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		double aSq = Math.pow(b, 2) + Math.pow(c, 2);
		double bSq = Math.pow(a, 2) + Math.pow(c, 2);
		double cSq = Math.pow(a, 2) + Math.pow(b, 2);
		System.out.println ((a > 0 && b > 0 && c > 0) && ((aSq == Math.pow(a, 2)) || (bSq == Math.pow(b, 2)) || (cSq == Math.pow(c, 2))));
	}
}
