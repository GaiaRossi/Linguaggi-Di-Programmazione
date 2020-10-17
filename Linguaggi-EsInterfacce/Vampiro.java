public class Vampiro extends Mostro implements Azzannare{
    
    public void azzanna(){
        if(super.getForzaFisica() >= 2){
            super.decForzaFisica(2);
        }
        else{
            super.decForzaFisica(super.getForzaFisica());
            System.out.println("Un vampiro non ha piu forza fisica");
        }
    };
}