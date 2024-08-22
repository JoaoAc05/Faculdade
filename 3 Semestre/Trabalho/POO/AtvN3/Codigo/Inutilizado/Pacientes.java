// public class Pacientes extends Entidade {
//     protected String cpf;
//     protected String data_nascimento;
//     protected String endereco;
//     protected String telefone;

//     public Pacientes() {
//         this.setTableName("Pacientes");
//     }

    
//     public void setCpf(String cpf) {
//         this.cpf = cpf;
//     }
//     public void setDataNascimento(String data_nascimento) {
//             this.data_nascimento = data_nascimento;
//         }
//     public void setEndereco(String endereco) {
//         this.endereco = endereco;
//     }
//     public void setTelefone(String telefone) {
//         this.telefone = telefone;
//     }


    
//     public String getCpf() {
//         return cpf;
//     }
//     public String getDataNascimento() {
//         return data_nascimento;
//     }
//     public String getEndereco() {
//         return endereco;
//     }
//     public String getTelefone() {
//         return telefone;
//     }

//     public void CadastroPaciente(String cpf, String data_nascimento, String endereco, String telefone) {
//         try {
//             setCpf(cpf);
//             setDataNascimento(data_nascimento);
//             setEndereco(endereco);
//             setTelefone(telefone);
//         } catch (Exception e) {
//         System.out.println("Erro ao cadastrar o paciente.");
//         e.printStackTrace();
//         }
//         System.out.println("Paciente cadastrado com sucesso!");
//         System.out.println("");
//     }
//     public void PrintPaciente(){
//         System.out.println("Indice: " + indice);
//         System.out.println("Nome: " + nome);
//         System.out.println("Status: " + status);
//         System.out.println("CPF " + cpf);
//         System.out.println("Data de Nascimento " + data_nascimento);
//         System.out.println("Endereço " + endereco);
//         System.out.println("Telefone " + telefone);
//     }
// }