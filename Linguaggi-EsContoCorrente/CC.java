import java.util.Vector;

public class CC{
    private int contoCorrente;
    private Vector<String> movimenti = new Vector<String>();
    public CC(){
        contoCorrente = 0;
        movimenti.removeAllElements();
    }

    public void versamento(int soldi){
        contoCorrente += soldi;
        movimenti.add("Versamento di " + soldi);
    }

    public void prelievo(int soldi){
        if(contoCorrente - soldi >= 0){
            contoCorrente -= soldi;
            movimenti.add("Prelievo di " + soldi);
        }
        else{
            System.out.println("Non e' piu' possibile prelevare soldi.");
        }
    }

    public int saldo(){
        return contoCorrente;
    }

    public void getMovimenti(){
        int dimensione;
        if(movimenti.size() > 5){
            dimensione = 5;
        }
        else{
            dimensione = movimenti.size();
        }
        for(int i = dimensione; i > 0; i--){
            System.out.println(movimenti.elementAt(movimenti.size() - i));
        }
    }
}