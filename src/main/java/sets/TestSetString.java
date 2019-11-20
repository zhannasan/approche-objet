package sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde");
		Set <String> set = new HashSet<>(list);
		System.out.println(set);
		
		String maxPays = null;
		int max =0;
		for (String s : set){
			if(s.length()>=max){
				max=s.length();
				maxPays=s;
			}
		}
		System.out.println(maxPays);
		set.remove(maxPays);
		System.out.println(set);
	}

}
