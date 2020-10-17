public class Squadra{
    protected int codice;
    protected String nome;
    private int nGiocatori = 0;

    //getter
    public int getCodice(){
        return codice;
    }
    public String getNome(){
        return nome;
    }
    public int getNGiocatori(){
        return nGiocatori;
    }

    //setter
    public void setCodice(int codice){
        this.codice = codice;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void addGiocatore(){
        nGiocatori++;
    }
}