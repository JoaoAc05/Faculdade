package SqlFactory;

public class SQLFactory {
    public static void main(String[] args) {
        
        Produto produto1 = new Produto();
        // Database.abrirID(produto1, 1);
        // System.out.println(produto1.descricao);

        produto1.Cadastro(8, "Farinha de Trigo", "TON", 550);
        Database.deletarRegistro(produto1);

        Database.abrirID(produto1, 8);
        System.out.println(produto1.descricao);
    }
    
}