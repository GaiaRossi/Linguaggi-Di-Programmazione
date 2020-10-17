public class Berlina extends Automobile{
    private int bagagliaio;

    public void setBagagliaio(int bagagliaio){
        this.bagagliaio = bagagliaio;
    }
    public int getBagagliaio(){
        return bagagliaio;
    }

    public String toString(){       
        return codice + " " + produttore + " " + modello + " "  + bagagliaio + " - \n";
    }
}