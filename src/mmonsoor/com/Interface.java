package mmonsoor.com;

import java.util.Scanner;

/**
 * Classe qui permet de d�couvrir le monde de l'interface.
 * @author Misharl Monsoor
 *@category Application Java
 */
public class Interface {
	
	//Fonction principale (point d'entr�e)
	public static void main(String[] args) {
	
		Scanner clavier= new Scanner(System.in);
		String prenom;
		// Je tape au clavier
		prenom=clavier.nextLine();
		System.out.println("Bonjour "+prenom);
			
	}
	

}
