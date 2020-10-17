public class VeicoloMain{
    public static void main(String args[]){
        Automobile a = new Automobile("targa");
        Bicicletta b = new Bicicletta();

        a.avvia();
        a.accelera(200, 10);
        b.pedala(100, 20);
        Veicolo.printVelocita(a);
        Veicolo.printVelocita(b);
    }
}