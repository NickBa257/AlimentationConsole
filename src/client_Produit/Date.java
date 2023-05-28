package client_Produit;

import java.util.Scanner;

public class Date {
	private int Jour,Mois,Annee;
	
	Scanner clavier = new Scanner(System.in);
	
	public Date(int j, int m, int a ) {
		Jour=j;
		Mois=m;
		Annee= a;
	}
	
	
	public Date() {	
		
		do {	
			System.out.println("Entrez le jour : ");
			this.Jour = clavier.nextInt();
			clavier.nextLine();
			
			System.out.println("Entrez le Mois : ");
			this.Mois = clavier.nextInt();
			clavier.nextLine();
			
			System.out.println("Entrez l'année >2020 : ");
			this.Annee = clavier.nextInt();
			clavier.nextLine();
			
		}while(Jour<1 || Jour>31 || Mois<1 || Mois>12 || Annee<2020  );
		
			
	}
	
	public void Afficher() {
		
		System.out.println("Le "+Jour+"/"+Mois+"/"+Annee);
	}

	public int getJour() {
		return Jour;
	}

	public void setJour(int jour) {
		Jour = jour;
	}

	public int getMois() {
		return Mois;
	}

	public void setMois(int mois) {
		Mois = mois;
	}

	public int getAnnee() {
		return Annee;
	}

	public void setAnnee(int annee) {
		Annee = annee;
	}
	
	
	
}
