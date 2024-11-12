import java.util.List;

/**
 * A classe AgendamentoController é responsável por controlar as operações de agendamentos,
 * como a criação, modificação e listagem dos agendamentos.
 */
public class AgendamentoController {
    private AgendamentoData agendamentoData;

    public AgendamentoController() {
        this.agendamentoData = new AgendamentoData();  // Inicializa o repositório de dados
    }

    /**
     * Cria um novo agendamento e o adiciona ao repositório de dados.
     *
     * @param servico O serviço a ser agendado.
     * @param status  O status do agendamento.
     * @param cliente O cliente associado ao agendamento.
     */
    public void criarAgendamento(String servico, Agendamento.StatusAgendamento status, Cliente cliente) {
        Agendamento agendamento = new Agendamento(servico, status, cliente);
        agendamentoData.adicionarAgendamento(agendamento);
    }

    /**
     * Lista todos os agendamentos.
     *
     * @return A lista de agendamentos.
     */
    public List<Agendamento> listarAgendamentos() {
        return agendamentoData.listarAgendamentos();
    }

    /**
     * Modifica o status de um agendamento.
     *
     * @param agendamento O agendamento a ser modificado.
     * @param novoStatus  O novo status a ser atribuído.
     */
    public void alterarStatus(Agendamento agendamento, Agendamento.StatusAgendamento novoStatus) {
        agendamento.setStatus(novoStatus);
    }

    /**
     * Cancela um agendamento.
     *
     * @param agendamento O agendamento a ser cancelado.
     */
    public void cancelarAgendamento(Agendamento agendamento) {
        agendamento.setStatus(Agendamento.StatusAgendamento.CANCELADO);
    }
}
