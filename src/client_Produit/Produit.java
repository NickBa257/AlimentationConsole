package client_Produit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Produit {

	public static int compteur=0;
	private  int Numero=0;
	private String Designation;
	private double Prix;
	
	BufferedReader buff;

	public Produit() {
		
	buff = new BufferedReader(new InputStreamReader(System.in));
	
		++compteur;
		Numero=compteur;
				
		try {
			System.out.printf("Entrez le nom du produit N°%d: ",this.Numero,"\n");
			Designation=buff.readLine();
			
			System.out.printf("Entrez le prix du %s:",this.Designation,"\n");
			Prix=Double.parseDouble(buff.readLine());
		} catch (IOException e) {
			
			e.printStackTrace();
		}		
				
}
	
	public void Affiche() {
	System.out.println("Numero: "+Numero+" ,Designation: "+Designation+" ,Prix: "+Prix+"fbu");
	}
	
	
	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}
	
	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public double getPrix() {
		return Prix;
	}

	public void setPrix(double prix) {
		Prix = prix;
	}

	
	
}
