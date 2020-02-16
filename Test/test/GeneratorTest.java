package test;
import model.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.OffTheLimitException;

class GeneratorTest {
	Generator g;
	private void setupScenario1() {
		try {
			g = new Generator(9);
		} catch (OffTheLimitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	


	private void setupScenario2() {
		try {
			g = new Generator(18);
		} catch (OffTheLimitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	private void setupScenario3() {
		try {
			g = new Generator(74);
		} catch (OffTheLimitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void setupScenario4() {
		try {
			g = new Generator(45);
		} catch (OffTheLimitException e) {
			// TODO Auto-generatclaed catch block
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


}
