import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner file = null, tastiera = new Scanner(System.in);
        ArrayList<Automobile> ordini = new ArrayList<Automobile>();
        Berlina berlina;
        Fuoristrada fuoristrada;

        try{
            file = new Scanner(new File("ordini.txt"));
        }
        catch(Exception e){
            System.out.println("Errore apertura del file.");
            System.exit(0);
        }

        while(file.hasNextLine()){
            if(file.next().equals("b")){
                berlina = new Berlina();
                berlina.setModello(file.next());
                berlina.setProduttore(file.next());
                berlina.setBagagliaio(Integer.parseInt(file.next()));
                berlina.setPeso(Integer.parseInt(file.next()));
                berlina.setCodice(file.next());
                ordini.add(berlina);
            }
            else{
                fuoristrada = new Fuoristrada();
                fuoristrada.setModello(file.next());
                fuoristrada.setProduttore(file.next());
                fuoristrada.setMarce(file.nextInt());
                fuoristrada.setPeso(file.nextInt());
                fuoristrada.setCodice(file.next());
                ordini.add(fuoristrada);
            }
        }

        System.out.println(ordini.toString());

        int range800_1000, range1000_1500, range1500_2000;
        range800_1000 = range1500_2000 = range1000_1500 = 0;

        for(int i = 0; i < ordini.size(); i++){
            if(ordini.get(i).getPeso() >= 800 && ordini.get(i).getPeso() <= 1000){
                range800_1000++;
            }
            else if(ordini.get(i).getPeso() > 1000 && ordini.get(i).getPeso() <= 1500){
                range1000_1500++;
            }
            else if(ordini.get(i).getPeso() > 1500 && ordini.get(i).getPeso() <= 2000){
                range1500_2000++;
            }
        }
        System.out.println("In range 800-1000 " + range800_1000);
        System.out.println("In range 1000-1500 " + range1000_1500);
        System.out.println("In range 1500-2000 " + range1500_2000);

        String testo = "";

        do{
            System.out.println("Inserisci un produttore: (inserisci esci per uscire)");
            testo = tastiera.nextLine();
            for(int i = 0; i < ordini.size(); i++){
                if(ordini.get(i).getProduttore().equals(testo)){
                    System.out.println(ordini.get(i).toString());
                }
            }
        }while(!testo.equals("esci"));
        
        file.close();
    }
}