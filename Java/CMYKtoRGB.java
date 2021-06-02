
/* This program takes four command-line arguments for cyan, magenta, yellow, and black (in that order) and prints the red, green, and blue equivalents for the resulting color. */

public class CMYKtoRGB 
{
	public static void main (String args[])
	{
		double cyan = Double.parseDouble(args[0]);
		double magenta = Double.parseDouble(args[1]);
		double yellow = Double.parseDouble(args[2]);
		double black = Double.parseDouble(args[3]);
		double white = 1 - black;
		int red = (int) ((255 * white * (1 - cyan)) + 0.5);
		int green = (int) ((255 * white * (1 - magenta)) + 0.5);
		int blue = (int) ((255 * white * (1 - yellow)) + 0.5);
		System.out.println ("red = " + red);
		System.out.println ("green = " + green);
		System.out.println ("blue = " + blue);
	}
}
