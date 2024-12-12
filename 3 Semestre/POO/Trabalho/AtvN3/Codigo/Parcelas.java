public class Parcelas extends Contas{
    protected int indice;
    protected int indice_conta;
    protected String data_lancamento;
    protected String data_vencimento;
    protected double valor_parcela;
    protected double valor_pago;
    protected double valor_pendente;

    public Parcelas() {
        this.setTableName("Parcelas");
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    public void setIndiceConta(int indice_conta) {
        this.indice_conta = indice_conta;
    }
    public void setDataLancamento(String data_lançamento) {
        this.data_lancamento = data_lançamento;
    }
    public void setDataVencimento(String data_vencimento) {
        this.data_vencimento = data_vencimento;
    }
    public void setValorParcela(double valor_parcela) {
        this.valor_parcela = valor_parcela;
    }
    public void setValorPago(double valor_pago) {
        this.valor_pago = valor_pago;
    }
    public void setValorPendente(double valor_pendente) {
        this.valor_pendente = valor_pendente;
    }

    public int getIndice() {
        return indice;
    }
    public int getIndiceConta() {
        return indice_conta;
    }
    public String getDataLancamento() {
        return data_lancamento;
    }
    public String getDataVencimento() {
        return data_vencimento;
    }
    public double getValorParcela() {
        return valor_parcela;
    }
    public double getValorPago() {
        return valor_pago;
    }
    public double getValorPendente() {
        return valor_pendente;
    }

    public void CadastroParcela(int indice, int indice_conta, String data_lancamento, String data_vencimento, double valor_parcela, double valor_pago, double valor_pendente){
        try {
            setIndice(indice);
            setIndiceConta(indice_conta);
            setDataLancamento(data_lancamento);
            setDataVencimento(data_vencimento);
            setValorParcela(valor_parcela);
            setValorPago(valor_pago);
            setValorPendente(valor_pendente);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar parcela.");
            e.printStackTrace();
        }
        System.out.println("Parcela cadastrada com sucesso.");
    }
    public void PrintParcela(){
        System.out.println("Indice: " + indice);
        System.out.println("Indice Conta: " + indice_conta);
        System.out.println("Data Lançamento: " + data_lancamento);
        System.out.println("Data Vencimento: " + data_vencimento);
        System.out.println("Valor Parcela: " + valor_parcela);
        System.out.println("Valor Pago: " + valor_pago);
        System.out.println("Valor Pendente: " + valor_pendente);
        System.out.println("");
    }


    public void PagarParcela(double valor_pago){
        if (valor_pago > this.valor_parcela) {
            System.out.println("Valor pago é maior que o valor da parcela. Operação encerrada, refaça o pagamento.");
            return;
        }else if (valor_pago == this.valor_parcela) {
            setValorPago(valor_pago);
            setStatusPagamento(1);
            setValorPendente(0);
            System.out.println("Parcela Quitada!");
        }else {
            setValorPago(valor_pago);
            setStatusPagamento(0);
            setValorPendente(this.valor_parcela - valor_pago);
            System.out.println("Pagamento realizado. Valor pendente: "+ getValorPendente());
        }
        System.out.println("");
    }
}
