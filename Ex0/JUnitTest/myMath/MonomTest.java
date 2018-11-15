package myMath;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MonomTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void derivativetst() {		// testing derivative method in j unit for class Monom
		Monom m= new Monom(3,2);
		m.derivative();
		assertEquals(6, m.get_coefficient());
		assertEquals(1, m.get_power());
		System.out.println(m.toString());
		Monom exp = new 	Monom("6x");
		assertTrue("err derivative", m.equals(exp));
	}
	
	@Test	// testing f method in j unit for class Monom
	void ftest() {
		Monom m1 = new Monom(2,3);
		assertEquals(2, m1.f(1));	
	}
	
	@Test
	void addtest() {// testing add method in j unit for class Monom
		Monom m= new Monom(3,2);
		Monom m2= new Monom(6,2);
		m.add(m2);
		assertEquals(9, m.get_coefficient());
		assertEquals(2, m.get_power());
	}
	@Test
	void substracttest() {// testing substruct method in j unit for class Monom
		Monom m= new Monom(3,2);
		Monom m2= new Monom(6,2);
		m2.substract(m);
		assertEquals(3, m.get_coefficient());
		assertEquals(2, m.get_power());
	}
	@Test// testing multiply method in j unit for class Monom
	void multiplytest() {
		Monom m= new Monom(3,2);
		Monom m2= new Monom(6,2);
		m2.multiply(m);
		System.out.println(m2.toString());
		assertEquals(18, m2.get_coefficient());
		assertEquals(4, m2.get_power());
		
	}
	
	@Test// testing equal method in j unit for class Monom
	void equalstest() {
		Monom m= new Monom(3,2);
		Monom m2= new Monom(3,2);
		Monom m3 = new Monom (3,3);
		assertTrue(m2.equals(m));
		assertFalse(m.equals(m3));

		
	}
	@Test// testing string method in j unit for class Monom
	void stringtest() {
		Monom m= new Monom("3x^2");
		assertEquals("3.0X^2", m.toString());
		
	}
}
