package Banque;

public class Compte {
	private int code;
	private float solde;
	
	public Compte(int c, float s){		
		this.code = c;
		this.solde = s;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	public void verser(float mt) throws NégatifException{
		if(mt < 0) {
			throw new NégatifException("Le montant doit être positive !");
		}
		this.solde+=mt;
	}
	
	public void retirer(float mr) throws SoldeInsuffisantException, NégatifException{
		if(this.solde<mr) {
			throw new SoldeInsuffisantException("Solde insuffisant");
		}
		else if(mr < 0) {
			throw new NégatifException("Le montant à retirer ne doit pas être négative !");
		}
		else 
		this.solde-=mr;
		System.out.println("Vous retirez "+mr+" "+"et votre solde pour l'instant est de "+getSolde());
	}

	@Override
	public String toString() {
		return "Compte [code=" + code + ", solde=" + solde + "]";
	}
}
