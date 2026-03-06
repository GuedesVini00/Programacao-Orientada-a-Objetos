public class App {
    public static void  main(String[] args) {
        var p1 = new Paciente();
        p1.nome = "Vinicius Guedes";
        p1.cpf = "428541088-50";
        p1.telefone = "1197293-1385";
        p1.genero = "Masculino";
        p1.idade = 19;
        p1.mostrar();

        var m1 = new Medico();
        m1.nome = "Dr. Yuri Alberto";
        m1.crm = "12345-SP";
        m1.telefone = "(11) 97777-6666";
        m1.especialidade = "Cardiologia";
        m1.senha = "senha123";
        m1.mostrar();
    

     Agenda agenda1 = new Agenda();
        agenda1.data = "22/02/2026";
        agenda1.hora = "19:11";
        agenda1.medico = m1.nome;
        agenda1.paciente = p1.nome;
        agenda1.mostrar();

      Consulta consulta1 = new Consulta();
        consulta1.data = "22/02/2026";
        consulta1.hora = "19:11";
        consulta1.medico = m1.nome;
        consulta1.paciente = p1.nome;
        consulta1.motivo = "Dor de cabeça";
        consulta1.historico = "Sem problemas recorrentes";
        consulta1.mostrar();

      Exame exame1 = new Exame();
        exame1.data = "22/02/2026";
        exame1.consulta = "Primeira consulta";
        exame1.descritivo = "Foi receitado remédio para o paciente";
        exame1.mostrar();

       Receita receita1 = new Receita();
        receita1.data = "22/02/2026";
        receita1.consulta = "Primeira consulta";
        receita1.descritivo = "Foi receitado remédio para o paciente";
        receita1.mostrar();

      Recepcionista ana = new Recepcionista();
        ana.nome = "Maria Flor";
        ana.cpf = "2873827363849237";
        ana.telefone = "11 1293213123";
        ana.senha = "senha123";
        ana.mostrar();
   }
}
