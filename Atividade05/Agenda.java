import java.time.LocalDate;
public class Agenda {
    private LocalDate data;
    private String hora;
    private Medico medico;
    private Paciente paciente;

    

    public LocalDate getData(){
        return data;
    }

    public void setData(LocalDate data) throws Exception{
        LocalDate hoje = LocalDate.now();
        if(data.isBefore(hoje)){
            throw new Exception("Ocurreu um erro. A data da agenda não pode ser anterior a data atual!");
        }
        else {
            this.data = data;
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
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

    public Agenda(){
    this.data= LocalDate.now();
    this.hora="";
    this.medico=null;
    this.paciente=null;
   }

   public Agenda(LocalDate pData,String pHora,Medico pMedico,Paciente pPaciente) throws Exception{
    setData(pData);
    setHora(pHora);
    setMedico(pMedico);
    setPaciente(pPaciente);
   }

    void mostrar(){
        System.out.println("----Agenda---");
        System.out.println("Data: "+getData()+"\nHora: "+getHora()+"\nMedico: "+getMedico()+"\nPaciente: "+getPaciente()+"\n");
    }

    void consultar(){
    }
}
