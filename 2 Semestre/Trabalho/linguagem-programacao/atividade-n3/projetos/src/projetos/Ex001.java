package projetos;

public class Ex001 {

	public static void main(String[] args) {
		System.out.print("Insira o ano de nascimento: ");
        int anoNascimento = 2000;

        // Obtendo o ano atual
        int anoAtual = 2023;

        // Calculando a idade
        int idade = anoAtual - anoNascimento;

        System.out.println("Sua idade atual é: " + idade + " anos.");
	}

}
