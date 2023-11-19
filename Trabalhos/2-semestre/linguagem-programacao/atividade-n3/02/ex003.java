import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double tempCelsius = scanner.nextDouble();

        double tempFahrenheit = (tempCelsius * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + tempFahrenheit);

        scanner.close();
    }
}
