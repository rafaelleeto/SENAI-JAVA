import java.util.ArrayList;

public class SomaDeElementos {
    public static void Soma(){
        ArrayList<Double> numeros = new ArrayList<>();

        double soma=0;

        numeros.add(1.0);
        numeros.add(1.0);
        numeros.add(1.0);
        numeros.add(1.0);
        numeros.add(1.0);

        for (int i = 0; i < 5; i++) {
            soma=soma+ numeros.get(i);

        }
        System.out.println(soma);
    }
}
