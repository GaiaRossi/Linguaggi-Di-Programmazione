public class Veicolo{
    private double velocita, accelerazione;

    public Veicolo(){
        velocita = 0;
        accelerazione = 0;
    }

    public Veicolo(double velocita, double accelerazione){
        this.velocita = velocita;
        this.accelerazione = accelerazione;
    }

    public double getVelocita(){
        return velocita;
    }

    public double getAccelerazione(){
        return accelerazione;
    }

    public void setVelocita(double velocita){
        this.velocita = velocita;
    }

    public void setAccelerazione(double accelerazione){
        this.accelerazione = accelerazione;
    }

    static public void printVelocita(Veicolo v){
        System.out.println(v.getVelocita());
    }
}