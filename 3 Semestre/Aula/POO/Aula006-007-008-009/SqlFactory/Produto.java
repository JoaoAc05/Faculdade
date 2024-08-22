package SqlFactory;

public class Produto extends SQLClass{

    @Key
    int id;

    String descricao;
    String um;
    double preco;

    Produto(){
        this.setTableName("PRODUTOS");
    }

    public void printObject(){
        System.out.println(
            this.id + ", " +
            this.descricao + ", " +
            this.preco + ", " +
            this.um
        );
    }

    public int getId() {
        return id;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getUm() {
        return um;
    }
    public double getPreco() {
        return preco;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setUm(String um) {
        this.um = um;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }


    public void Cadastro(Integer id, String desc, String um, double preco){
        setId(id);
        setDescricao(desc);
        setPreco(preco);
        setUm(um);
    }

    // public void printObject(){
    //     System.out.println(
    //     );
    // }
    
}