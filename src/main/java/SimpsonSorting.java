import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpsonSorting {

     public static void main(String... sortingWithList) {
        List<Simpson> simpsons = new ArrayList<>();
        simpsons.add(new Simpson("Homer "));
        simpsons.add(new Simpson("Marge "));
        simpsons.add(new Simpson("Bart "));
        simpsons.add(new Simpson("Lisa "));

        Collections.sort(simpsons);
        simpsons.stream().map(s -> s.name).forEach(System.out::print);

        Collections.reverse(simpsons);
        simpsons.stream().map(s -> s.name).forEach(System.out::print);
    }

}