//orario[0] = secondi
//orario[1] = minuti
//orario[2] = ore

public class Orologio{
    private Counter[] orario;
    public Orologio(){
        orario = new Counter[3];
        for(int i = 0; i < 3; i++){
            orario[i] = new Counter();
        }
    }
    public void reset(){
        orario[0].reset();
        orario[1].reset();
        orario[2].reset();
    }
    public void tic(){
        orario[0].increment();
        if(orario[0].getValue() >= 60){
            orario[0].reset();
            orario[1].increment();
            if(orario[1].getValue()>= 60){
                orario[1].reset();
                orario[2].increment();
            }
        }
    }
    public void stampaOra(){
        System.out.println("Ore: " + orario[2].getValue() + " Minuti: " + orario[1].getValue() + " Secondi: " + orario[0].getValue());
    }
}