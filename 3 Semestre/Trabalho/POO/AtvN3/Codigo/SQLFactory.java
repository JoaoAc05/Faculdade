import javax.xml.crypto.Data;

public class SQLFactory {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        usuario1.CadastroUsuario(1, 0, "Medico", "1234");
        Database.inserirRegistro(usuario1);
        usuario1.PrintUsuario();

        Entidade entidade1 = new Entidade();
        entidade1.CadastroEntidade(1, "Joaquim", 0, "050.050.050-05", "15-10-2005", "Rua Rosa Pinheiro  N4001", "66 990009999", 1);
        Database.inserirRegistro(entidade1);
        entidade1.PrintEntidade();

        Entidade entidade2 = new Entidade();
        entidade2.CadastroEntidade(2, "Ricardo", 0, "123.123.123-45", "01-06-1990", "Rua das Ortencias N731", "66 91234-5678", 0);
        Database.inserirRegistro(entidade2);
        entidade2.PrintEntidade();

        Medicos medico1 = new Medicos();
        medico1.CadastroMedico(entidade2.getIndice(), "Cardiologista", "CRM123456");
        Database.inserirRegistro(medico1);
        medico1.PrintMedico();
        
        Agendamento agendamento1 = new Agendamento();
        agendamento1.CadastroAgendamento(1, "15-10-2020 10:00", usuario1.getIndice(), medico1.getIndiceMedico(), entidade1.getIndice(), 0);
        Database.inserirRegistro(agendamento1);
        agendamento1.PrintAgendamento();
        

        Contas conta1 = new Contas();
        conta1.CadastroContas(1, 1, entidade1.getIndice(), entidade1.getNome(), 50.0, 0);
        Database.inserirRegistro(conta1);
        conta1.PrintContas();

        Parcelas parcela1 = new Parcelas();
        parcela1.CadastroParcela(1, conta1.getIndice(),"20-05-2024", "20-06-2024", conta1.getValorConta(), 0.0, conta1.getValorConta() - parcela1.getValorParcela()); 
        Database.inserirRegistro(parcela1);
        parcela1.PrintParcela();



        //UPDATE
        // System.out.println("");
        // System.out.println("Update");
        // agendamento1.CadastroAgendamento(1, "15-10-2020 10:30", usuario1.getIndice(), medico1.getIndiceMedico(), entidade1.getIndice(), 0);
        // Database.atualizarRegistro(agendamento1);
        // agendamento1.PrintAgendamento();

        // usuario1.CadastroUsuario(1, 0, "Sercretaria", "1234");
        // Database.atualizarRegistro(usuario1);


        // //DELETE
        // System.out.println("");
        // System.out.println("DELETE");
        // Database.deletarRegistro(agendamento1);


        // //ABRIR ID
        // Database.abrirID(usuario1, 1);
    }
}
