package projetos;

public class Ex008 {

	public static void main(String[] args) {
		double valor = 1000.0;
        double taxaDeJurosAnual = 5.0;
        int periodoAnos = 3;

        double jurosSimples = valor * taxaDeJurosAnual / 100 * periodoAnos;
        double montanteTotal = valor + jurosSimples;

        System.out.println("Valor Principal: R$" + valor);
        System.out.println("Taxa de Juros Anual: " + taxaDeJurosAnual + "%");
        System.out.println("Período: " + periodoAnos + " anos");
        System.out.println("Juros Simples: R$" + jurosSimples);
        System.out.println("Montante Total: R$" + montanteTotal);
	}

}
