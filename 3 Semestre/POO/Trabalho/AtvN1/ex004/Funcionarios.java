package AtvN1.ex004;

public class Funcionarios {
    String nome;
    String cargo;
    double salarioBruto;
    double salarioLiquido;
    double beneficio;
    double impostos;
    

    public void calculaSalario(){
        salarioLiquido = (salarioBruto - ((salarioBruto /100) * impostos)) + beneficio;
        System.out.println(nome + " o seu salario liquido é: " + salarioLiquido);
    }

    public void informacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Beneficio: " + beneficio);
    }

    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();

        funcionario.nome = "Joao";
        funcionario.cargo = "Programador";
        funcionario.salarioBruto = 7000.00;
        funcionario.beneficio = 200.00;
        funcionario.impostos = 9;

        funcionario.calculaSalario();
        funcionario.informacoes();
    }
}
