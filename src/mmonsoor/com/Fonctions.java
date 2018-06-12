package mmonsoor.com;

public class Fonctions {
	
	static byte nombrePommesDeTerre;
	static byte nombrePatateEpluches;
	static short nombreFrites;
	static String couteau;
	static String friteuse;
	static String  huile;
	
	public static void main(String[] args) {
		
		//########Les fonctions
		
			nombrePommesDeTerre=20;
			nombrePatateEpluches=0;
			nombreFrites=0;
			couteau="Couteau";
			friteuse="Friteuse";
			huile="Huile";	
			
			//Boucle pour éplucher les 20 pommesdeterre
			for(int i=1;i<=20;i++) {
				eplucherPommeDeTerre(nombrePommesDeTerre);
			}
			//System.out.println(nombrePatateEpluches);
			//System.out.println(nombrePommesDeTerre);
			
			for(short i=1;i<=20;i++) {
				System.out.println(nombreFrites);
				System.out.println(i);
				nombreFrites=couperPatates(nombrePatateEpluches);
				
			}
			
			System.out.println("Le Nombre de frites est de "+nombreFrites);
			System.out.println("Le Nombre de patates epluchees restantes est de "+nombrePatateEpluches);
			
			//Fonction toute simple d'ajout
			int chiffre1=2;
			int chiffre2=2;
			int resul=addnb(chiffre1,chiffre2);
			System.out.println(resul);
			

			
//#### Chaine de caractère
			
			String phrase="\nJe m'appelle Misharl.\n";
			//Ca crée un tableau dont chaque cellule est un mot
			//System.out.println(phrase.split(" ")[1]);
			//J'affiche les éléments de mon tableau 
			for (String x: phrase.split(" ") ) {
				//System.out.print(x+" ");
			}
			
			int variable=150;
			System.out.println(phrase.substring(0,5));
			
			//String.startsWith("Jean-");
			//String.endsWith("rie");
			//String.trim() //ça enlève les espaces
			//String.replace
			
			System.out.println(phrase.replace("\n",""));
			
			
	}
	
	
		private static void eplucherPommeDeTerre(byte pommeDeTerre) {
			 byte pommeDeTerreEpluchee=pommeDeTerre;
			 nombrePatateEpluches++;
			 nombrePommesDeTerre--;
		}
		
	
		private static short couperPatates(short nbpatatesEpluches ) {
			
			
			nombreFrites+=25;
			nombrePatateEpluches--;
			return nombreFrites;	
		}
		//Petite fonction simple qui fait l'addition
		private static int addnb(int chiffre1,int chiffre2) {
			return (chiffre1+chiffre2);
		}
		
		
		
		
		
		
		
		
		

}
