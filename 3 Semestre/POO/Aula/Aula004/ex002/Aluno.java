import java.util.Date;

public class Aluno extends Pessoa {
    public String matricula;

    public Aluno(String nome, String cpf, Date data) {
        super(nome, cpf, data);
        // super utilizado para referenciar a classe pai, no caso a classe pessoa
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Polimorfismo (Sobrescreve a função da classe main)
    public double tirarCopias(int qtd) {
        return 0.30 * (double) qtd;
    }
}
