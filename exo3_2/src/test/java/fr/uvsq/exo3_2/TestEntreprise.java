package fr.uvsq.exo3_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEntreprise {

	@Test
	public void test() {
		Employe a= new Employe();
		Vendeur b= new Vendeur();
		b.addcomm(500);
		Manager c= new Manager(5);
		c.initnbemployer(4);
		Entreprise e=new Entreprise();
		e.add(a);
		e.add(b);
		e.add(c);
		assertEquals(5500,e.SalairesTotale());
	}

}
