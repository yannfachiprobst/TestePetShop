import java.util.List;
import java.util.ArrayList;

/**
 * A classe AgendamentoData é responsável pela persistência de dados dos agendamentos.
 * Neste exemplo, estamos usando uma lista na memória para simular o banco de dados.
 */
public class AgendamentoData {
    private List<Agendamento> agendamentos;

    public AgendamentoData() {
        agendamentos = new ArrayList<>();
    }

    /**
     * Adiciona um agendamento ao repositório.
     *
     * @param agendamento O agendamento a ser adicionado.
     */
    public void adicionarAgendamento(Agendamento agendamento) {
        agendamentos.add(agendamento);
    }

    /**
     * Lista todos os agendamentos armazenados.
     *
     * @return A lista de agendamentos.
     */
    public List<Agendamento> listarAgendamentos() {
        return agendamentos;
    }

    /**
     * Encontra um agendamento pelo cliente.
     *
     * @param cliente O cliente associado ao agendamento.
     * @return O agendamento encontrado ou null se não existir.
     */
    public Agendamento encontrarAgendamentoPorCliente(Cliente cliente) {
        for (Agendamento agendamento : agendamentos) {
            if (agendamento.getCliente().equals(cliente)) {
                return agendamento;
            }
        }
        return null;
    }
}
