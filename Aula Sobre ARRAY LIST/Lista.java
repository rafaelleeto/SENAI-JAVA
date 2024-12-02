import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    public static void Lista() {
        ArrayList<String> nomes = new ArrayList<>();
        String nome;
        Scanner scanner= new Scanner(System.in);


        System.out.println("Digite pelo menos 5 nomes á lista");

        nome=scanner.nextLine();
        nomes.add(nome);

        nome=scanner.nextLine();
        nomes.add(nome);

        nome=scanner.nextLine();
        nomes.add(nome);

        nome=scanner.nextLine();
        nomes.add(nome);

        nome=scanner.nextLine();
        nomes.add(nome);

        System.out.println(nomes);
        System.out.println("remova um nome");

        nome=scanner.nextLine();
        nomes.remove(nome);
        System.out.println(nomes);


        nome=scanner.nextLine();
        nomes.contains(nome);



        if (true == nomes.contains(nome)){
            StringBuilder invertido = new StringBuilder(nome);
            invertido.reverse();

            int index = nomes.indexOf(nome);

            nomes.set(index, invertido.toString());

        }
        System.out.println(nomes);


    }

}
