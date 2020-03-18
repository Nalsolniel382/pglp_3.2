	package fr.uvsq.exo3_2;


	public class Vendeur extends Employe{
		int comm;
		
		
		public Vendeur() 
		{
			super();
			comm=0;
		}
		public Vendeur(int ancienneter) 
		{
			super(ancienneter);
			comm=0;
		}
		
		public void addcomm(int comm)
		{
			this.comm = comm;
		}
		
		@Override 
		public int calcSalaire()
		{
			return super.calcSalaire() + comm;
		}
		
}
