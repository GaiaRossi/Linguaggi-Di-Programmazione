public class Fuoristrada extends Automobile{
    private int marce;

    public void setMarce(int marce){
        this.marce = marce;
    }
    public int getMarce(){
        return marce;
    }
    public String toString(){
        return codice + " " + produttore + " " + modello + " - " + marce + "\n"; 
    }
}