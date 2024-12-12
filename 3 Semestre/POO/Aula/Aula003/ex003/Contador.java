package ex003;

import java.util.Scanner;

public class Contador {
    Scanner input = new Scanner(System.in);

    int contador = 25;

    void reset() {
        contador = 0;
    }

    void incrementar() {
        contador++;
    }
    
    void decrementar() {
        contador--;
    }

    int getContador() {
        return contador;
    }
    void usuarioAdiconar() {
        System.out.println("Quanto você quer adicionar ao contador?");
        
        int valor = input.nextInt();
        for (int i = 0; i < valor; i++) {
            incrementar();
            System.out.println(getContador());
        }
    }
    void usuarioRetirar() {
        System.out.println("Quanto você quer reduzir ao contador?");
        
        int valor = input.nextInt();
        for (int i = 0; i < valor; i++) {
            decrementar();
            System.out.println(getContador());
        }
    }    

    public static void main(String[] args) {
        Contador contador = new Contador();
        contador.incrementar();
        System.out.println(contador.getContador());
        contador.reset();
        System.err.println(contador.getContador());
        contador.usuarioAdiconar();
        contador.usuarioRetirar();
    }
}
//Projeto feito por João Alves e André Pieper