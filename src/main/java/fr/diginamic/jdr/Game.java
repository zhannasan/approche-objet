package fr.diginamic.jdr;

import java.util.Scanner; 

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Menu
		afficherMenu();
		if(sc.hasNextInt()){
			int input = sc.nextInt();
			switch(input){
			
			case 1:
				Personnage pers = new Personnage(0, 0, 0);
				
			}
			
		}
		
		
	}
	public static void afficherMenu(){
		System.out.println("1. Créer personnage");
		System.out.println("2. Commbattre une créature");
		System.out.println("3. Afficher score");
		System.out.println("4. Sortir");
	}
}
