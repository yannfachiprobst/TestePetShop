/**
 * A classe Cliente representa um cliente e as informações sobre seu animal de estimação.
 * Esta classe contém os dados do cliente, incluindo seu nome, o nome do animal
 * e o tipo de animal.
 */
public class Cliente {
    private String nome;        // Nome do cliente
    private String nomeAnimal;  // Nome do animal de estimação
    private String tipoAnimal;  // Tipo do animal de estimação

    /**
     * Construtor da classe Cliente.
     *
     * @param nome        O nome do cliente.
     * @param nomeAnimal  O nome do animal de estimação.
     * @param tipoAnimal  O tipo do animal de estimação.
     */
    public Cliente(String nome, String nomeAnimal, String tipoAnimal) {
        this.nome = nome;
        this.nomeAnimal = nomeAnimal;
        this.tipoAnimal = tipoAnimal;
    }

    /**
     * Construtor padrão da classe Cliente.
     * Este construtor permite criar um objeto Cliente sem inicializar os atributos.
     */
    public Cliente() {
        // Construtor vazio
    }

    // Métodos getters e setters

    /**
     * Retorna o nome do cliente.
     *
     * @return O nome do cliente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do cliente.
     *
     * @param nome O novo nome do cliente.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o nome do animal de estimação.
     *
     * @return O nome do animal de estimação.
     */
    public String getNomeAnimal() {
        return nomeAnimal;
    }

    /**
     * Define o nome do animal de estimação.
     *
     * @param nomeAnimal O novo nome do animal de estimação.
     */
    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    /**
     * Retorna o tipo do animal de estimação.
     *
     * @return O tipo do animal de estimação.
     */
    public String getTipoAnimal() {
        return tipoAnimal;
    }

    /**
     * Define o tipo do animal de estimação.
     *
     * @param tipoAnimal O novo tipo do animal de estimação.
     */
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
}
