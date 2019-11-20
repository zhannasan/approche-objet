package sets;

import java.util.*;

public class TestSetDouble {

	public static void main(String[] args) {
		List<Double> list = Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01);
		Set <Double> set = new HashSet<>(list);
		System.out.println(set);
		System.out.println("Max "+Collections.max(set));
		double min=Collections.min(set);
		System.out.println("Min "+min);
		set.remove(min);
		System.out.println(set);
	}

}
