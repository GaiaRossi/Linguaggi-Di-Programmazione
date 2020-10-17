import java.util.Scanner;

public class Main{

    public static void stampaMenu(){
        System.out.println("v-versamento");
        System.out.println("p-prelievo");
        System.out.println("s-saldo");
        System.out.println("l-lista movimenti");
        System.out.println("x-uscita");
    }
    public static void main(String args[]){
        CC contoCorrente = new CC();
        String s = "";
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Java esercizio 1");

        do{
            stampaMenu();
            s = tastiera.nextLine().toString();
            switch(s){
                case "v":
                    System.out.println("Inserire l'importo da versare:");
                    contoCorrente.versamento(Integer.parseInt(tastiera.nextLine()));
                    break;
                case "p":
                    System.out.println("Inserire l'importo da prelevare:");
                    contoCorrente.prelievo(Integer.parseInt(tastiera.nextLine()));
                    break;
                case "s":
                    System.out.println("Il saldo e' " + contoCorrente.saldo());
                    break;
                case "l":
                    System.out.println("Gli ultimi 5 movimenti sono:");
                    contoCorrente.getMovimenti();
                    break;
                case "x":
                    break;
                default:
                    System.out.println("Non hai inserito un'opzione corretta.");
            }

        }while(!s.equals("x"));

        tastiera.close();
    }
}