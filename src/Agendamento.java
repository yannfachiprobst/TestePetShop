public class Agendamento {
    private String servico;                // O serviço a ser agendado
    private StatusAgendamento status;      // O status do agendamento (agendado, concluído, cancelado)
    private Cliente cliente;                // O cliente associado ao agendamento

    public Agendamento(String servico, StatusAgendamento status, Cliente cliente) {
        this.servico = servico;
        this.status = status;
        this.cliente = cliente;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public StatusAgendamento getStatus() {
        return status;
    }

    public void setStatus(StatusAgendamento status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Agendamento: [Serviço: " + servico + ", Status: " + status + ", Cliente: " + cliente.getNome() + ", Animal: " + cliente.getNomeAnimal() + ", Tipo: " + cliente.getTipoAnimal() + "]";
    }

    public enum StatusAgendamento {
        AGENDADO,    // O agendamento foi criado
        CONCLUIDO,   // O agendamento foi concluído
        CANCELADO    // O agendamento foi cancelado
    }
}
