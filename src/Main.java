import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializa os vetores para armazenar os dados
        String[] vetCliente = new String[5];
        String[] vetAnimal = new String[5];
        String[] vetTipoAnimal = new String[5];
        String[] vetServico = new String[5];
        String[] vetStatus = new String[5];

        int totalClientes = 0;  // Contador de clientes cadastrados
        int totalAgendamentos = 0;  // Contador de agendamentos realizados

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Agendar Serviço");
            System.out.println("3. Gerar Relatório");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (opcao) {
                case 1:
                    // Cadastrar cliente
                    if (totalClientes < 5) {
                        System.out.print("Digite o nome do cliente: ");
                        String nomeCliente = scanner.nextLine();
                        System.out.print("Digite o nome do animal: ");
                        String nomeAnimal = scanner.nextLine();
                        System.out.print("Digite o tipo do animal (Cachorro, Gato, etc.): ");
                        String tipoAnimal = scanner.nextLine();

                        // Armazena os dados nos vetores
                        vetCliente[totalClientes] = nomeCliente;
                        vetAnimal[totalClientes] = nomeAnimal;
                        vetTipoAnimal[totalClientes] = tipoAnimal;
                        totalClientes++;
                    } else {
                        System.out.println("Limite de clientes atingido.");
                    }
                    break;

                case 2:
                    // Agendar serviço
                    if (totalClientes == 0) {
                        System.out.println("Nenhum cliente cadastrado. Cadastre um cliente primeiro.");
                    } else {
                        System.out.println("Escolha um cliente para agendar o serviço:");
                        for (int i = 0; i < totalClientes; i++) {
                            System.out.println((i + 1) + ". " + vetCliente[i] + " - " + vetAnimal[i]);
                        }
                        System.out.print("Digite o número do cliente (1 a " + totalClientes + "): ");
                        int clienteEscolhido = scanner.nextInt() - 1;
                        scanner.nextLine();  // Limpar o buffer

                        System.out.print("Escolha o serviço (1. Banho, 2. Tosa): ");
                        int tipoServico = scanner.nextInt();
                        scanner.nextLine();  // Limpar o buffer

                        // Armazena o serviço e o status
                        if (tipoServico == 1) {
                            vetServico[clienteEscolhido] = "Banho";
                        } else if (tipoServico == 2) {
                            vetServico[clienteEscolhido] = "Tosa";
                        } else {
                            System.out.println("Serviço inválido.");
                            break;
                        }

                        // Define o status como "Agendado"
                        vetStatus[clienteEscolhido] = "Agendado";
                        totalAgendamentos++;
                        System.out.println("Serviço agendado com sucesso!");
                    }
                    break;

                case 3:
                    // Gerar relatório
                    System.out.println("\nRelatório de Agendamentos:");
                    int agendados = 0;
                    int realizados = 0;
                    for (int i = 0; i < totalClientes; i++) {
                        if (vetServico[i] != null) {
                            System.out.println(vetCliente[i] + " - " + vetAnimal[i] + " (" + vetTipoAnimal[i] + ") - " +
                                    vetServico[i] + " - " + vetStatus[i]);
                            if (vetStatus[i].equals("Agendado")) {
                                agendados++;
                            } else if (vetStatus[i].equals("Realizado")) {
                                realizados++;
                            }
                        }
                    }
                    System.out.println("\nTotal de serviços agendados: " + agendados);
                    System.out.println("Total de serviços realizados: " + realizados);
                    break;

                case 4:
                    // Encerra o programa
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
