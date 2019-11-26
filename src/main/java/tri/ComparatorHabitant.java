package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorHabitant implements Comparator<Pays>{

	@Override
	public int compare(Pays p, Pays q) {
		return (int) (q.getnHabit()-p.getnHabit());
	}

}
