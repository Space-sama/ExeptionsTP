package Banque;

import java.util.InputMismatchException;
import java.util.Scanner;


public class App2 {

	public static void main(String[] args) /*throws SoldeInsuffisantException*/ {
		try {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Le Code :"); 
		int codeb = keyboard.nextInt();
		System.out.print("Le Solde :"); 
		float soldeb = keyboard.nextFloat();

		Compte C = new Compte(codeb, soldeb);
		System.out.println(C.toString());
		System.out.println("#####################");
		System.out.print("Je verse :"); 
		float verserb = keyboard.nextFloat();
		C.verser(verserb);
		System.out.println("Vous avez verser "+verserb+ " et votre solde contien mtn :"+" "+C.getSolde());
		System.out.println("#####################");

		System.out.print("Je retire :"); 
		float retirerb = keyboard.nextFloat();
		/*try {
			C.retirer(retirerb);
		}catch(SoldeInsuffisantException s) {
			System.out.println(s.getMessage());
			System.out.println("par ce que votre solde est :"+" "+C.getSolde()+" "+"et vous avez retirer :"+" "+retirerb);
			//e.printStackTrace();

		}
		catch(NégatifException n) {
			System.out.println(n.getMessage());
		}*/
		
			C.retirer(retirerb);
			//e.printStackTrace();
		}catch(InputMismatchException m) {
				System.out.println("Un nombre svp");
				
		}catch(Exception e) {// sa va marcher pour 
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Good bye !");
		}
	}
}

