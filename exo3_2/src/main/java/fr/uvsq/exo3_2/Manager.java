package fr.uvsq.exo3_2;


public class Manager extends Employe{
	
	int nbemployer;
	public Manager() 
	{
		super();
		nbemployer=0;
	}
	public Manager(int ancienneter) 
	{
		super(ancienneter);
		nbemployer=0;
	}
	public void initnbemployer(int nbemployer)
	{
		this.nbemployer = nbemployer;
	}
	
	@Override
	public int calcSalaire()
	{
		return super.calcSalaire() + 100 * nbemployer;
	}

}
