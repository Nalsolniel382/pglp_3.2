package fr.uvsq.exo3_2;


import java.util.ArrayList;
public class Entreprise 
{
	private ArrayList<Employe> list;
	
	public Entreprise()
	{
		list = new ArrayList<Employe>();
	}
	
	public void add(Employe e)
	{
		list.add(e);
	}
	
	public int SalairesTotale()
	{
		int cont = 0;
		
		for(int i=0;i<list.size();i++)
		{
			
			cont = cont + list.get(i).calcSalaire();
		}
		return cont;
	}
}