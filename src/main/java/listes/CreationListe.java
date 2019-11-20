package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=0; i<100; i++){
			array.add(i);
		}
		System.out.println(array.size());

	}

}
