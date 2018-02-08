package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LaCalculadoraTest {

	@Test
	public void testSuma() {
		int res = Calculadora.suma(10, 20);
		assertEquals(30,  res);
	//	fail("Not yet implemented");
		
	}

	@Test (expected = java.lang.ArithmeticException.class)
	public void testDivideix() {
		int res = Calculadora.divideix(10, 0);
		assertEquals("Ha fallat el método divideix", 2,  res);
	}

	  
	@Test
	public void testResta() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiplicacio() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivisio() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testException() {
		int res;
		try {
			res = Calculadora.divideix(10, 0);
			fail("Fallo: Passa per aquí si no es llança l’excepció ArithmeticException");
		}
		catch (ArithmeticException e) {
			//La prova funciona correctament
		}
             }


}
