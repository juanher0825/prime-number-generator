package test;
import model.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneratorTest {
	Generator g;
	private void setupScenario1() {
		g = new Generator(9);
		
	}
	


	private void setupScenario2() {
		g = new Generator(18);
		
	}
	
	
	private void setupScenario3() {
		g = new Generator(17);
		
	}

	@Test
	void testGenerator() {
		
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
	
	//when n = 9
	@Test
	void testSizeOfMatrix() {
		setupScenario1();
		int b = g.sizeOfMatrix();
		int a = 3;
		assertEquals(a, b);
	}
	
	//when n = 18
	@Test
	void testSizeOfMatrix2() {
		setupScenario2();
		int b = g.sizeOfMatrix();
		int a = 5;
		assertEquals(a, b);
	}

}
