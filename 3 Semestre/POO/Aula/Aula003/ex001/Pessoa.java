public class Pessoa {
    String nome;
    int idade;
    double cpf;
    char sexo;  
    double altura;
    double peso;
    int posicao;

    void andar(){
        //Se parado (0) ou correndo (2) = começa a andar
        if (posicao == 1){
            System.out.println("Já estou andando");
          return;
        }
        posicao = 1;
        System.out.println("Começando a andar");   
    }

    void correr(){   
         //Se parado (0) ou andando (1) = começar a correr
        if (posicao == 2){
            System.out.println("Já estou correndo");
            return;
        }
        posicao = 2;
        System.out.println("Começando a correr");
    }
    void IndiceMassaCorporal(double peso, double altura){
        double imc = peso / (altura * altura); 
        System.out.println("Seu Imc é : " + imc);
    }

    void falar(){
        System.out.println("Bibibi eu sou o Hans");
    }

    void GetInfo(){
    System.out.println("Dados Cadastrados.");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Sexo: " + sexo);
    System.out.println("Altura: " + altura);
    System.out.println("Peso: " + peso);
    this.IndiceMassaCorporal(peso, altura);
    }
}
//Projeto feito por João Alves e André Pieper


