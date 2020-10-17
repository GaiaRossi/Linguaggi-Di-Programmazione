import java.math.*;
public class Bicicletta extends Veicolo{
    public Bicicletta(){
        super();
        super.setAccelerazione(0);
        super.setVelocita(0);
    }
    public void pedala(int numPedalate, int secondi){
        super.setAccelerazione(numPedalate/Math.pow(secondi, 2.0));
        super.setVelocita(super.getVelocita()+super.getAccelerazione()*secondi);
    }
}