package fr.uvsq.exo3_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmploye {

	@Test
	public void testSalairesTotale() {
	Employe x= new Employe();
	assertEquals(1500,x.calcSalaire());
	}
	@Test
	public void test2SalairesTotale() {
		Employe x= new Employe(5);
		System.out.println(x.calcSalaire());
		assertEquals(1600,x.calcSalaire());
		}
	
}
