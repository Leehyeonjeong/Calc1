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
	@Test
	public void testDiv() {
		simplecalc calc=new simplecalc();
		calc.div(100,20);
		assertEquals(5,calc.getresult());
	}
	
	@Test
	public void testInc() {
		simplecalc calc=new simplecalc();
		calc.inc(100);
		assertEquals(100,calc.getresult());
		calc.inc(200);
		assertEquals(300,calc.getresult());
	}
}
