package geometrie;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		ObjetGeometrique[] tab = new ObjetGeometrique[2];
		tab[0] = new Cercle(3.5);
		tab[1] = new Rectangle(2.1, 4.0);
		
		for (int i=0; i<tab.length; i++){
			System.out.println(tab[i].perimetre());
			System.out.println(tab[i].surface());
		}
	}

}
