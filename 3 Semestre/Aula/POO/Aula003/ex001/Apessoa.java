public class Apessoa {
    public static void main(String[] args) {
        Pessoa meuPessoa = new Pessoa();
        meuPessoa.nome = "Hans";
        meuPessoa.idade = 20;
        meuPessoa.cpf = 123456789;
        meuPessoa.sexo = 'M';
        meuPessoa.altura = 1.65;
        meuPessoa.peso = 70;
        meuPessoa.posicao = 1;
    
        meuPessoa.andar();
        meuPessoa.correr();
        meuPessoa.GetInfo();
    }
}
//Projeto feito por João Alves e André Pieper