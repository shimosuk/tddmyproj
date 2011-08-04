package tdd;

import junit.framework.TestCase;

/** 5章　フランク */
/* commit回数を増やすことを意識 */
public class DollarTest extends TestCase {
	public void testMultiplication(){
		Dollar five=new Dollar(5);
		assertEquals(new Dollar(10),five.times(2));
		assertEquals(new Dollar(15),five.times(3));
	}
	
	public void testFrancMultiplication(){
		Franc five=new Franc(5);
		assertEquals(new Franc(10),five.times(2));
		assertEquals(new Franc(15),five.times(3));
	}
	
	public void testEquality(){
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}

	
}
