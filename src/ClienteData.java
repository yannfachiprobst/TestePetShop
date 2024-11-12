/**
 * A classe ClienteData representa um cliente e seu animal de estimação.
 *
 * Esta classe valida e armazena informações sobre o nome do cliente, o nome do animal e o tipo de animal.
 * Os nomes devem conter apenas letras e não podem estar vazios.
 */
public class ClienteData {
    // Variáveis de instância
    private String nome;          // Nome do cliente
    private String nomeAnimal;    // Nome do animal de estimação
    private String tipoAnimal;     // Tipo do animal (ex: cachorro, gato, etc.)

    // Expressão regular para validar nomes
    private static final String NAME_REGEX = "^[A-Za-zÀ-ÿ\\s]+$";

    /**
     * Construtor da classe ClienteData.
     *
     * @param nome        O nome do cliente.
     * @param nomeAnimal  O nome do animal de estimação.
     * @param tipoAnimal  O tipo do animal de estimação.
     * @throws IllegalArgumentException se o nome, nome do animal ou tipo do animal
     *                                  não forem válidos (contiverem caracteres não permitidos ou estiverem em branco).
     */
    public ClienteData(String nome, String nomeAnimal, String tipoAnimal) {
        if (!isValidName(nome) || !isValidName(nomeAnimal) || !isValidName(tipoAnimal)) {
            throw new IllegalArgumentException("Nome, nome do animal e tipo de animal devem conter apenas letras e não podem estar em branco.");
        }
        this.nome = nome.trim();           // Remove espaços em branco do início e fim
        this.nomeAnimal = nomeAnimal.trim();
        this.tipoAnimal = tipoAnimal.trim();
    }

    /**
     * Verifica se o nome fornecido é válido.
     *
     * @param value O nome a ser validado.
     * @return true se o nome for válido; caso contrário, false.
     */
    private boolean isValidName(String value) {
        return value != null && value.matches(NAME_REGEX) && !value.trim().isEmpty();
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    /**
     * Retorna uma representação em String do objeto ClienteData.
     *
     * @return Uma string formatada com os detalhes do cliente e seu animal.
     */
    @Override
    public String toString() {
        return "Cliente: " + nome + ", Pet: " + nomeAnimal + ", Tipo: " + tipoAnimal;
    }
}
