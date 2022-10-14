// Java program to find Eulerian number A(n, m)
import java.util.*;

class Eulerian
{
	// Return eulerian number A(n, m)
	public static int eulerian(int n, int m)
	{
		if (m >= n || n == 0)
			return 0;

		if (m == 0)
			return 1;

		return (n - m) * eulerian(n - 1, m - 1) +
			(m + 1) * eulerian(n - 1, m);
	}
	
	// driver code
	public static void main(String[] args)
	{
		int n = 3, m = 1;
		System.out.print( eulerian(n, m) );
	}
}

// This code is contributed by rishabh_jain
