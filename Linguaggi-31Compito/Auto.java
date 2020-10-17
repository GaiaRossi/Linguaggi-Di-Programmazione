public class Auto extends Veicolo{
    private double capBag;
    private int cilindrata;
    private String categoria;

    //getter
    public double getCapienza(){
        return capBag;
    }
    public int getCilindrata(){
        return cilindrata;
    }
    public String getCategoria(){
        return categoria;
    }

    //setter
    public void setCapBag(double capBag){
        this.capBag = capBag;
    }
    public void setCilindrata(int cilindrata){
        this.cilindrata = cilindrata;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }


    //toString
    public String toString(){
        return "Automobile\t" + this.targa + "\t" + this.codice + "\t" + this.modello + "\t" + 
                this.marca + "\t\t" + this.costo + "\t" + capBag + "\t" + cilindrata + "\t" + categoria + "\t-\t\t-\t-\t\n"; 
    }
}