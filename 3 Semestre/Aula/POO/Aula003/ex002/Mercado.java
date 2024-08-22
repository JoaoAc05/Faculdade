package ex002;

public class Mercado {
    String nomeProduto;
    double quantidadeProduto;
    double precoProduto;
    String formaPagamento;
    Mercado(String nomeProduto, double quantidadeProduto, double precoProduto, String formaPagamento){
        this.nomeProduto = "BrFinanças";
        this.quantidadeProduto = 3;
        this.precoProduto = 14000;
        this.formaPagamento = "PIX";
    }

    public void Compra(){
        Cliente cliente = new Cliente();

        
        cliente.nome =  "Letícia Pieper";
        System.out.println("Olá " + cliente.nome);
        System.out.println("Você está comprando "+ this.quantidadeProduto + " " + this.nomeProduto);
        System.out.println("O valor unitario é de " + this.precoProduto);
        System.out.println("O valor total é de " + (this.precoProduto * this.quantidadeProduto));
        System.out.println("Forma de pagamento selecionada foi: " + this.formaPagamento);
        
    }   

    public static void main(String[] args) {

        Mercado mercado = new Mercado("BrFinanças", 3, 14000, "PIX");
        mercado.Compra();
    }
    //Projeto feito por João Alves e André Pieper
}