import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private LocalDate data;
    private LocalTime hora;
    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;
    private List<Receita> receitas = new ArrayList<>();
    private List<Exame> exames = new ArrayList<>();

    

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) throws Exception {
        LocalTime hoje = LocalTime.now();
        if(hora.isBefore(hoje)){
            throw new Exception("Ocorreu um erro. A hora da consulta não pode ser anterior a atual!");
        }
        else this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

     public List<Receita> getReceitas() {
        return receitas;
    }

    public List<Exame> getExames() {
        return exames;
    }

    void marcar (){

    }

    void cancelar(){

    }

    void consultar(){

    }

    void realizar(){

    }

    void atualizar(){

    }

    public Consulta(){
    this.data=LocalDate.now();
    this.hora=LocalTime.now();
    this.medico=null;
    this.paciente=null;
    this.motivo="";
    this.historico="";
   }

   public Consulta(LocalTime hora, LocalDate data, Medico medico, Paciente paciente, String motivo, String historico, List<Receita> r, List<Exame> e){
        this.hora = hora;
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
        this.motivo = motivo;
        this.historico = historico;
        this.receitas = r;
        this.exames = e;
    }

    public void realizarConsulta(Agenda agenda) throws Exception{
        this.setData(agenda.getData());
        this.setHora(LocalTime.parse(agenda.getHora()));
        this.setMedico(agenda.getMedico());
        this.setPaciente(agenda.getPaciente());
        this.setMotivo("Dor abdominal");
        this.setHistorico("apresenta dores na região do estomago, possivel gastrite");
        var e1 = new Exame("01/04/2026", "Exame de sangue");
        this.getExames().add(e1);
        this.getExames().add(new Exame("01/04/2026", "Endoscopia"));
        this.getReceitas().add(new Receita(LocalDate.now(), "Buscopan"));
        this.mostrar();
    }

    void mostrar(){
        System.out.println("----Consulta---");
        System.out.println("Data: "+getData());
        System.out.println("Hora: "+getHora());
        System.out.println("Medico: "+getMedico());
        System.out.println("Paciente: "+getPaciente());
        System.out.println("Motivo: "+getMotivo());
        System.out.println("Histórico: "+getHistorico()+"\n");
        for(var obj : exames){
            obj.mostrar();
        }
        for(var obj: receitas){
            obj.mostrar();
        }
    }


}

