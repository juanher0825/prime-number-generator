package model;

import java.util.ArrayList;
import java.util.List;

public class Generator {

	private int n;

	public Generator(int n) {
		this.n = n;
	}

	//PRIME NUMBER GENERATOR #1
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

}
