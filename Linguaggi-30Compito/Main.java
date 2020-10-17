import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]){
        BufferedReader fileSquadre = null, fileGiocatori = null;

        try {
            fileSquadre = new BufferedReader(new FileReader("squadre.txt"));
            fileGiocatori = new BufferedReader(new FileReader("giocatori.txt"));
        } catch (Exception e) {
            System.out.println("Errore apertura file.");
        }

        ArrayList<Squadra> squadre = new ArrayList<Squadra>();
        ArrayList<Giocatore> giocatori = new ArrayList<Giocatore>();

        String linea;
        StringTokenizer st;
        int codice;

        try {
            Pallacanestro pc;
            Pallamano pm;
            linea = fileSquadre.readLine();
            while(linea != null){
                st = new StringTokenizer(linea);
                codice = Integer.parseInt(st.nextToken());
                if(st.nextToken().equals("pallamano")){
                    pm = new Pallamano();
                    pm.setCodice(codice);
                    linea = fileSquadre.readLine();
                    pm.setNome(linea);
                    linea = fileSquadre.readLine();
                    st = new StringTokenizer(linea);
                    pm.setParVinte(Integer.parseInt(st.nextToken()));
                    pm.setParPerse(Integer.parseInt(st.nextToken()));
                    pm.setMediaReti(Double.parseDouble(st.nextToken()));
                    squadre.add(pm);
                }
                else{
                    pc = new Pallacanestro();
                    pc.setCodice(codice);
                    linea = fileSquadre.readLine();
                    pc.setNome(linea);
                    linea = fileSquadre.readLine();
                    st = new StringTokenizer(linea);
                    pc.setParVinte(Integer.parseInt(st.nextToken()));
                    pc.setParPerse(Integer.parseInt(st.nextToken()));
                    pc.setMediaFalli(Double.parseDouble(st.nextToken()));
                    pc.setPuntiTot(Integer.parseInt(st.nextToken()));
                    squadre.add(pc);
                }
                linea = fileSquadre.readLine();
                linea = fileSquadre.readLine();
            }

            for(Squadra s : squadre){
                System.out.println(s.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            Giocatore giocatore;
            String cognome;
            linea = fileGiocatori.readLine();
            while(linea != null){
                giocatore = new Giocatore();
                giocatore.setCodice(Integer.parseInt(linea));
                linea = fileGiocatori.readLine();
                cognome = linea;
                linea = fileGiocatori.readLine();
                giocatore.setNomeCognome(linea, cognome);
                linea = fileGiocatori.readLine();
                st = new StringTokenizer(linea);
                giocatore.setTitolare(Boolean.parseBoolean(st.nextToken()));
                giocatore.setEta(Integer.parseInt(st.nextToken()));
                giocatore.setMaglia(Integer.parseInt(st.nextToken()));
                giocatore.setRuolo(st.nextToken());
                giocatore.dagliSquadra(squadre);
                for(Squadra s : squadre){
                    if(giocatore.getNomeSquadra().equals(s.nome)){
                        s.addGiocatore();
                        break;
                    }
                }
                giocatori.add(giocatore);
                linea = fileGiocatori.readLine();
            }

            for(Giocatore g : giocatori){
                System.out.println(g.toString());
            }

        } catch (Exception e) {
            System.out.println("Errore lettura file giocatori");
            e.printStackTrace();
        }

        for(Squadra s : squadre){
            System.out.println(s.getNome() + " " + s.getNGiocatori());
        }


    }
}