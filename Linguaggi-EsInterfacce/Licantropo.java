public class Licantropo extends Personaggio implements Combattimento, Azzannare{
    
    private boolean lunaPiena = false;
    
    public void setLuna(boolean lunaPiena){
        this.lunaPiena = lunaPiena;
    }
    public boolean getLuna(){
        return lunaPiena;
    }

    public void setForzaFisica(){
        if(lunaPiena){
            super.incForzaFisica(15);
        }
        else{
            super.incForzaFisica(10);
        }
    }

    public void combatti(){
        if(super.getForzaFisica() >= 3){
            super.decForzaFisica(3);
        }
        else{
            super.decForzaFisica(super.getForzaFisica());
            System.out.println("Un licantropo non ha piu forza fisica");
        }
    } 
    public void azzanna(){
        if(super.getForzaFisica() >= 2){
            super.decForzaFisica(2);
        }
        else{
            super.decForzaFisica(super.getForzaFisica());
            System.out.println("Un licantropo non ha piu forza fisica");
        }
    };
}