package travis_ci_tutorial_java;

import java.util.*;

//features of minus, multiply, and divide 

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
		//assertEquals(calc.add(1, 1), 0);
	}
	
	@Test
	public void testSubtract() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);
	}
	
	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(5, 3), 15);
	}
	
	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		try {
			assertEquals(calc.divide(6, 3), 2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
