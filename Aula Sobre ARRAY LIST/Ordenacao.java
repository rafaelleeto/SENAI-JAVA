import java.util.ArrayList;
import java.util.Collections;

public class Ordenacao {
    public static void Ordenacao(){
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Rafael");
        nomes.add("Paulo");
        nomes.add("Daiany");

        Collections.sort(nomes);

        System.out.println(nomes.getFirst());
        System.out.println(nomes.getLast());

        Collections.reverse(nomes);
        System.out.println(nomes);





    }
}
