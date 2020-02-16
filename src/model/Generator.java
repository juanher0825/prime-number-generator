package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generator {

	private int n;

	public Generator(int n) {
		this.n = n;
	}

	// PRIME NUMBER GENERATOR #1
	// this method gets an input n
	// and returns a list with the first
	// n prime numbers
	public List<Integer> primeNumberGenerator() {
		List<Integer> primes = new ArrayList<Integer>();
		for (int i = 2; i <= this.n; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
	}

	// this method verifies
	// if a number is prime or not

	public boolean isPrime(int n) {

		// Corner case
		if (n <= 1)
			return false;

		// Check from 2 to n-1
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	// this method says how many
	// prime numbers there is in
	// a sucession of integers from 0 to n
	public int ammountOfPrimes() {

		int amnt = 0;
		for (int i = 2; i <= this.n; i++) {
			if (isPrime(i)) {
				System.out.println(i);
				amnt++;
			}
		}
		return amnt;
	}



	// this method returns n
	public int getN() {

		return this.n;
	}


	//this method is used to ensure that
	//the matrix that will be printed
	//will be as squared as possible
	public int[] matrixDistribution(){
	int []distribution = new int [2]; 
	int ceiling = (int) Math.ceil(Math.sqrt(this.n));
	int floor = (int) Math.floor(Math.sqrt(this.n));

	if ( (ceiling * floor)  <this.n){
		ceiling +=1;
	}

	distribution[0]= ceiling;
	distribution[1]= floor;

	return distribution;
	}

	/////////////////////////////////////////////////////////////////////////////////
	public ArrayList<Integer> betwiseSieve(int n) {

		ArrayList<Integer> primes = new ArrayList<>();

		// prime[i] is going to store true if
		// if i*2 + 1 is composite.
		boolean prime[] = new boolean[n / 2];
		Arrays.fill(prime, false);

		// 2 is the only even prime so we can
		// ignore that. Loop starts from 3.
		for (int i = 3; i * i < n; i += 2) {
			// If i is prime, mark all its
			// multiples as composite
			if (prime[i / 2] == false)
				for (int j = i * i; j < n; j += i * 2)
					prime[j / 2] = true;
		}

		// writing 2 separately
		primes.add(2);

		// Printing other primes
		for (int i = 3; i < n; i += 2)
			if (prime[i / 2] == false)
				primes.add(i);

		return primes;
	}

	////////////////////////////////////////////////////////////////////////////////////
	public ArrayList<Integer> SieveOfSundaram(int n) {

		ArrayList<Integer> prime = new ArrayList<>();

		// In general Sieve of Sundaram, produces
		// primes smaller than (2*x + 2) for a number
		// given number x. Since we want primes
		// smaller than n, we reduce n to half
		int nNew = (n - 2) / 2;

		// This array is used to separate numbers of the
		// form i+j+2ij from others where 1 <= i <= j
		boolean marked[] = new boolean[nNew + 1];

		// Initialize all elements as not marked
		Arrays.fill(marked, false);

		// Main logic of Sundaram. Mark all numbers of the
		// form i + j + 2ij as true where 1 <= i <= j
		for (int i = 1; i <= nNew; i++)
			for (int j = i; (i + j + 2 * i * j) <= nNew; j++)
				marked[i + j + 2 * i * j] = true;

		// Since 2 is a prime number
		if (n > 2)
			prime.add(2);

		// Print other primes. Remaining primes are of
		// the form 2*i + 1 such that marked[i] is false.
		for (int i = 1; i <= nNew; i++)
			if (marked[i] == false)
				prime.add(2 * i + 1);
		return prime;
	}

	////////////////////////////////////////////////////////////////////////////////////
	public ArrayList<Integer> sieveOfEratosthenes(int n) {

		ArrayList<Integer> primes = new ArrayList<>();

		// Create a boolean array "prime[0..n]" and initialize
		// all entries it as true. A value in prime[i] will
		// finally be false if i is Not a prime, else true.
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i < n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++) {
			// If prime[p] is not changed, then it is a prime
			if (prime[p] == true) {
				// Update all multiples of p
				for (int i = p * p; i <= n; i += p)
					prime[i] = false;
			}
		}

		// Print all prime numbers
		for (int i = 2; i <= n; i++) {
			if (prime[i] == true)
				primes.add(i);
		}
		return primes;
	}
/////////////////////////////////////////////////////////////////////////////////////////

}
