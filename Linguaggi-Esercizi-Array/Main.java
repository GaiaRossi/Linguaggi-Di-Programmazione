public class Main{
    public static void main(String args[]){
        Orologio ora = new Orologio();

        for(int i = 0; i < 100; i++){
            ora.tic();
        }
        ora.stampaOra();
        ora.reset();
        ora.stampaOra();

    }
}