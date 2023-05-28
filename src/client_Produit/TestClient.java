package client_Produit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TestClient {

	static ArrayList<Client>Tab= new ArrayList<>();
	static ArrayList<Produit>Tab1= new ArrayList<>();
	
	static ArrayList<Client>TabCo= new ArrayList<>();
	static ArrayList<Produit>Tab1Co= new ArrayList<>();
	
	static ArrayList<Double>Quantite= new ArrayList<>();
	static ArrayList<Integer>CoClient= new ArrayList<>();

	static int CompteurCo=0;
	static String date;
	
	static BufferedReader buff= new BufferedReader(new InputStreamReader(System.in));
	   
	public static void main(String[] args) {
	
	try {
		Menu();
	} catch (NumberFormatException | IOException e) {
		e.printStackTrace();
	}
	
	}
	
	
	public static void NbClient() throws NumberFormatException, IOException {
	
		int number;				
			
			System.out.println("Vous voulez créer combien de client? ");
			number=Integer.parseInt(buff.readLine());
			for(int i=0; i<number; i++) {
				Tab.add(new Client());
			}
						
    }
	
	
    public static void AfficheClient(ArrayList<Client>t) {
			
		   for(int i=0;i<t.size();i++) {
			   
			   t.get(i).Affiche();
		   }
		   
		}
    
    public static void NbProduit() throws NumberFormatException, IOException {
    	
		int number1; 
					
			System.out.println("Vous voulez créer combien de produits ? ");
			number1=Integer.parseInt(buff.readLine());
			
			for(int i=0; i<number1; i++) {
				 
				Tab1.add(new Produit());       
			}
				
}
	
	
    public static void AfficheProduit(ArrayList<Produit>t) {
			
		   for(int i=0;i<t.size();i++) {
			   
			   t.get(i).Affiche();
		   }   
		}
    
    
 public static void Commander(ArrayList<Client>t,ArrayList<Produit>t1) throws IOException{
  
  String NC,Pr;
  int Choix,compteur=1;
  double quantite;  	
      for(Client c:t) {
    	  c.Affiche();
       }
    
  do{
	   	
		System.out.println("Entrez le nom du client qui veut commander");
		NC=buff.readLine();
		
		for(int i=0; i<t.size(); i++) {	  
			   
	    	  if(NC.equalsIgnoreCase(t.get(i).getNom())) {
	    	TabCo.add(t.get(i));
	      }
	    	  
		}
			
		   if(TabCo==null){
		   	   System.out.println("Entrez un Nom Correct:");
		          NC=buff.readLine();
		       	  }	 
	     	   	  
   }while(TabCo==null); 
          
 
  //Commande d'un seul Produit 
   
System.out.println("Parmi ces produits lequel(s) vous choisissez: ");
   for(Produit p:t1) {
 	  p.Affiche();
   }
   
   do {
  
	System.out.println("Entrez le produit que vous désirez: ");   
	Pr=buff.readLine();
	
	  for(int j=0 ; j<t1.size(); j++) {
		     if(Pr.equalsIgnoreCase(t1.get(j).getDesignation())) {  	
			      Tab1Co.add(t1.get(j));
			      CompteurCo+=1;
		     }		  
		   }   
		    if(Tab1Co==null) {
		    	 System.out.println("Entrez un Nom Correct:");
		 	    Pr=buff.readLine(); 
		     }
       
  }while(Tab1Co==null);  
       
 
	System.out.println("Indiquez la quantité:"); 
	quantite=Double.parseDouble(buff.readLine());
	Quantite.add(quantite);
 
 
  
  //Commande de +sieurs Produits
  
  
	  System.out.println("Si vous voulez autre chose tapez 1 "
	  + "ou si vous voulez arreter taper un autre chiffre different de 1: ");
	Choix=Integer.parseInt(buff.readLine());
	  if(Choix==1) {
		  do {  
				
	System.out.println("Entrez l'autre produit que vous désirez: ");
	Pr=buff.readLine();
			  	  
			     for(int j=0 ; j<t1.size(); j++) {
			  	     if(Pr.equalsIgnoreCase(t1.get(j).getDesignation())) {  	
			  		      Tab1Co.add(t1.get(j));
			  		      compteur+=1;
			  		    CompteurCo+=1;
			      }		  
			    }   
			       if(Tab1Co.size()<compteur) {
			  	   System.out.println("Entrez un Nom Correct:");
			  	   Pr=buff.readLine(); 
			  	 }    
			  	  
			       System.out.println("Indiquez la quantité:");
			       quantite=Double.parseDouble(buff.readLine());
			       
			       Quantite.add(quantite);    
			       
			  	System.out.println("Si vous voulez autre chose tapez 1 "
			  + "ou si vous voulez arreter taper un autre chiffre different de 1: ");
			  	  Choix=Integer.parseInt(buff.readLine());
			  	 
			    }while(Choix==1 );
	  }  
  
 
	 if(CompteurCo!=0) {
		 
		 CoClient.add(CompteurCo);
		 
		CompteurCo=0;
	 }
   		
	 SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
 	date=simple.format(new Date()); 
	 
}

  
   public static void Menu() throws NumberFormatException, IOException {
	   int m;
	   
	   do {
	   
System.out.println("-------------Menu-------------"
 +"\n1.Ajouter des Clients "+"\n2.Ajouter des produits"
 +"\n3.Consulter les clients"
 +"\n4.Consulter les produits"+"\n5.Commander des produits"
 +"\n6.Afficher tous les commandes et les prix totaux"
 +"\n7.Si vous voulez arreter"
 +"\nTapez le chiffre equivalent à votre choix:");
	   m=Integer.parseInt(buff.readLine());
	   	      
}while(m<1 || m>8 );
	   
	   switch(m) {
	   
	   case 1 :	
		   
          NbClient();
	      
		   Menu();
		   System.out.println();
		   
		   break;
	   
	
      case 2 :   
    	  
         NbProduit();
         
    	  Menu();
    	  System.out.println();
    	  
	   break;
	  
      case 3 :  
    	
    	  if(Tab.size()==0) {
    		  
    System.out.println("Aucun Client n'a été crée");
    Menu();
	System.out.println();
	
    	  }else {
     AfficheClient(Tab);
        	  
      Menu();
      System.out.println();  
    	  }
    	 
    	  
	   break;
	   
      case 4 :  
    	  if(Tab1.size()==0) {
    		  
    		    System.out.println("Aucun produit n'a été crée");
    		    Menu();
    			System.out.println();
    			
    		    	  }else {
    		     AfficheProduit(Tab1);
    		        	  
    		      Menu();
    		      System.out.println();  
    		    	  }
    		    	 
	   break;
	   
	   
      case 5: 
    if(m==5 && Tab.size()==0) {
    	
     System.out.println("Vous devez d'abord au moins créer un client");
     Menu();	
     
    }else if(m==5 && Tab1.size()==0) {
    	
     System.out.println("Vous devez d'abord au moins créer un produit");
     Menu();
     
    }else {
    	
    Commander(Tab,Tab1);
 	 Menu();	 
  	System.out.println(); 
  	
    }
    	  		 
   	 break;
   	      
     case 6:  
    	 
     double total=0,PrixTotal,GainTotal=0;
     int i=0,lolo=0;
    	      	   	  
System.out.println();

System.out.println("Toutes les Commandes du "+date);
	   
	   while(i<TabCo.size()) {
  System.out.println();		   
  System.out.println("Client: "+TabCo.get(i).getNom()+" a commandé(e):");
  
  System.out.print("-Designation-");
  System.out.print("Quantité-");
  System.out.print("Prix Unitaire-");
  System.out.println("Prix Total-");
    

	if(lolo<CoClient.size()) {
		
		 for(int c=0; c<CoClient.get(lolo); c++ ) {
			 
	 PrixTotal=0;		  
	 PrixTotal=PrixTotal+(Tab1Co.get(c).getPrix()*Quantite.get(c));
				   	   
	 System.out.println("-"+Tab1Co.get(c).getDesignation()
	 +"\t\t"+Quantite.get(c)+"\t"+Tab1Co.get(c).getPrix()
	+"       "+PrixTotal);

	   total+=PrixTotal;  
		 }
		 
	   GainTotal+=total;
	System.out.println("Total: "+total+"fbu");
	
	 lolo+=1;
	 PrixTotal=0;
	 total=0;
	}
  i+=1;
 }
System.out.println("\nLe Gain total pour aujourd'hui est de :"
+GainTotal+"fbu");   
System.out.println();      
   	Menu();
    
   	   break;
   	  
      case 7: 
    // System.exit(0);	    	  
  	   break;
	    
     }	   
  }
   
}
