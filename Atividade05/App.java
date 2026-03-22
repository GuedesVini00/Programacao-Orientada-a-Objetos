import java.time.LocalDate;
import java.time.LocalTime;
public class App {
    public static void  main(String[] args) {

        int x = 1;
        var p1 = new Paciente();
        try{
            
            p1.setCodigo(x++);
            p1.setNome ("Menphid Depay");
            p1.setCpf ("428541088-50");
            p1.setTelefone ("1197293-1385");
            p1.setGenero ("Masculino");
            p1.setIdade (19);
            p1.mostrar();

            var p2 = new Paciente(x++, "Breno Bidon", "1234", "1234","Masculino",18);
            p2.mostrar();
        }
        catch(Exception e){
            System.out.println("Ocorreu um erro. "+e.getMessage());
        }

        var m1 = new Medico();
        try{
            m1.setNome("Dr. Yuri Alberto");
            m1.setCrm ("1234567sp");
            m1.setTelefone ("(11) 97777-6666");
            m1.setEspecialidade ("Cardiologia");
            m1.setSenha ("senha123");
            m1.mostrar();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        var agenda1 = new Agenda();
        try{
            agenda1.setData(LocalDate.now()) ;
            agenda1.setHora("19:11");
            agenda1.setMedico(m1) ;
            agenda1.setPaciente(p1) ;
            agenda1.mostrar();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        

        var consulta1 = new Consulta();
        try{
            consulta1.setData(LocalDate.now());
            consulta1.setHora(LocalTime.now());
            consulta1.setMedico(m1);
            consulta1.setPaciente(p1);
            consulta1.setMotivo("Dor de cabeça");
            consulta1.setHistorico("Sem problemas recorrentes");
            consulta1.mostrar();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
       

        var exame1 = new Exame();
        try {
            exame1.setData("22/02/2026");
            exame1.setDescritivo("Qualquer coisa") ;
            exame1.mostrar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

        var receita1 = new Receita();

        try {
            receita1.setData(LocalDate.now());
            receita1.setDescritivo("Foi receitado paracetamol para o paciente"); 
            receita1.mostrar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       

        var Maria = new Recepcionista();
        try {
            Maria.setNome("Maria Flor");
            Maria.setCpf("28738273849");
            Maria.setTelefone("11 1293213123");
            Maria.setSenha("senha123");
            Maria.mostrar();
        }
     
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

            try {
        var maria = new Recepcionista();
        var joao = new Medico();
        var paciente = new Paciente();

        // cria agenda corretamente (sem null e com parâmetros certos)
        var agenda20260401 = maria.marcarAgenda(paciente, joao, "14:40", LocalDate.now());

        // cria consulta e realiza a partir da agenda
        var consulta = new Consulta();
        consulta.realizarConsulta(agenda20260401);

        } catch(Exception e){
            System.out.println("Ocorreu um erro " + e.getMessage());    
        }
    }   
}
