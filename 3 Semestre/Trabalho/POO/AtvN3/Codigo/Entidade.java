public class Entidade extends SQLClass{
    protected int indice;
    protected int status; //0 - ativo   1 - inativo
    protected String nome;
    protected String cpf;
    protected String data_nascimento;
    protected String endereco;
    protected String telefone;
    protected int tipo; //0 - Médico  1 - Paciente


    public Entidade() {
        this.setTableName("Entidade");
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    public void setStatus(int status) {
            this.status = status;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setDataNascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }


    public int getIndice() {
        return indice;
    }
    public int getStatus() {
            return status;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getData_nascimento() {
        return data_nascimento;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public int getTipo() {
        return tipo;
    }

    public void CadastroEntidade(int indice, String nome, int status, String cpf, String data_nascimento, String endereco, String telefone, int tipo) {
        try {
        setIndice(indice);
        setNome(nome);
        setStatus(status);
        setCpf(cpf);
        setDataNascimento(data_nascimento);
        setEndereco(endereco);
        setTelefone(telefone);  
        setTipo(tipo);
        } catch (Exception e) {
            System.out.println(" Erro ao cadastrar a entidade.");
            e.printStackTrace();
            return;
        }
        System.out.println("Entidade cadastrada com sucesso!");
    }
    public void PrintEntidade() {
        System.out.println("Indice: " + indice);
        System.out.println("Nome: " + nome);
        System.out.println("Status: " + status);
        System.out.println("CPF " + cpf);
        System.out.println("Data de Nascimento " + data_nascimento);
        System.out.println("Endereço " + endereco);
        System.out.println("Telefone " + telefone);
        System.out.println("Tipo: " + tipo);
        System.out.println("");

    }

}
