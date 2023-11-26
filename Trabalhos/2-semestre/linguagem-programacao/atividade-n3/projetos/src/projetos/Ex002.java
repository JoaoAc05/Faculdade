package projetos;

public class Ex002 {

	public static void main(String[] args) {
		double num1 = 10.0;
        double num2 = 5.0;
        
        System.out.println("Escolha a operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        int escolha = 3;

        switch (escolha) {
            case 1:
                System.out.println("Resultado da Adição: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado da Subtração: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado da Multiplicação: " + (num1 * num2));
                break;
            case 4:
                // Verificando se o divisor não é zero antes da divisão
                if (num2 != 0) {
                    System.out.println("Resultado da Divisão: " + (num1 / num2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
                
            default:
                System.out.println("Opção inválida.");
        }
	}

}
