public class Interi{
    private int valore;
    public Interi(int valore){
        this.valore = valore;
    }
    public Interi(){
        valore = 0;
    }
    public void stampa(){
        System.out.print(valore + " ");
    }
    public void setValore(int x){
        valore = x;
    }
}