package Ex002;

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangulo triangulo = new Triangulo("Azul", 5, 7); //17.5
        Circulo circulo = new Circulo("Amarelo", 3); // 28
        Quadrado quadrado = new Quadrado("Rosa", 5); //25
        Retangulo retangulo = new Retangulo("Cinza", 3, 5); // 15

        System.out.println("Para impressão da area de um triangulo digite [1]");
        System.out.println("Para impressão da area de um circulo digite [2]");
        System.out.println("Para impressão da area de um quadrado digite [3]");
        System.out.println("Para impressão da area de um retangulo digite [4]");

        int impressao = input.nextInt();

        if (impressao > 4 || impressao < 1) {
            System.out.println("Valor informado não é valido, encerrando processo.");
        } else if (impressao == 1) {
            System.err.println(triangulo.getArea());
        } else if (impressao == 2) {
            System.err.println(circulo.getArea());
        } else if (impressao == 3) {
            System.err.println(quadrado.getArea());
        } else if (impressao == 4) {
            System.err.println(retangulo.getArea());
        }
    }
}
