package fr.uvsq.exo3_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVendeur {
	@Test
	public void testSalairesTotale() {

		Vendeur x= new Vendeur();
		x.addcomm(1);
		assertEquals(1501,x.calcSalaire());
		}
	
		@Test
		public void test2SalairesTotale() {
			Vendeur x= new Vendeur(5);
			x.addcomm(50);
			assertEquals(1650,x.calcSalaire());
			}
		

}
