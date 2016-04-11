package simpleTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class simpleCalcTest {

	@Test
	public void testAdd() {
		simplecalc a=new simplecalc();
		a.add(3, 4);
		assertEquals(7,a.getresult());
	}
}
