import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]){
        BufferedReader file = null;

        try {
            file = new BufferedReader(new FileReader("progetti.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<Progetto> progetti = new ArrayList<Progetto>();
        ArrayList<Ricercatore> ricercatori = new ArrayList<Ricercatore>();
        String linea;
        StringTokenizer st;

        try {
            Ricerca ricerca;
            Innovazione innovazione;
            int codice;
            linea = file.readLine();
            while(linea != null){
                st = new StringTokenizer(linea);
                codice = Integer.parseInt(st.nextToken());
                if(st.nextToken().equals("ricerca")){
                    ricerca = new Ricerca();
                    ricerca.setCodice(codice);
                    linea = file.readLine();
                    ricerca.setTitolo(linea);
                    linea = file.readLine();
                    ricerca.setCoordinatore(linea);
                    linea = file.readLine();
                    ricerca.setOrg(linea);
                    linea = file.readLine();
                    st = new StringTokenizer(linea);
                    ricerca.setCodiceArg(st.nextToken());
                    ricerca.setPartner(Integer.parseInt(st.nextToken()));
                    linea = file.readLine();
                    ricerca.setEuro(Double.parseDouble(linea));
                    progetti.add(ricerca);
                }
                else{
                    innovazione = new Innovazione();
                    innovazione.setCodice(codice);
                    linea = file.readLine();
                    innovazione.setTitolo(linea);
                    linea = file.readLine();
                    innovazione.setCoordinatore(linea);
                    linea = file.readLine();
                    innovazione.setOrg(linea);
                    linea = file.readLine();
                    st = new StringTokenizer(linea);
                    innovazione.setAziende(Integer.parseInt(st.nextToken()));
                    innovazione.setEuro(Double.parseDouble(st.nextToken()));
                    progetti.add(innovazione);
                }
                linea = file.readLine();
            }
            
            for(Progetto p : progetti){
                System.out.println(p.toString());
            }

            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            file = new BufferedReader(new FileReader("ricercatori.txt"));
            Ricercatore ricercatore;

            linea = file.readLine();
            while(linea != null){
                ricercatore = new Ricercatore();
                ricercatore.setNome(linea);
                linea = file.readLine();
                ricercatore.setCognome(linea);
                linea = file.readLine();
                while(linea != null && !linea.equals("")){
                    st = new StringTokenizer(linea);
                    ricercatore.addProgetto(Integer.parseInt(st.nextToken()), Double.parseDouble(st.nextToken()));
                    linea = file.readLine();
                }
                ricercatore.trovaImpegnoMax(progetti);
                ricercatori.add(ricercatore);
                linea = file.readLine();
            }

            for(Ricercatore r : ricercatori){
                System.out.print(r.toString());
                r.stampaProgetti();
                System.out.println();
            }

            file.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        BufferedReader tastiera = null;

        try {
            tastiera = new BufferedReader(new InputStreamReader(System.in));
        } catch (Exception e) {
            e.printStackTrace();
        }

        String cognome = args[0];
        //System.out.println("Inserisci un cognome: ");
        try{
            //cognome = tastiera.readLine();
        }catch(Exception e){
            e.printStackTrace();
        }
        for(Ricercatore r : ricercatori){
            if(cognome.equals(r.getCognome())){
                System.out.println(r.getNome() + " " + r.getCognome() + " " + r.getMaxImpegno());
            }
        }
        
        try {
            tastiera.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}