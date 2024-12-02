import java.util.ArrayList;
import java.util.Scanner;

public class VerificacaoDeElementos {
    public static void Verficacao(){

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(6);
        numeros.add(8);
        numeros.add(7);
        numeros.add(10);

        numeros.contains(5);

        if (numeros.contains(5)){
            System.out.println("Tem o numero 5");
        }
        else {
            System.out.println("Não tem o numero 5");
        }

        int index = numeros.indexOf(7);
        System.out.println("O indice do numero 7 é "+index);

        numeros.isEmpty();

        if (numeros.isEmpty()){
            System.out.println("A lista está vazia");
        }
        else {
            System.out.println("A lista não está vazia");
        }













    }
}
