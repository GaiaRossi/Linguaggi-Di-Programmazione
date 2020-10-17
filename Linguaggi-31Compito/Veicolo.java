public class Veicolo{
    protected int codice;
    protected String targa, modello, marca;
    protected double costo;
    protected int noleggi = 0;

    //getter 
    public int getCodice(){
        return codice;
    }
    public String getTarga(){
        return targa;
    }
    public String getModello(){
        return modello;
    }
    public String getMarca(){
        return marca;
    }
    public double getCosto(){
        return costo;
    }
    public int getNoleggi(){
        return noleggi;
    }

    //setter
    public void setCodice(int codice){
        this.codice = codice;
    }
    public void setTarga(String targa){
        this.targa = targa;
    }
    public void setModello(String modello){
        this.modello = modello;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setCosto(double costo){
        this.costo = costo;
    }
    public void addNoleggio(){
        noleggi++;
    }
}