import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cliente{
    private String nome;
    private HashMap<Integer, Integer> noleggiati = new HashMap<Integer, Integer>();
    private double costoMax;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void addVeicolo(int codice, int nGiorni){
        noleggiati.put(new Integer(codice), new Integer(nGiorni));
    }

    //calcolo noleggi
    private double cercaCosto(int codice, ArrayList<Veicolo> veicoli){
        double costo = 0;
        for(Veicolo v : veicoli){
            if(codice == v.getCodice()){
                costo = v.getCosto();
                break;
            }
        }
        return costo;
    }

    public void costoMaggiore(ArrayList<Veicolo> veicoli){
        double costoMaggiore = 0;
        double costo;

        for(Map.Entry<Integer,Integer> entry : noleggiati.entrySet()){
            costo = entry.getValue() * cercaCosto(entry.getKey(), veicoli);
            if(costo > costoMaggiore){
                costoMaggiore = costo;
            }
        }

        costoMax = costoMaggiore;
    }

    public String toString(){
        return nome + "\t\t\t" + costoMax + "\t\t\t" + noleggiati.size() + "\n";
    }
}