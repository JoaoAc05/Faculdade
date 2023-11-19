import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exemplo de chamada para cada exercício
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();

        scanner.close();
    }

    private static void exercicio1() {
        System.out.println("Exercício 1: Soma de dois números");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double soma = num1 + num2;

        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }

    private static void exercicio2() {
        System.out.println("Exercício 2: Média de três números");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println("A média dos números é: " + media);

        scanner.close();
    }

    private static void exercicio3() {
        System.out.println("Exercício 3: Conversão Celsius para Fahrenheit");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double tempCelsius = scanner.nextDouble();

        double tempFahrenheit = (tempCelsius * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + tempFahrenheit);

        scanner.close();
    }

    private static void exercicio4() {
        System.out.println("Exercício 4: Contar vogais em uma string");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        int vogais = contarVogais(input);

        System.out.println("O número de vogais na string é: " + vogais);

        scanner.close();
    }

    private static int contarVogais(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    private static void exercicio5() {
        System.out.println("Exercício 5: Imprimir tabuada de um número");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para exibir a tabuada: ");
        int numero = scanner.nextInt();

        imprimirTabuada(numero);

        scanner.close();
    }

    private static void imprimirTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
