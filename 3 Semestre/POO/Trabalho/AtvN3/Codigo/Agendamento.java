public class Agendamento extends SQLClass{
    protected int indice;
    protected String horario_agendamento;
    protected int indice_usuario;
    protected int indice_medico;
    protected int indice_paciente;
    protected int status; // 0 - Agendado    1 - Realizado    2 - Cancelado

    public Agendamento(){
        this.setTableName("Agendamento");
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    public void setHorarioAgendamento(String horario_agendamento) {
        this.horario_agendamento = horario_agendamento;
    }
    public void setIndiceUsuario(int indice_usuario) {
        this.indice_usuario = indice_usuario;
    }
    public void setIndiceMedico(int indice_medico) {
        this.indice_medico = indice_medico;
    }
    public void setIndicePaciente(int indice_paciente) {
        this.indice_paciente = indice_paciente;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    public int getIndice() {
        return indice;
    }
    public String getHorarioAgendamento() {
        return horario_agendamento;
    }
    public int getIndiceUsuario() {
        return indice_usuario;
    }
    public int getIndiceMedico() {
        return indice_medico;
    }
    public int getIndicePaciente() {
        return indice_paciente;
    }
    public int getStatus() {
        return status;
    }

    public void CadastroAgendamento (int indice, String horario_agendamento, int indice_usuario, int indice_medico, int indice_paciente, int status) {
        setIndice(indice);
        setHorarioAgendamento(horario_agendamento);
        setIndiceUsuario(indice_usuario);
        setIndiceMedico(indice_medico);
        setIndicePaciente(indice_paciente);
        setStatus(status);
        System.out.println("Agendamento cadastrado com sucesso!");
    }
    public void PrintAgendamento(){
        System.out.println("Indice: " + indice);
        System.out.println("Horario: " + horario_agendamento);
        System.out.println("Código do Usuário: " + indice_usuario);
        System.out.println("Código do Médico: " + indice_medico);
        System.out.println("Código do Paciente: " + indice_paciente);
        System.out.println("Status: " + status);
        System.out.println("");
    }

}
