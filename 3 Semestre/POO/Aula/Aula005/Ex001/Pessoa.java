// Polimorfismo 
// Uma boa abstração nos leva a menos polimorfismo
public class Pessoa {

    private String nome;
    private int idade;
    
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

        setNome(nome);
        setIdade(idade);
    }

    public void mostrarDados() {
    // getNome();
    // getIdade();
    System.out.println("Nome: " + getNome() + ". \nIdade: " + getIdade() + "."); 
    }
}

