import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa pessoa = new Pessoa("Letica", 28);
        Aluno aluno = new Aluno("joãzinho mil grau",13,"8 ano");

        System.out.println("Para imprimir as informações de pessoa digite [1].\nPara imprimir as informações de aluno digite [2].");
        int info = input.nextInt();
        if (info == 1) {
            pessoa.mostrarDados();
        } else if (info == 2) { 
            aluno.mostrarDados();
        } else {
            System.out.println("O valor digitado não é valido, encerrando operação!");
            return;
        }
        
    }
}
