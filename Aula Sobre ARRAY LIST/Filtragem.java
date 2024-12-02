import java.util.ArrayList;
import java.util.Random;

public class Filtragem {
    public static void Filtrar() {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        Random random = new Random();


        for (int i = 0; i < 15; i++) {
            numeros.add(random.nextInt(100));

        }

        for (int i = 0; i < 15; i++) {

            if (numeros.get(i) % 2 == 0) {
                pares.add(numeros.get(i));

            }

        }
        System.out.println(numeros);
        System.out.println(pares);


    }
}
