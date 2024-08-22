package projetos;

public class Ex003 {

	public static void main(String[] args) {
		int numero = 7;

        if (verificarParImpar(numero)) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }
    }

    public static boolean verificarParImpar(int numero) {
        return numero % 2 == 0;
	}

}
