import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        while (true){
            System.out.println("\n1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("4 - Sair");

            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Digite sua tarefa: ");
                    String tarefa = scanner.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada!");
                    break;
                case 2:
                    if(tarefas.isEmpty()){
                        System.out.println("Nenhuma tarefa cadastrada!");
                    } else {
                        for(int i = 0; i < tarefas.size(); i++){
                            System.out.println((i + 1) + " - " + tarefas.get(i));

                        }
                    }
                    break;
                case 3:
                    if(tarefas.isEmpty()){
                        System.out.println("Nenhuma tarefa para remover!");
                    } else {
                        System.out.print("Digite o número da tarefa que deseja remover: ");
                        int index = scanner.nextInt();
                        if(index > 0 && index <= tarefas.size()){
                            tarefas.remove(index - 1);
                            System.out.println("Tarefa removida!");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente");

            }
        }
    }
}