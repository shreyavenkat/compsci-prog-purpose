
/* This program takes two integer command-line arguments n and trials and performs the
 * following experiment, trials times:
 * Chooses a birthday for the next person, uniformly at random between 0 and n−1.
 * Has that person enter the room.
 * If that person shares a birthday with someone else in the room, stop; otherwise repeat.
 * In each experiment, count the number of people that enter the room. Print a table that
 * summarizes the results (the count i, the number of times that exactly i people enter
 * the room, and the fraction of times that i or fewer people enter the room) for each
 * possible value of i from 1 until the fraction reaches (or exceeds) 50%.
 */

public class Birthday {

	public static void main (String[] args) 
	{
		int n = Integer.parseInt(args[0]);		//number of birthdays
		int trials = Integer.parseInt(args[1]);	//number of trials
		double [][] table = new double [n+1][3]; 	//table of results printed at the end
		int select = 0;		//random birthday chosen
		double add = 0; //used in the last for-loop
		int count; //used twice, to break out of a nested loop
		
		for (int r = 0; r < n + 1; r++)
		{
			table[r][0] = r + 1;
		}
		
		for (int tCount = 0; tCount < trials; tCount++)
		{
			int [] birthdays = new int[n]; 		//array of chosen birthdays
			for (int birCount = 0; birCount < birthdays.length + 1; birCount++) //redo this loop completely
			{
				count = 0;
				select = (int) ((n * Math.random()) + 1);
				for (int i = 0; i < birthdays.length; i++)
				{
					if (select == birthdays[i])
					{
						table[birCount][1] += 1;
						count++;
						break;
					}
				}
				if (count > 0 || birCount >= birthdays.length)
				{
					break;
				}
				birthdays[birCount] = select;
			}
		}
		count = 0;
		for (int j = 0; j < n + 1; j++)
		{
			add += table[j][1] / trials;
			table[j][2] = add;
			if (add >= 0.5)
			{
				break;
			}
		}
		int digits = 0;
		int tCopy = trials;
		while(tCopy > 0)
		{
			tCopy /= 10;
			digits++;
		}
		String use1 = "%-" + String.valueOf(digits) + "d";
		String use2 = "%-" + String.valueOf(digits) + "f";
	
		for (int r = 0; r < n + 1; r++)
		{
			for (int c = 0; c < 3; c++)
			{
				if (c == 0 || c == 1)
				{
					System.out.printf(use1,(int)table[r][c]);
					System.out.print("   ");
				}
				else
				{	
					System.out.printf(use2, table[r][c]);
					System.out.print("   ");
					if (c == 2)
					{
						if (table[r][c] >= 0.5)
						{
							count++;
							break;
						}
					}
				}
			}
			System.out.println();
			if (count == 1)
			{
				break;
			}
		}
	}

}
