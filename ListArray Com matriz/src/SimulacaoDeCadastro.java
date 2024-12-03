import java.util.ArrayList;
import java.util.Scanner;

public class SimulacaoDeCadastro {



    public static void Simula(){

        ArrayList<String> nome =new ArrayList<>();
        ArrayList<Integer> cpf =new ArrayList<>();
        ArrayList<Float> altura =new ArrayList<>();



        float alt=0;
        int cp=0;
        String no;
        int opcao=0;
        Scanner scanner=new Scanner(System.in);
        int cont=0;

        do {

            System.out.println("Bem vindo ao menu selecione uma das opções abaixo");
            System.out.println("1- Adicionar um cliente");
            System.out.println("2- Remover um cliente");
            System.out.println("3- Verificar se um cliente esta na lista");
            System.out.println("4- Exibir todos os clientes");
            opcao = scanner.nextInt();



            if (opcao==1){
                System.out.println("Digite o nome do cliente");
                no = scanner.next();
                nome.add(no);

                System.out.println("Digite o cpf do cliente");
                cp = scanner.nextInt();
                cpf.add(cp);

                System.out.println("Digite a altura do cliente");
                alt = scanner.nextFloat();
                altura.add(alt);

            }
            if (opcao==2){
                System.out.println("Digite o nome do cliente que voce deseja remover");
                no = scanner.next();

                for (int i = 0;  i < nome.size() ; i++) {
                    if (nome.contains(no)){
                        nome.remove(i);
                        altura.remove(i);
                        cpf.remove(i);
                        i--;

                    }
                    else {
                        System.out.println("Nome errado, tente novamente");
                    }

                }
            }

            if (opcao==3){
                System.out.println("Digite o nome do cliente, para verificar se está na lista ");
                no = scanner.next();

                for (int i = 0; i < nome.size(); i++) {
                    if (nome.contains(no)){
                        System.out.println("O cliente "+no+ " esta na lista");
                        return;
                    }
                    else {
                        System.out.println("O cliente "+no+" nao esta na lista");
                        break;
                    }

                }
            }

            if (opcao==4){
                for (int i = 0; i < nome.size(); i++) {
                    System.out.println(nome.get(i));
                    System.out.println(cpf.get(i));
                    System.out.println(altura.get(i));

                }
            }

        }while (opcao!=0);

    }

}