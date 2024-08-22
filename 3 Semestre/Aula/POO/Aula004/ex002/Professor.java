import java.util.Date;

public class Professor extends Pessoa {
    public double salario;
    public String disciplina;

    public Professor(String nome, String cpf, Date data) {
        super(nome, cpf, data);
        // super utilizado para referenciar a classe pai, no caso a classe pessoa
    }

    public double getSalario() {
        return salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

}
