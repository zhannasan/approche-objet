package listes;

import java.util.*;

public class TestListeInt {

	public static void main(String[] args) {
		List<Integer> array = Arrays.asList(-1, 5, 7 , 3, -2, 4, 8);
		
		//iteration play:
		System.out.println("One");
		for(int i : array){
			System.out.println(i);
		}
		System.out.println("Two");
		for(int i=0; i<array.size(); i++){
			System.out.println(array.get(i));
		}
		System.out.println("Three");
		Iterator<Integer> it = array.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("List size "+array.size());
		System.out.println("Max "+Collections.max(array));
		
		//cannot resize Arrays.asList()
		Collection c = new ArrayList(Arrays.asList(array));
		int min = Collections.min(array);
		c.remove(array.indexOf(min));
		
		System.out.println("Negative elements:");
		for (int i=0; i<array.size();i++){
			if(array.get(i)<0){
				int neg = array.get(i);
				System.out.println(neg);
				array.set(i, -neg);
			}
		}
		System.out.println("Become positive "+array);
	}

}
