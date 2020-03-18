package fr.uvsq.exo3_2;

public class Employe {
	int salaire ;
	int ancienneter;
	
	
	
	public Employe()
	{
		salaire=1500;
		ancienneter=0;
	}
	public Employe(int a)
	{
		salaire=1500;
		ancienneter=a;
	}
	public int ajoutAnnee()
	{
		
		return this.ancienneter++;
	}
	public int calcSalaire()
	{
		return 1500 + 20*ancienneter;
	}

}
