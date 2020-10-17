public class Eroe extends Umano implements Combattimento{

    public void combatti(){
        if(super.getForzaFisica() >= 3){
            super.decForzaFisica(3);
        }
        else{
            super.decForzaFisica(super.getForzaFisica());
            System.out.println("Un eroe non ha piu forza fisica");
        }
    }

}