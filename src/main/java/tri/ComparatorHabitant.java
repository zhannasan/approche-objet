package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorHabitant implements Comparator<Pays>{

	@Override
	public int compare(Pays p, Pays q) {
		if(q.getnHabit()>p.getnHabit()){
			return 1;
		}else if (q.getnHabit()<p.getnHabit()){
			return -1;
		}
		return 0;
	}

}
