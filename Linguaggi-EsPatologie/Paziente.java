import java.util.ArrayList;

public class Paziente{
    private String cognome;
    private ArrayList<Patologia> patologie = new ArrayList<Patologia>();
    Patologia vuota = new Patologia("vuota", 1);

    public Paziente(String cognome){
        this.cognome = cognome;
    }
    public Paziente(String cognome, Patologia patologia){
        if(!patologie.add(patologia)){
            System.out.println("Errore nell'inserimento della patologia.");
        }
        else{
            this.cognome = cognome;
        }
    }

    public String getCognome(){
        return cognome;
    }

    public Patologia getPatologia(Patologia p){
        if(patologie.contains(p)){
            return patologie.get(patologie.indexOf(p));
        }
        else{
            return vuota;
        }
    }

    public void aggiungiPatologia(Patologia patologia){
        if(!patologie.contains(patologia)){
            patologie.add(patologia);
        }
        else{
            System.out.println("Il paziente contine gia' la patologia.");
        }
    }

    public boolean rimuoviPatologia(Patologia patologia){
        if(patologie.contains(patologia)){
            patologie.remove(patologia);
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return patologie.toString();
    }
}