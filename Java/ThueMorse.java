
/* This program takes an integer command-line argument n and prints an n-by-n pattern 
 * inspired by the Thue-Morse sequence. It prints a '+' in row i and column j if bits i
 * and j in the sequence are equal, and a '-' if they are different.
 */

public class ThueMorse
{
	public static void main(String[] args) 
	{
		int n = Integer.parseInt(args[0]);
		char[] sequence = new char[n];
		sequence[0] = '0';
		int a = 1;
		int fillIn = 1;
		int checkCount;
		while (fillIn < sequence.length)
		{
			checkCount = 0;
			while (checkCount < a)
			{
				if (fillIn == n)
				{
					break;
				}
				if (sequence[checkCount] == '0')
				{
					sequence[fillIn] = '1';
				}
				else
				{
					sequence[fillIn] = '0';
				}
				fillIn++;
				checkCount++;
			}
			a += a;
		}
		String weave[][] = new String[n][n];
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (sequence[i] == sequence[j])
				{
					weave[i][j] = "+";
				}
				else
				{
					weave[i][j] = "-";
				}
				System.out.print(weave[i][j] + "  ");
			}
			System.out.println();
		}
		
	}
}


