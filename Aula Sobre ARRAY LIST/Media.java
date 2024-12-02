import java.util.ArrayList;
import java.util.Collections;

public class Media {
    public static void Media() {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(60.0);
        notas.add(90.0);
        notas.add(10.0);
        notas.add(100.0);
        notas.add(50.0);
        double total = 0;


        for (int i = 0; i < 5; i++) {
            total = total + notas.get(i);

        }
        System.out.println(total);

        double media= total/5;

        System.out.println(media);

        System.out.println("Maior nota: " +Collections.max(notas));
        System.out.println("Menor nota: " +Collections.min(notas));

        for (int i = notas.size()-1; i >=0; i--) {
            if (notas.get(i)<62){
                notas.remove(i);
                System.out.println(notas);
            }

        }

    }
}
