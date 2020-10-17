public class Furgone extends Veicolo{
    private boolean rimorchio, vano;
    private int numeroPosti;

    //getter
    public boolean hasRimorchio(){
        return rimorchio;
    }
    public boolean hasVano(){
        return vano;
    }
    public int getNumeroPosti(){
        return numeroPosti;
    }

    //setter
    public void setRimorchio(boolean rimorchio){
        this.rimorchio = rimorchio;
    }
    public void setNumeroPosti(int numeroPosti){
        this.numeroPosti = numeroPosti;
    }
    public void setVano(boolean vano){
        this.vano = vano;
    }

    //toString
    public String toString(){
        return "Furgone\t\t" + this.targa + "\t" + this.codice + "\t" + this.modello + "\t" + this.marca +
                "\t\t" + this.costo + "\t-\t-\t" + rimorchio + "\t" + numeroPosti + "\t" + vano + "\n";             
    }
}