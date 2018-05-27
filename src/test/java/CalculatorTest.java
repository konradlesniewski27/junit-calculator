
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void testDodawania() throws Exception {
		double a = 2.0;
		double b = 3.0;

		double c = 4.0;
		double d = 6.7;

		double suma = classUnderTest.sum(a,b);
		double suma2 = classUnderTest.sum(c,d);
		Assert.assertEquals("Bledny wynik sumowania", 5.0, suma, 0.001);
		Assert.assertEquals("Bledny wynik sumowania", 10.7, suma2, 0.001);

	}

	@Test
	public void testOdejmowania() throws Exception {
		double e = 4.0;
		double f = 4.0;

		double substract = classUnderTest.subtract(e,f);

		Assert.assertEquals("Błędny wynik odejmowania", 0, substract, 0.000001);
	}

	@Test
	public void testMnozenia() throws Exception {
		double g = 6.0;
		double h = 8.0;

		double multiply = classUnderTest.multiply(g,h);

		Assert.assertEquals("Błedny wynik mnozenia", 48.0, multiply, 0.00001);
	}

	@Test
	public void testDzielenia() throws Exception {

		double a = 12.0;
		double b = 6.0;

		double divide = classUnderTest.divide(a,b);

		Assert.assertEquals("Bledny wynik dzielenia", 2.0, divide, 0.00001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void dzieleniePrzezZero() {

		double a = 4.0;
		double b = 0.0;

		double wynik = classUnderTest.divide(a,b);


	}
}
