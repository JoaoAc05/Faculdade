public class Carro {
    private String cor;
    private double preco;
    private String modelo;

    public String getCor() {
        return cor;
    }

    public Double getPreco() {
        return preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Carro(String cor, double preco, String modelo) {
        setCor("Azul");
        setPreco(preco);
        setModelo(modelo);
    }

}

// João Alves - Aula de construtor em Java