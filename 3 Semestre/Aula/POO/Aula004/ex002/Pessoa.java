import java.util.Date;

public class Pessoa {
    public String nome;
    public String cpf;
    public Date data_nascimento;

    public Pessoa(String nome, String cpf, Date data) {
        setNome(nome);
        setCpf(cpf);
        setData(data_nascimento);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setData(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public double tirarCopias(int qtd) {
        return 0.10 * (double) qtd;
    }

}
