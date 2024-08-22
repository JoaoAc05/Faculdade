package projetos;

public class Ex004 {

	public static void main(String[] args) {
		double nota1 = 10.0;
        double nota2 = 6.5;
        double nota3 = 5.0; 

        double media = calcularMedia(nota1, nota2, nota3);

        System.out.println("Média: " + media);

        verificarSituacao(media);
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

 
    public static void verificarSituacao(double media) {
        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno em recuperação.");
        } else {
            System.out.println("Aluno reprovado.");
        }
	}
}
