public class Usuario extends SQLClass{
    protected int indice;
    protected int status; //0 - ativo   1 - inativo
    private String loging;
    private String senha;

    public Usuario() {
        this.setTableName("Usuario");
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public void setLoging(String loging) {
        this.loging = loging;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }


    public int getIndice() {
        return indice;
    }
    public int getStatus() {
            return status;
        }
    public String getLoging() {
        return loging;
    }
    public String getSenha() {
        return senha;
    }

    
    public void CadastroUsuario(int indice, int status, String loging, String senha) {
        try {
            setIndice(indice);
            setStatus(status);
            setLoging(loging);
            setSenha(senha);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar usuário.");
            e.printStackTrace();
        }
        System.out.println("Usuário cadastrado com sucesso!");  
    } 
    public void PrintUsuario() {
        System.out.println("Indice: " + indice);
        System.out.println("Status: " + status);
        System.out.println("Loging: " + loging);
        System.out.println("Senha: " + senha);
        System.out.println("");

    }
    

}
