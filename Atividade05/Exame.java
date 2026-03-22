public class Exame {
    private String data;
    private String descritivo;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescritivo()  {
        return descritivo;
    }

    public void setDescritivo(String descritivo) throws Exception{
        if(descritivo==null || descritivo.isBlank()){
            throw new Exception("Ocorreu um erro. O descritivo não pode ser vazio!");
        }
        else this.descritivo = descritivo;
    }

    void solicitar(){

    }

    void consultar(){

    }

    

    public Exame(){
        this.data ="";
        this.descritivo = null;
    }

    

    public Exame( String pData, String pDescritivo)throws Exception {
        setData(pData);
        setDescritivo(pDescritivo);
    }

    void mostrar(){
        System.out.println("---Exame---");
        System.out.println("Data: "+getData());
        System.out.println("descritivo: "+getDescritivo()+ "\n");
    }
}
