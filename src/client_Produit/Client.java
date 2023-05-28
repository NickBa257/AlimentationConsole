package client_Produit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Client {
    
	public static int compteur=0;
	private  int Numero=0;
	private String Nom,Adresse;
	
   BufferedReader buff;
   
	public Client() {
		
		buff = new BufferedReader(new InputStreamReader(System.in));
		  this.Numero=++compteur;
		  	
	    try {
	    	System.out.printf("Entrez le Nom du client N°%d:",Numero,"\n");
			Nom = buff.readLine();
			
			System.out.printf("Entrez l'adresse de %s:",this.Nom,"\n");
			Adresse=buff.readLine();
		  		
		} catch (IOException e) {
			
			e.printStackTrace();
		}		
 }
	
	
	public void Affiche() {
		
System.out.println("Numero: "+Numero+",Nom: "+Nom+",habite à "+Adresse);
	}
	
	
	public String getNom() {
		return Nom;
	}


	public void setNom(String nom) {
		Nom = nom;
	}


	public String getAdresse() {
		return Adresse;
	}


	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	
	
}

