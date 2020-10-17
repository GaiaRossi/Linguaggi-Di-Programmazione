public class Automobile extends Veicolo{
    private String targa;
    private boolean avviata;

    public Automobile(String targa){
        super();
        this.targa = targa;
    }

    public void avvia(){
        avviata = true;
    }

    public void spegni(){
        avviata = false;
    }

    public void accelera(double accelerazione, int secondi){
        if(avviata){
            super.setAccelerazione(accelerazione);
            super.setVelocita(super.getVelocita()+accelerazione*secondi);
        }
        else{
            System.out.println("Macchina non avviata.");
        }
    }
}