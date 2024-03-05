package AtvN1.ex001;
    //Levando em consideração a analogia do carro para a classe:
public class Carro {
    //O que eu sei?
    //Os atributos, ou seja, as variaveis que você informa os valores.
    String fabricante;
    String modelo;
    int anoFabricacao;
    String placa;
    boolean ligado;

    //O que eu posso fazer?
    //Os métodos, ou seja, as funções que você executa.
    void ligar() {
        if (ligado) {
            return;
        }
        System.out.println("Carro ligado");
        ligado = true;
    }
    void desligar() {
        if (!ligado) {
            return;
        }
        System.out.println("Carro desligado");
        ligado = false;
    }
    public void informacoes() {
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + anoFabricacao);
        System.out.println("Placa: " + placa);
    }

    public static void main(String[] args) {
        Carro fusca = new Carro();

        fusca.fabricante = "Volks";
        fusca.modelo = "Baratinha";
        fusca.anoFabricacao = 1935;
        fusca.placa = "fusca01";
        fusca.ligado = true;

        fusca.desligar();
        fusca.informacoes();
    }
    //A parte do quem você conheceu eu não consegui fazer nenhuma analogia
}
