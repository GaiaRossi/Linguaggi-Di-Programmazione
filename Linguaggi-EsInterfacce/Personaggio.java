public abstract class Personaggio{

    private int forzaFisica;

    public void incForzaFisica(int incremento){
        forzaFisica += incremento;
    };
    public void decForzaFisica(int decremento){
        forzaFisica -= decremento;
    };
    public int getForzaFisica(){
        return forzaFisica;
    };

    public abstract void setForzaFisica();
}
