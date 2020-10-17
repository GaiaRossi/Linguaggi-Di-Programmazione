public class Conversione{
    public static void converti(String n) throws IllegalArgumentException{
        IllegalArgumentException e = new IllegalArgumentException("Valore fuori dall'intervallo.\n");

        if(Integer.parseInt(n) < -10 || Integer.parseInt(n) > 10){
            throw e;
        }
        else{
            System.out.println(Integer.parseInt(n));
        }

    }
}