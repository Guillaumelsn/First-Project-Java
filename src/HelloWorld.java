import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World!");
//		String chaine = "E=m6";
//		int num2 = 8;
//		System.out.println(chaine + num2 *3);
//		if(num2 < 7) {
//			System.out.println("Guillaume");
//		}
//		else {
//			System.out.println("Briac");
//		}
//		
//		String[] apprenants = new String[4];
//			apprenants[0] = "Ibrahim";
//			apprenants[1] = "Kevin";
//			apprenants[2] = "Yasmine";
//			apprenants[3] = "Soumaya";	
//			
//			for (int i = 0; i < apprenants.length; i++) for
//			for (String UnApprenant:apprenants)      // for each
//			{
//				System.out.println(apprenants[i]); for
//				System.out.println(UnApprenant); // for each
//			}
		
		
//		int note = 10;
//		System.out.println(note);
//		if (note < 8) {
//			System.out.println("votre note est nul");	
//		}
//		else if (note<= 10) {
//			System.out.println("votre note n'est pas térrible mais ça peut etre rattrapé");	
//		}
//		else if (note > 10 && note<= 12) {
//			System.out.println("votre note est passable");	
//			}
//		else if (note > 12 && note<= 14) {
//			System.out.println("votre note est assez bien");	
//			}
//		else if (note > 14 && note<= 16) {
//			System.out.println("votre note est bien");	
//			}
//		else {
//			System.out.println("votre note est très bien");	
//			}
//		
//		Personne bobby = new Personne("Bobby", "Kotick", "Homme", 45, 104, 156);
//		System.out.println(bobby.getFirstname());
//		bobby.setFirstname("Robert");
//		System.out.println(bobby.getFirstname());
//		
//		Apprenant Georges = new Apprenant("Brown","Alfonse" , 3, "Java");
//		Apprenant Alex = new Apprenant("is","Alex" , 1, "Java");
//		Apprenant Michou = new Apprenant("Pompidou","Michou" , 3, "Java");
//
//		Apprenant[] arr = new Apprenant[3];
//		arr[0] = Georges;
//		arr[1] = Alex;
//		arr[2] = Michou;
//		
//		for (Apprenant apprenant : arr) {
//			if (apprenant.getNiveau()== 3)
//				System.out.println(apprenant.getPrenom() + " " + apprenant.getNom() );
//		}
//		
	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("=================>");
//	System.out.println("===========================>");
//	System.out.println("vos achats");
//	String descrip = sc.nextLine();
//	System.out.println("=================>");
//	System.out.println("===========================>");
//	System.out.println("combien?");
//	int combien = sc.nextInt();
//	System.out.println("=================>");
//	System.out.println("===========================>");
//	System.out.println("prix u");
//	int prix = sc.nextInt();
//	System.out.println(prix + " Euro");
//	System.out.println("=================>");
//	System.out.println("===========================>");
//	System.out.println("Total");
//	System.out.println(combien*prix);
//		System.out.println("=================>");
//	System.out.println("===========================>");
//		
		Scanner sc = new Scanner(System.in);
		String name = "";
		
		//Stop console quand on entre 'stop' =========
//		System.out.println("more : Add Produit");
//		System.out.print("stop : Stop here");
		
//		ce code s'excutera quand on entrera "more"
		ArrayList<Produit> Myproduits = new ArrayList<Produit>();
		while(!name.equals("stop")) {
			
			
			
			System.out.print(" Nom du produit ou stop");
			 name = sc.next();
			if(name.equals("stop")) break;
			
			System.out.print(" Prix Unitaire ");
			int price = sc.nextInt();
			
			System.out.print(" Quantitée ");
			int number = sc.nextInt();
			
			Produit produit = new Produit(name, price, number);
			
			Myproduits.add(produit);
			
			
		}
		int prixTotal = 0;
		for (Produit Produit : Myproduits) {
				System.out.println(Produit.getName() + " " + Produit.getNumber()+ " " + Produit.getPrice());
				int prix = Produit.getNumber()*Produit.getPrice();
				System.out.println("total " + prix);
				prixTotal += prix;
				}
		System.out.println(prixTotal);
	}}


		
		
		
		
		
		
//		Produit produit = new Produit(null, 0, 0);