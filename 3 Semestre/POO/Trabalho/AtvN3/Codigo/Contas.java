public class Contas extends SQLClass {
    protected int indice;
    protected int indice_agendamento;
    protected int indice_entidade;
    protected String nome_entidade;
    protected double valor_conta;
    protected int status_pagamento; //0 pendente - 1 pago

    public Contas(){
        this.setTableName("Contas");
    }
    public void setIndice(int indice) {
        this.indice = indice;
    }
    public void setIndiceAgendamento(int indice_agendamento) {
        this.indice_agendamento = indice_agendamento;
    }
    public void setIndiceEntidade(int indice_entidade) {
        this.indice_entidade = indice_entidade;
    }
    public void setNomeEntidade(String nome_entidade) {
        this.nome_entidade = nome_entidade;
    }
    public void setValorConta(double valor_conta) {
        this.valor_conta = valor_conta;
    }
    public void setStatusPagamento(int status_pagamento) {
        this.status_pagamento = status_pagamento;
    }


    public int getIndice() {
        return indice;
    }
    public int getIndiceAgendamento() {
        return indice_agendamento;
    }
    public int getIndiceEntidade() {
        return indice_entidade;
    }
    public String getNomeEntidade() {
        return nome_entidade;
    }
    public double getValorConta() {
        return valor_conta;
    }
    public int getStatusPagamento() {
        return status_pagamento;
    }

    public void CadastroContas(int indice, int indice_agendamento, int indice_entidade, String nome_entidade, double valor_conta,int status_pagamento) {
        try {
            setIndice(indice);
            setIndiceAgendamento(indice_agendamento);
            setIndiceEntidade(indice_entidade);
            setNomeEntidade(nome_entidade);
            setValorConta(valor_conta);
            setStatusPagamento(status_pagamento);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar contas!");
            e.printStackTrace();
            return;
        }
        System.out.println("Cadastro de contas realizado com sucesso!");
    }
    public void PrintContas(){
        System.out.println("Indice: " + indice);
        System.out.println("Cod Agendamento: " + indice_agendamento);
        System.out.println("Cod Entidade: " + indice_entidade);
        System.out.println("Nome Entidade: " + nome_entidade);
        System.out.println("Valor da Conta: " + valor_conta);
        System.out.println("Status Pagamento: " + status_pagamento);
        System.out.println("");

    }

}
                    