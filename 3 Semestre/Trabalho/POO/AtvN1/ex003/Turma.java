package AtvN1.ex003;

public class Turma {
    public static void main(String[] args) {
        Alunos aluno = new Alunos();

        aluno.nome = "João";
        aluno.cpf = "123.456.789-00";
        aluno.idade = 14;
        aluno.turma = "1º ano A";
        aluno.curso = "ADS";
        aluno.matricula = 216456;

        System.out.println("Lista de Dados - Aluno 1");
        System.out.println("Nome: " + aluno.nome);
        System.out.println("CPF: " + aluno.cpf);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("Turma: " + aluno.turma);
        System.out.println("Curso: " + aluno.curso);
        System.out.println("Matricula: " + aluno.matricula);
    }
}
