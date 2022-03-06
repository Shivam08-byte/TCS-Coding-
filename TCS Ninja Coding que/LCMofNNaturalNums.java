// Java program to find LCM of First N Natural Numbers.
import java.util.*;

class LCMofNnaturalNums
{
	static int MAX = 100000;

	// array to store all prime less than and equal to 10^6
	static ArrayList<Integer> primes
		= new ArrayList<Integer>();
	// utility function for sieve of sieve of Eratosthenes
	static void sieve()
	{
		boolean[] isComposite = new boolean[MAX + 1];
		for (int i = 2; i * i <= MAX; i++)
		{
			if (isComposite[i] == false)
				for (int j = 2; j * i <= MAX; j++)
					isComposite[i * j] = true;
		}

		// Store all prime numbers in vector primes[]
		for (int i = 2; i <= MAX; i++)
			if (isComposite[i] == false)
				primes.add(i);
	}

	// Function to find LCM of first n Natural Numbers
	static long LCM(int n)
	{
		long lcm = 1;
		for (int i = 0;i < primes.size() && primes.get(i) <= n;i++)
		{
			// Find the highest power of prime, primes[i]
			// that is less than or equal to n
			int pp = primes.get(i);
			while (pp * primes.get(i) <= n)
				pp = pp * primes.get(i);

			// multiply lcm with highest power of prime[i]
			lcm *= pp;
			lcm %= 1000000007;
		}
		return lcm;
	}

	// Driver code
	public static void main(String[] args)
	{
		sieve();
		int N = 7;
	
		// Function call
		System.out.println(LCM(N));
	}
}
// This code is contributed by mits
