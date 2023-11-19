import java.util.Scanner;

public class CalcularIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Obtendo o ano atual
        int anoAtual = java.time.Year.now().getValue();

        // Calculando a idade
        int idade = anoAtual - anoNascimento;

        System.out.println("Sua idade atual é: " + idade + " anos.");

        scanner.close();
    }
}