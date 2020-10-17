public class Pallacanestro extends Squadra{
    private int nParVinte, nParPerse, puntiTot;
    private double mediaFalli;

    //getter
    public int getParVinte(){
        return nParVinte;
    }
    public int getParPerse(){
        return nParPerse;
    }
    public int getPuntiTot(){
        return puntiTot;
    }
    public double getMediaFalli(){
        return mediaFalli;
    }

    //setter
    public void setParVinte(int nParVinte){
        this.nParVinte = nParVinte;
    }
    public void setParPerse(int nParPerse){
        this.nParPerse = nParPerse;
    }
    public void setPuntiTot(int puntiTot){
        this.puntiTot = puntiTot;
    }
    public void setMediaFalli(double mediaFalli){
        this.mediaFalli = mediaFalli;
    }

    //toString
    public String toString(){
        return this.nome + "\t" + this.codice + "\t" + nParVinte + "\t" + nParPerse + "\t"
                + puntiTot + "\t" + mediaFalli + "\t-\tPallacanestro\n"; 
    }

}