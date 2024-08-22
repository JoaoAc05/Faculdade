package ex004;

import java.util.Scanner;

public class Pessoa {
    String nome;    
    int idade;
    int dia;
    int mes;
    int ano;
    int anoAtual;
    int mesAtual;
    int diaAtual;
    int anoIdade;
    int mesIdade;
    int diaIdade;

    Scanner input = new Scanner(System.in);

    Pessoa(String nome, int idade, int dia, int mes, int ano){
    }

    public void calculaIdade(){
        
        System.out.println("Digite o dia atual: ");
        diaAtual = input.nextInt();
        System.out.println("Digite o número do mês atual:");
        mesAtual = input.nextInt();
        System.out.println("Digite o ano atual: ");
        this.anoAtual = input.nextInt();

        anoIdade = this.anoAtual - this.ano;
        mesIdade = this.mesAtual - this.mes;
        diaIdade = this.diaAtual - this.dia;
    }

    public void informaIdade(){
        if ((this.mesIdade) < 0) {
            this.anoIdade--;
            this.mesIdade = (12 - (this.mesIdade * (-1)));
        } 
        if (this.diaIdade < 0){
            this.mesIdade--;
            this.diaIdade = (31 - (this.diaIdade * (-1)));
        }
        System.out.println("Sua idade é: " + (this.anoIdade) + " Anos, " + (this.mesIdade) + " meses e " + (this.diaIdade) + " dias de idade.");
    }

    String informaNome(){
        return this.nome;
    }

    public void ajustaDataDeNascimento(){
        System.out.println("Qual é o seu ano de nascimento? ");
        this.ano = input.nextInt();
        System.out.println("Qual é o seu mês de nascimento? ");
        this.mes = input.nextInt();
        System.out.println("Qual é o seu dia de nascimento? ");
        this.dia = input.nextInt();
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Julia", 20, 10, 10, 2000);
        pessoa.ajustaDataDeNascimento();
        pessoa.calculaIdade();
        pessoa.informaIdade();
        pessoa.informaNome();
    }
}
//Projeto feito por João Alves e André Pieper
