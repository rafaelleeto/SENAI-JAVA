import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Matriz {
    static Scanner scanner = new Scanner(System.in);
    static List<List<String>> matriz = new ArrayList<>();
    static List<String> linha1 = new ArrayList<>();
    static List<String> linha2 = new ArrayList<>();

    public static void Inicializar() {


        linha1.add("Segunda");
        linha1.add("Terça");
        linha1.add("Quarta");
        linha1.add("Quinta");
        linha1.add("Sexta");
        linha1.add("Sabado");
        linha1.add("Domingo");
        linha2.add(" ");
        linha2.add(" ");
        linha2.add(" ");
        linha2.add(" ");
        linha2.add(" ");
        linha2.add(" ");
        linha2.add(" ");

    }

    public static void Menu() {
        Inicializar();
        int opcao = 0;

        do {

            System.out.println("1- Adicionar tarefas");
            System.out.println("2- Mostrar tarefas");
            System.out.println("3- Remover tarefas");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                Adicionar();

            } else if (opcao == 2) {
                Mostrar();

            } else if (opcao == 3) {
                Remover();

            }


        } while (opcao != 0);

    }

    public static void Adicionar() {
        String dia;
        System.out.println("Digite o dia da semana que você quer adicionar uma tarefa");
        dia = scanner.next();


        if (linha1.contains(dia)) {
            System.out.println("Digite a tarefa");
            String tarefa = scanner.next();
            for (int i = 0; i < linha1.size(); i++) {
                if (Objects.equals(linha1.get(i), dia)) {
                    linha2.set(i, tarefa);
                    return;
                }


            }
        } else {
            System.out.println("Dia invalido");
        }

    }
    public static void Mostrar(){
        for (int i = 0; i < linha1.size(); i++) {
            System.out.println("Dia "+linha1.get(i)+" Com a tarefa "+linha2.get(i));;
        }

    }
    public static void Remover (){
        String dia;

        System.out.println("Digite o dia que voce deseja remover a tarefa");
        dia = scanner.next();

        if (linha1.contains(dia)){

            for (int i = 0; i < linha1.size() ; i++) {
                if (Objects.equals(linha1.get(i), dia)){
                    linha2.set(i," ");
                }

            }

        }
        else {
            System.out.println("Dia invalido");
        }

    }

}

