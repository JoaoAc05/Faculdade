

public class Aluno extends Pessoa{

    public String curso;

    public String getCurso() {
        return curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + getNome() + ". \nIdade: " + getIdade() +".\n"+ "Curso: " + this.getCurso() + ".");
    }

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        setCurso(curso);
    }    
}
