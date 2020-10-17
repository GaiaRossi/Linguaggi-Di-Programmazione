import java.util.ArrayList;

public class Giocatore{
    private int codice, eta, nmaglia;
    private String cognome, nome, ruolo, nomeSquadra;
    private boolean titolare;

    //getter
    public int getCodice(){
        return codice;
    }
    public int getEta(){
        return eta;
    }
    public int getNmaglia(){
        return nmaglia;
    }
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public String getRuolo(){
        return ruolo;
    }
    public boolean isTitolare(){
        return titolare;
    }
    public String getNomeSquadra(){
        return nomeSquadra;
    }

    //setter
    public void setNomeCognome(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }
    public void setRuolo(String ruolo){
        this.ruolo = ruolo;
    } 
    public void setTitolare(boolean titolare){
        this.titolare = titolare;
    }
    public void setCodice(int codice){
        this.codice = codice;
    }
    public void setEta(int eta){
        this.eta = eta;
    }
    public void setMaglia(int nmaglia){
        this.nmaglia = nmaglia;
    }

    //cerco la squadra
    public void dagliSquadra(ArrayList<Squadra> squadre){
        for(Squadra s : squadre){
            if(codice == s.getCodice()){
                nomeSquadra = s.getNome();
                break;
            }
        }
    }

    //toString
    public String toString(){
        return nome + "\t" + cognome + "\t" + eta + "\t" + nmaglia + "\t" + ruolo + "\t" + nomeSquadra + "\n";
    }
}