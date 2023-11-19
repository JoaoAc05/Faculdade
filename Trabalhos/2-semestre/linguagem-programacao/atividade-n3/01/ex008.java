import java.util.Scanner;

public class JurosSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Digite a taxa de juros anual (em %): ");
        double taxaJurosAnual = scanner.nextDouble() / 100;

        System.out.print("Digite o período de tempo em anos: ");
        int tempoAnos = scanner.nextInt();

        double jurosSimples = principal * (1 + taxaJurosAnual * tempoAnos);

        System.out.println("O valor total após " + tempoAnos + " anos é: " + jurosSimples);

        scanner.close();
    }
}
