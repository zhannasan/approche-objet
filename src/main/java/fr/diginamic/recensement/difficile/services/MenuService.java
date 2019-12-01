package fr.diginamic.recensement.difficile.services;

import java.util.Scanner;

import fr.diginamic.recensement.difficile.entites.Recensement;

public abstract class MenuService {
	
	public abstract void traiter(Recensement recensement, Scanner scanner) ;
}
