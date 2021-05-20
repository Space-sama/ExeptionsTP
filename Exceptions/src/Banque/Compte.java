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
	
	public void verser(float mt) throws N�gatifException{
		if(mt < 0) {
			throw new N�gatifException("Le montant doit �tre positive !");
		}
		this.solde+=mt;
	}
	
	public void retirer(float mr) throws SoldeInsuffisantException, N�gatifException{
		if(this.solde<mr) {
			throw new SoldeInsuffisantException("Solde insuffisant");
		}
		else if(mr < 0) {
			throw new N�gatifException("Le montant � retirer ne doit pas �tre n�gative !");
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
