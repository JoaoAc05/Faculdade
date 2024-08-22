import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Aluno joao = new Aluno("João Alves", "050.123.321-01", new Date());
        System.out.println("Veja como os atributos foram preenchudos\n\nNome: " + joao.nome);
        System.out.println("CPF: " + joao.cpf);
        System.out.println("Data de nascimento: " + joao.data_nascimento.toString());

        Professor letica = new Professor("Letica Pieper", "999.555.111", new Date());
        System.out.println("Veja como os atributos foram preenchudos\n\nNome: " + letica.nome);
        System.out.println("CPF: " + letica.cpf);
        System.out.println("Data de nascimento: " + letica.data_nascimento.toString());

        System.out.println(joao.tirarCopias(10));
    }
}
