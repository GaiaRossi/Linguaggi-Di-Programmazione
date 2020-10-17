import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ricercatore{
    private String nome, cognome;
    private HashMap<Integer, Double> progetti = new HashMap<Integer, Double>();
    private String maxImpegno;
    private double maxOrario;

    //setter
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    public void addProgetto(int codice, double impegno){
        progetti.put(new Integer(codice), new Double(impegno));
    }

    //getter
    public String getCognome(){
        return cognome;
    }
    public String getNome(){
        return nome;
    }
    public String getMaxImpegno(){
        return maxImpegno + " " + maxOrario;
    }

    //trovo impegno max
    public void trovaImpegnoMax(ArrayList<Progetto> listaProgetti){
        double max = 0;
        int maxImp = 0;
        for(Map.Entry<Integer,Double> entry : progetti.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                maxImp = entry.getKey();
            }
        }
        maxOrario = max;
        for(Progetto p : listaProgetti){
            if(p.getCodice() == maxImp){
                maxImpegno = p.getNome();
                break;
            }
        }
    }

    //toString
    public void stampaProgetti(){
        for(Map.Entry<Integer, Double> entry : progetti.entrySet()){
            System.out.println(entry.toString());
        }
    }

    public String toString(){
        double impegnoTot = 0;
        for(Map.Entry<Integer, Double> entry : progetti.entrySet()){
            impegnoTot += entry.getValue();
        }
        return nome + "\t" + cognome + "\t" + impegnoTot + "\t" + progetti.size() + "\n";
    }

}