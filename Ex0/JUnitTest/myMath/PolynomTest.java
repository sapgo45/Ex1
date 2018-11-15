package myMath;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PolynomTest {

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
	void fTest() {
		Polynom m = new Polynom ("x^2 + 4X");
		assertEquals(12, m.f(2));

	}

	@Test
	void addTEST() {
		Polynom m = new Polynom ("x^2 + 4");
		Polynom m1 = new Polynom ("x^2 + 2");
		m1.add(m);
		assertEquals("2.0X^2 + 6.0", m1.toString());
	}
	@Test

	void add1TEST() {
		Polynom m = new Polynom ("x^2 + 4");
		Monom m1 = new Monom ("x^2");
		m.add(m1);
		assertEquals("2.0X^2 + 4.0", m.toString());
	}
	@Test
	void substracttest() {
		Polynom m = new Polynom ("x^2 + 4");
		Polynom m1 = new Polynom ("x^2 + 2");
		m.substract(m1);
		assertEquals("2.0", m.toString());

	}
	@Test
	void substracttest1() {
		Polynom m = new Polynom ("x^2 + 4");
		Monom m1 = new Monom ("x^2");
		m.substract(m1);;
		assertEquals("4.0", m.toString());
	}
	@Test
	void multiplytst() {
		Polynom m = new Polynom ("2x^2 + 4");
		Polynom m1 = new Polynom ("x^2 + 2");
		m.multiply(m1);
		assertEquals("2.0X^4 + 8.0X^2 + 8.0", m.toString());
	}
	@Test
	void equalstst() {
		Polynom m = new Polynom ("2x^2 + 4");
		Polynom m1 = new Polynom ("x^2 + 2");
		Polynom m2 = new Polynom ("x^2 + 2");
		assertTrue(m1.equals(m2));
		assertFalse(m1.equals(m));
		assertFalse(m2.equals(m));
	}
	@Test
	 void isZerotst () {
		Polynom m2 = new Polynom ("x^2 + 2");
		Polynom m1 = new Polynom ();
		assertTrue(m1.isZero());
		assertFalse(m2.isZero());		 
	 }

@Test
void testroot() {
	Polynom p1 = new Polynom("2X");
	assertEquals(0, p1.root(-2, 10, 0.01), 0.01);	
}
@Test
void testarea() {
	Polynom p1 = new Polynom("x");
	assertEquals(50, p1.area(0, 10, 0.01), 0.1);
	Polynom p2 = new Polynom("x + 3");
	assertEquals(80.0, p2.area(0, 10, 0.01), 0.1);
	
}
}