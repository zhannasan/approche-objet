package geometrie;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		ObjetGeometrique[] tab = new ObjetGeometrique[2];
		tab[0] = new Cercle(3.2);
		tab[1] = new Rectangle(3.1, 5.0);
		
		for (int i=0; i<tab.length; i++){
			System.out.println(tab[i]);
		}
	}

}
