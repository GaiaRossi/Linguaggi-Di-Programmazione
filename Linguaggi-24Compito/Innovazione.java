public class Innovazione extends Progetto{
    private int nAziende;
    private double euro;

    //setter
    public void setAziende(int nAziende){
        this.nAziende = nAziende;
    }
    public void setEuro(double euro){
        this.euro = euro;
    }

    //toString
    public String toString(){
        return "Innovazione\t" + this.titolo + "\t" + this.codice + "\t" + this.org + "\t-\t-\t" +
                nAziende + "\t" + euro + "\n";
    }
}