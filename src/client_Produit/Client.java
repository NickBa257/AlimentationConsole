package client_Produit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Client {
    
	public static int compteur=0;
	private  int Numero=0;
	private String Nom,Adresse;
	
   
	public Client() {

		this.Numero=++compteur;
		Nom = Clavier(String.format("Entrez le Nom du client N°%d:",Numero,"\n"));

		Adresse=Clavier(String.format("Entrez l'adresse de %s:",this.Nom,"\n"));


	}
	
	
	public void Affiche() {
		
System.out.println("Numero: "+Numero+",Nom: "+Nom+",habite à "+Adresse);
	}
	
	public String Clavier(String a) {
		String value="";

		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(a);

		try {
			value=buff.readLine();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return value;
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

