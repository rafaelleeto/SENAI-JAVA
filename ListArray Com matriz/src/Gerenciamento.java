import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciamento {
    static ArrayList<String> lista= new ArrayList<>();

    public static void Gerenciamento(){
        Scanner scanner=new Scanner(System.in);
        int opcao=0;
        opcao = scanner.nextInt();
        do {
            System.out.println("Bem vindo ao gerenciamento de produtos");
            System.out.println("1- Adicionar produtos");
            System.out.println("2- Exibir produtos");
            System.out.println("3- Remover produto");

            if (opcao==1){
                Adicionar();

            }
            if (opcao==2){
                Mostrar();

            }

            if (opcao==3){

            }

        }while (opcao!=0);
    }


    public static void Mostrar(){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));

        }
    }
    public static void Adicionar(){
        Scanner scanner= new Scanner(System.in);
        String nome;
        System.out.println("Digite o nome do produto");
        nome = scanner.next();
        lista.add(nome);
    }
    public static void Remover(){
        String nome;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do produto que voce deseja remover");
        nome = scanner.next();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.contains(nome)){
                lista.remove(nome);
                i--;
            }
            else {
                System.out.println("Esse produto nao esta na lista");
            }


        }
    }
}
