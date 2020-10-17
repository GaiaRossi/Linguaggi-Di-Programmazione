public class Automobile{
    protected String modello, produttore, codice;
    protected int peso;

    public void setModello(String modello){
        this.modello = modello;
    }

    public void setProduttore(String produttore){
        this.produttore = produttore;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public void setCodice(String codice){
        this.codice = codice;
    }

    public String getModello(){
        return modello;
    }
    public String getProduttore(){
        return produttore;
    }
    public int getPeso(){
        return peso;
    }
    public String getCodice(){
        return codice;
    }
}