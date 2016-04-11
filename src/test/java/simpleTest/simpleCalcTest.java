package simpleTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class simpleCalcTest {

	@Test
	public void testAdd() {
		simplecalc calc=new simplecalc();
		calc.add(3, 4);
		assertEquals(7,calc.getresult());
	}
	@Test
	public void testSub() {
		simplecalc calc=new simplecalc();
		calc.sub(10,20);
		assertEquals(-10,calc.getresult());
	}
	@Test
	public void testMul() {
		simplecalc calc=new simplecalc();
		calc.mul(10,20);
		assertEquals(200,calc.getresult());
	}
}
