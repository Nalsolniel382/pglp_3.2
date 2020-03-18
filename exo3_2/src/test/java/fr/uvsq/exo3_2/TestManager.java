package fr.uvsq.exo3_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestManager {

	@Test
	public void testSalairesTotale() {
	Manager x= new Manager();
	x.initnbemployer(1);
	assertEquals(1600,x.calcSalaire());
	}
	@Test
	public void test2SalairesTotale() {
		Manager x= new Manager(5);
		x.initnbemployer(4);
		assertEquals(2000,x.calcSalaire());
		}
}
