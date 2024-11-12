import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A classe ClienteController é responsável por gerenciar o cadastro e a listagem de clientes
 * e seus animais de estimação.
 * Esta classe utiliza a classe ClienteData para armazenar os dados dos clientes.
 */
public class ClienteController {
    private final List<ClienteData> clientes = new ArrayList<>();  // Lista para armazenar clientes
    private final Scanner sc = new Scanner(System.in);              // Scanner para entrada de dados

    /**
     * Método para cadastrar um novo cliente e seu animal de estimação.
     * Este método solicita as informações do cliente, valida os dados e
     * armazena um novo objeto ClienteData na lista de clientes.
     */
    public void cadastrarCliente() {
        System.out.println("Cadastrando cliente!");

        // Solicita o nome do cliente
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        if (isInvalidName(nome)) {
            System.out.println("Nome inválido. Apenas letras e espaços são permitidos.");
            return;
        }

        // Solicita o nome do animal de estimação
        System.out.print("Digite o nome do seu pet: ");
        String nomeAnimal = sc.nextLine();
        if (isInvalidName(nomeAnimal)) {
            System.out.println("Nome do pet inválido. Apenas letras e espaços são permitidos.");
            return;
        }

        // Solicita o tipo de animal
        System.out.print("Seu pet é um: ");
        String tipoAnimal = sc.nextLine();
        if (isInvalidName(tipoAnimal)) {
            System.out.println("Tipo de animal inválido. Apenas letras e espaços são permitidos.");
            return;
        }

        // Cria um novo objeto ClienteData e o adiciona à lista de clientes
        ClienteData clienteData = new ClienteData(nome, nomeAnimal, tipoAnimal);
        clientes.add(clienteData);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    /**
     * Verifica se o nome fornecido é inválido.
     *
     * @param value O nome a ser validado.
     * @return true se o nome for inválido; caso contrário, false.
     */
    private boolean isInvalidName(String value) {
        return value == null || !value.matches("[A-Za-z ]+") || value.trim().isEmpty();
    }

    /**
     * Método para listar todos os clientes cadastrados.
     * Se não houver clientes, uma mensagem é exibida.
     */
    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        // Exibe os detalhes de cada cliente
        for (ClienteData c : clientes) {
            System.out.println(c);
        }
    }
}
