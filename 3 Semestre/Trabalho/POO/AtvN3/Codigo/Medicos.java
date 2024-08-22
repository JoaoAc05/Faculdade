public class Medicos extends Entidade{
    protected int indice;
    protected String especialidade;
    protected String crm;

    public Medicos() {
        this.setTableName("Medicos");
    }
    
    public void setIndiceMedico(int indice) {
        this.indice = indice;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }

    public int getIndiceMedico() {
        return indice;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public String getCrm() {
        return crm;
    }

    public void CadastroMedico(int indice, String especialidade, String crm) {
        try {
            setIndiceMedico(indice);
            setEspecialidade(especialidade);
            setCrm(crm);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar o(a) medico(a)!");
            e.printStackTrace();
            return;
        }
        System.out.println("Medico cadastrado com sucesso!");
    }
    public void PrintMedico(){
        System.out.println("Indice: " + indice);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("CRM: " + crm);
        System.out.println("");
    }
}
