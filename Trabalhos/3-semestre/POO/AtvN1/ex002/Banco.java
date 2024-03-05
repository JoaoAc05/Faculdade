package AtvN1.ex002;
import java.util.Scanner;

public class Banco {
    //Informações necessarias para o banco
    String nome;
    String cpf;
    int idade;

    String conta;
    String agencia;
    double saldoConta;
    double valorMovi;

    Scanner input = new Scanner(System.in);
    
    public void cadastroCliente() {
        System.out.println("Seja bem Vindo, digite o seu nome por gentileza.");
        nome = input.next();
        System.out.println("Digite a sua idade");
        idade = input.nextInt();
        if (idade < 18) {
            System.out.println("Você é menor de idade, ainda não pode abrir a sua conta.");
            System.exit(0);
        }
        System.out.println("Por favor digite o seu CPF formatado.");
        cpf = input.next();
        System.out.println("Seja Bem Vindo " + nome + ", Vamos abrir uma conta para você! Aguarde.");
        System.out.println("Loading....");
        conta = "101897-4";
        System.out.println("Loading..");
        agencia = "832";
        System.out.println("Loading.");
        System.out.println("Sua conta é " + conta + ", e sua agência é " + agencia + " qual será o seu doposito inicial?");
        saldoConta = input.nextDouble();
        if (saldoConta <= 299){
            while (saldoConta <= 299){
                System.out.println("O valor deve ser maior que R$299,00. Por favor digite o valor do deposito novamente");
                saldoConta = input.nextDouble();
            }
        }
        System.out.println("Deposito realisado com sucesso. Seu saldo atual agora é: " + saldoConta);
        System.out.println("Cadastro da Conta finalizado!");
        System.out.println("");

    }

    public void transferencia(){
        double transf;
        System.out.println("- - - - - Iniciando Transferência  - - - - -");
        System.out.println("Por favor digite o valor para a tranferência");
        transf = input.nextDouble();
        while (transf-1 >= saldoConta){
            System.out.println("O valor deve ser menor que o seu saldo, por favor digite o valor novamente");
            transf = input.nextDouble();
        }
        saldoConta -= transf;
        System.out.println("Seu saldo atual é: " + saldoConta);
    }
    public void deposito(){
        double deposito;
        System.out.println("- - - - - Iniciando Deposito  - - - - -");
        System.out.println("Por favor digite o valor para o deposito");
        deposito = input.nextDouble();
        saldoConta += deposito;
        System.out.println("Seu saldo atual é: " + saldoConta);
    }
    public void saque(){
        double saque;
        System.out.println("- - - - - Iniciando Saque  - - - - -");
        System.out.println("Por favor digite o valor para o saque");
        saque = input.nextDouble();
        while (saque-1 >= saldoConta) {
            System.out.println("O valor deve ser menor que o seu saldo, por favor digite o valor novamente");
            saque = input.nextDouble();
        }
        saldoConta -= saque;
        System.out.println("Seu saldo atual é: " + saldoConta);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Banco banco = new Banco();
        
        System.out.println("| Já é um cliente?        [1] |");
        System.out.println("| Ainda não é um cliente? [2] |");
        int cliente = input.nextInt();
        if (cliente == 2) {
            banco.cadastroCliente();
        } else if (cliente == 1){
            banco.saldoConta = 300;
            System.err.println("O seu saldo disponível é " + banco.saldoConta);
        }else {
            System.out.println("Valor inserido é invalido, por gentileza informe um valor correto.");
            cliente = input.nextInt();
            if (cliente == 2) {
                banco.cadastroCliente();
            }
        }
        int movimenta = 1;

        System.out.println("Deseja fazer alguma movimentação?");
        while (movimenta == 1) {
        System.out.println("|  Deposito       [1]  |");
        System.out.println("|  Saque          [2]  |");
        System.out.println("|  Transferência  [3]  |");
        System.out.println("|  Sair           [4]  |");
        int operacao = input.nextInt();
        
            switch (operacao) {
                case 1:
                    banco.deposito();
                    break;
                case 2:
                    banco.saque();
                    break;
                case 3:
                    banco.transferencia();
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Operação Invalida");
                    break;
            }
            System.out.println("Deseja realizar outra operação? [1]");
            System.out.println("Sair [2]");
            movimenta = input.nextInt();
            if (movimenta != 1) {
                System.out.println("Trabalho - João Alves 3º Semestre");
                break;
            }
        }
    }
}
