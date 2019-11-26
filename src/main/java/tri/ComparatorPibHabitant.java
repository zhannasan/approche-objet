package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorPibHabitant implements Comparator<Pays>{

	@Override
	public int compare(Pays p, Pays q) {
		return q.getPib()-p.getPib();
	}

}
