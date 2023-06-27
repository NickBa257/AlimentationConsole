package client_Produit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Produit {

	public static int compteur=0;
	private  int Numero=0;
	private String Designation;
	private double Prix;
	
	

	public Produit() {
	
		++compteur;
		Numero=compteur;

		Designation=Clavier(String.format("Entrez le nom du produit N°%d: ",this.Numero,"\n"));

		Prix=Double.parseDouble(Clavier(String.format("Entrez le prix du %s:",this.Designation,"\n")));

	}
	
	public void Affiche() {
	System.out.println("Numero: "+Numero+" ,Designation: "+Designation+" ,Prix: "+Prix+"fbu");
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
