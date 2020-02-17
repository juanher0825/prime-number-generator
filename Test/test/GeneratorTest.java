package test;
import model.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import exceptions.OffTheLimitException;

class GeneratorTest {
	Generator g;
	private void setupScenario1() {
		try {
			g = new Generator(9);
		} catch (OffTheLimitException e) {
			
			e.printStackTrace();
		}
		
	}
	


	private void setupScenario2() {
		try {
			g = new Generator(18);
		} catch (OffTheLimitException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	private void setupScenario3() {
		try {
			g = new Generator(74);
		} catch (OffTheLimitException e) {
			
			e.printStackTrace();
		}
		
	}
	
	private void setupScenario4() {
		try {
			g = new Generator(45);
		} catch (OffTheLimitException e) {
			
			e.printStackTrace();
		}
		
	}
	


	@Test
	void testIsPrime() {
		setupScenario1();
		boolean flag = true;
		boolean b = g.isPrime(5);
		assertTrue(flag == b);
	}
	
	@Test
	void testIsPrime2() {
		setupScenario1();
		boolean flag = true;
		boolean b = g.isPrime(100);
		assertFalse(flag == b);
	}
	
	@Test
	void testIsPrime3() {
		setupScenario1();
		boolean flag = true;
		boolean b = g.isPrime(1);
		assertFalse(flag == b);
	}

	//when n = 9
	@Test
	void testAmmountOfPrimes() {
		setupScenario1();
		int a = g.ammountOfPrimes();
		
		int b = 4;
		
		assertEquals(b, a);
	}
	
	//when n = 18
	@Test
	void testAmmountOfPrimes2() {
		setupScenario2();
		int a = g.ammountOfPrimes();
		int b = 7;
		
		assertEquals(b, a);
	}
	
	//when n == 9
	@Test
	void matrixDistributionTest() {
		setupScenario1();
		int [] size = g.matrixDistribution();
		int a = 3;
		int b = 3;
		int aa = size[0];
		int bb = size[1];
		
		assertEquals(a  , aa);
		assertEquals(b , bb);
	}
	
	//when n == 18
		@Test
		void matrixDistributionTest2() {
			setupScenario2();
			int [] size = g.matrixDistribution();
			int a = 5;
			int b = 4;
			int aa = size[0];
			int bb = size[1];
			
			assertEquals(a  , aa);
			assertEquals(b , bb);
		}
		
				//when n == 45
				@Test
				void matrixDistributionTest3() {
					setupScenario4();
					int [] size = g.matrixDistribution();
					int a = 8	;
					int b = 6;
					int aa = size[0];
					int bb = size[1];
					
					assertEquals(a  , aa);
					assertEquals(b , bb);
				}
				
				//when n == 74
				//in this case the ceiling
				//will be added 1.
				@Test
				void matrixDistributionTest4() {
					setupScenario3();
					int [] size = g.matrixDistribution();
					int a = 10	;
					int b = 8;
					int aa = size[0];
					int bb = size[1];
					
					assertEquals(a  , aa);
					assertEquals(b , bb);
				}


				
				//when n = 9
				//we compare that the method 
				//returns a collection containing the first
				//primes until n, in this case 
				//the list must be {2,3,5,7,11,13,17}
				@Test
				void betwiseSieveTest() {
					setupScenario2();
					int n = g.getN();
					List<Integer> pr = g.betwiseSieve(n);
					List<Integer> pre = new ArrayList<Integer>();
					pre.add(2);
					pre.add(3);
					pre.add(5);
					pre.add(7);
					pre.add(11);
					pre.add(13);
					pre.add(17);
					assertEquals(pr.get(0), pre.get(0));
					assertTrue(pr.equals(pre));
				}
				
				//we compare that the method 
				//returns a collection containing the first
				//primes until n, in this case 
				//the list must be {2,3,5,7,11,13,17,19,23,29,31,37,41,43}
				@Test
				void betwiseSieveTest2() {
					setupScenario4();
					int n = g.getN();
					List<Integer> pr = g.betwiseSieve(n);
					List<Integer> pre = new ArrayList<Integer>();
					pre.add(2);
					pre.add(3);
					pre.add(5);
					pre.add(7);
					pre.add(11);
					pre.add(13);
					pre.add(17);
					pre.add(19);
					pre.add(23);
					pre.add(29);
					pre.add(31);
					pre.add(37);
					pre.add(41);
					pre.add(43);
					assertEquals(pr.get(0), pre.get(0));
					assertTrue(pr.equals(pre));
				}
				
				//we compare that the method 
				//returns a collection containing the first
				//primes until n, in this case 
				//the list must be {2,3,5,7}
				void betwiseSieveTest3() {
					setupScenario1();
					int n = g.getN();
					List<Integer> pr = g.betwiseSieve(n);
					List<Integer> pre = new ArrayList<Integer>();
					pre.add(2);
					pre.add(3);
					pre.add(5);
					pre.add(7);
					
					assertEquals(pr.get(0), pre.get(0));
					assertTrue(pr.equals(pre));
				}
				
				
				//we compare that the method 
				//returns a collection containing the first
				//primes until n, in this case 
				//the list must be {2,3,5,7,11,13,17}
				@Test
				void sieveOfSundaramTest(){
					setupScenario2();
					int n = g.getN();
					List<Integer> pr = g.SieveOfSundaram(n);
					List<Integer> pre = new ArrayList<Integer>();
					pre.add(2);
					pre.add(3);
					pre.add(5);
					pre.add(7);
					pre.add(11);
					pre.add(13);
					pre.add(17);
					assertEquals(pr.get(0), pre.get(0));
					assertTrue(pr.equals(pre));
				}
				
				//we compare that the method 
				//returns a collection containing the first
				//primes until n, in this case 
				//the list must be {2,3,5,7,11,13,17,19,23,29,31,37,41,43}
				@Test
				void sieveOfSundaramTest2(){
					setupScenario4();
					int n = g.getN();
					List<Integer> pr = g.SieveOfSundaram(n);
					List<Integer> pre = new ArrayList<Integer>();
					pre.add(2);
					pre.add(3);
					pre.add(5);
					pre.add(7);
					pre.add(11);
					pre.add(13);
					pre.add(17);
					pre.add(19);
					pre.add(23);
					pre.add(29);
					pre.add(31);
					pre.add(37);
					pre.add(41);
					pre.add(43);
					assertEquals(pr.get(0), pre.get(0));
					assertTrue(pr.equals(pre));
				}
				
				//we compare that the method 
				//returns a collection containing the first
				//primes until n, in this case 
				//the list must be {2,3,5,7}
				void sieveOfSundaramTest3() {
					setupScenario1();
					int n = g.getN();
					List<Integer> pr = g.SieveOfSundaram(n);
					List<Integer> pre = new ArrayList<Integer>();
					pre.add(2);
					pre.add(3);
					pre.add(5);
					pre.add(7);
					
					assertEquals(pr.get(0), pre.get(0));
					assertTrue(pr.equals(pre));
				}
				
				//we compare that the method 
				//returns a collection containing the first
				//primes until n, in this case 
				//the list must be {2,3,5,7,11,13,17}
				@Test
				void sieveOfEratosthenesTest() {
					setupScenario2();
					int n = g.getN();
					List<Integer> pr = g.sieveOfEratosthenes(n);
					List<Integer> pre = new ArrayList<Integer>();
					pre.add(2);
					pre.add(3);
					pre.add(5);
					pre.add(7);
					pre.add(11);
					pre.add(13);
					pre.add(17);
					assertEquals(pr.get(0), pre.get(0));
					assertTrue(pr.equals(pre));
				}
				
				//we compare that the method 
				//returns a collection containing the first
				//primes until n, in this case 
				//the list must be {2,3,5,7,11,13,17,19,23,29,31,37,41,43}
				@Test
				void sieveOfEratosthenesTest2() {
					setupScenario4();
					int n = g.getN();
					List<Integer> pr = g.sieveOfEratosthenes(n);
					List<Integer> pre = new ArrayList<Integer>();
					pre.add(2);
					pre.add(3);
					pre.add(5);
					pre.add(7);
					pre.add(11);
					pre.add(13);
					pre.add(17);
					pre.add(19);
					pre.add(23);
					pre.add(29);
					pre.add(31);
					pre.add(37);
					pre.add(41);
					pre.add(43);
					assertEquals(pr.get(0), pre.get(0));
					assertTrue(pr.equals(pre));
				}
				
				//we compare that the method 
				//returns a collection containing the first
				//primes until n, in this case 
				//the list must be {2,3,5,7}
				void sieveOfEratosthenesTest3() {
					setupScenario1();
					int n = g.getN();
					List<Integer> pr = g.sieveOfEratosthenes(n);
					List<Integer> pre = new ArrayList<Integer>();
					pre.add(2);
					pre.add(3);
					pre.add(5);
					pre.add(7);
					
					assertEquals(pr.get(0), pre.get(0));
					assertTrue(pr.equals(pre));
				}
}
