import java.time.LocalDate;
public class Receita {
    private LocalDate data;
    private String descritivo;

    


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) throws Exception {
        LocalDate  hoje = LocalDate.now();
        if(data.isBefore(hoje)){
            throw new Exception("Ocorreu um erro. A data da receita não pode ser anterior a atual!");
        }
        else this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    void preescrever(){

    }

    void consultar(){

    }

    public Receita(){
        this.data=LocalDate.now();
        this.descritivo="";
    }

    

    public Receita(LocalDate pData, String pDescritivo) throws Exception{
        setData(pData);
        setDescritivo(pDescritivo);
    }

    void mostrar(){
        System.out.println("---RECEITA---");
        System.out.println("Data: "+getData());
        System.out.println("Descritivo: "+getDescritivo()+"\n");

    }
}
