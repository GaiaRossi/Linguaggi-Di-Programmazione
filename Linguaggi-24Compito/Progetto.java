public class Progetto{
    protected int codice;
    protected String titolo, coordinatore, org;

    //setter
    public void setCodice(int codice){
        this.codice = codice;
    }
    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    public void setCoordinatore(String coordinatore){
        this.coordinatore = coordinatore;
    }
    public void setOrg(String org){
        this.org = org;
    }

    //getter
    public int getCodice(){
        return codice;
    }
    public String getNome(){
        return titolo;
    }
}