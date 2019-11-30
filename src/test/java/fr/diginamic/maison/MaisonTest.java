/**
 * 
 */
package fr.diginamic.maison;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author janka
 *
 */
public class MaisonTest {
	@Test
	public void getSuperficieTotalePositive() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Cuisine(10,1));
		assertEquals(10,  maison.getSuperficieTotale(),0.001);
	}
	@Test
	public void getSuperficieTotaleNull() {
		Maison maison = new Maison();
		maison.ajouterPiece(null);
		assertEquals(0, maison.getSuperficieTotale(),0.001);
	}
	
	@Test
	public void getSuperficieTotaleNegative() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Cuisine(-10,1));
		assertEquals(0,  maison.getSuperficieTotale(),0.001);
	}
	
	@Test
	public void getSuperficieParEtageNegative() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Cuisine(-10,1));
		assertEquals(0,  maison.getSuperficieTotale(),0.001);
	}
	
	@Test
	public void  getSuperficieParTypePieceNegative() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Cuisine(-10,1));
		assertEquals(0,  maison.getSuperficieTotale(),0.001);
	}

}
