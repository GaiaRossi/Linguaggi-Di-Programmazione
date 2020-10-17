public class Pallamano extends Squadra{
    private int nParVinte, nParPerse;
    private double mediaReti;

    //getter
    public int getParVinte(){
        return nParVinte;
    }
    public int getParPerse(){
        return nParPerse;
    }
    public double getMediaReti(){
        return mediaReti;
    }

    //setter
    public void setParVinte(int nParVinte){
        this.nParVinte = nParVinte;
    }
    public void setParPerse(int nParPerse){
        this.nParPerse = nParPerse;
    }
    public void setMediaReti(double mediaReti){
        this.mediaReti = mediaReti;
    }

    //toString
    public String toString(){
        return this.nome + "\t" + this.codice + "\t" + nParVinte + "\t" + nParPerse + "\t-\t-\t" + mediaReti + "\tPallamano\n";
    }
}