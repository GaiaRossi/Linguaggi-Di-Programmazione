public class Ricerca extends Progetto{
    private String codiceArg;
    private int partner;
    private double euro;

    //setter
    public void setCodiceArg(String codiceArg){
        this.codiceArg = codiceArg;
    }
    public void setPartner(int partner){
        this.partner = partner;
    }
    public void setEuro(double euro){
        this.euro = euro;
    }

    //toString
    public String toString(){
        return "Ricerca\t" + this.titolo + "\t" + this.codice + "\t" + this.org + "\t" + 
                codiceArg + "\t" + partner + "\t-\t" + euro + "\n"; 
    }
}