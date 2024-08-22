package projetos;

import java.util.List;

public class Ex007 {
    public static void main(String[] args) {
        List<Double> numeros = List.of(10.0, 20.0, 7.1, 15.9, 25.0);

        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }

        double media = soma / numeros.size();

        System.out.println("Números inseridos: " + numeros);
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);
    }
}