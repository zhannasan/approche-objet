package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorPibHabitant implements Comparator<Pays>{

	@Override
	public int compare(Pays p, Pays q) {
		if (q.getPib()>p.getPib()){
			return 1;
		}else if(q.getPib()<p.getPib()){
			return -1;
		}
		return 0;
	}

}
