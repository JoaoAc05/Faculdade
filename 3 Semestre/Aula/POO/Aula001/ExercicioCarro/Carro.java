package ExercicioCarro;

public class Carro {
    String fabricante;
    String modelo;
    int ano;
    String placa;
    String cor;

    public static void main(String[] args) {
    //Pegar uma classe e transformar em objeto (Esta na mesma cadeia de arquivos)
    Carro celta = new Carro();

    //Pegar o objeto e colocar valor nos atributos.
    celta.ano = 2023;
    celta.cor = "Azul";
    celta.fabricante = "Lamborghini";
    celta.modelo = "Aventador";
    celta.placa = "abc1234";
    System.out.println(celta);
}
}

