
/* This program reads boundary information of a country (or other geographic entity) from
 * standard input and plots the results to standard drawing. A country consists of a set
 * of regions (e.g., states, provinces, or other administrative divisions), each of which
 * is described by a polygon.
 */

/* Input format:  
 * The first line contains two integers: width and height. The remaining part of the input
 * is divided into regions. The first entry in each region is the name of the region. For
 * simplicity, names will not contain spaces. The next entry is an integer specifying the
 * number of vertices in the polygon describing the region. Finally, the region contains
 * the x- and y-coordinates of the vertices of the polygon.
 */

public class WorldMap 
{
	public static void main(String args[])
	{
		int width = StdIn.readInt();
		int height = StdIn.readInt();
		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);
		String name = null;
		int verNum = 0;
		double [] vertex = null;
		double [] xCo = null;
		double [] yCo = null;
		while(!StdIn.isEmpty())
		{
			name = StdIn.readString();
			verNum = StdIn.readInt();
			vertex = new double[verNum * 2];
			for(int i = 0; i < vertex.length; i++)
			{
				vertex[i] = StdIn.readDouble();
			}
			xCo = new double[verNum];
			yCo = new double[verNum];
			for(int i = 0; i < vertex.length; i++)
			{
				if(i % 2 == 0)
				{
					xCo[i/2] = vertex[i];
				}
				else
				{
					yCo[i/2] = vertex[i];
				}
			}
			StdDraw.polygon(xCo, yCo);
		}
	}
}
