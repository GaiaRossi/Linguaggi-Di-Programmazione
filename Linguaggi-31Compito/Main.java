import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]){
        BufferedReader fileVeicoli = null, fileClienti = null, tastiera = null;
        
        try {
            fileVeicoli = new BufferedReader(new FileReader("veicoli.txt"));
            fileClienti = new BufferedReader(new FileReader("clienti.txt"));
            tastiera = new BufferedReader(new InputStreamReader(System.in));
        } catch (Exception e) {
            System.out.println("Errore apertura file");
        }

        ArrayList<Veicolo> veicoli = new ArrayList<Veicolo>();
        ArrayList<Cliente> clienti = new ArrayList<Cliente>();
        Auto auto = null;
        Furgone furgone = null;
        Cliente cliente = null;
        StringTokenizer st;
        String linea;
        try{
            int codice;
            linea = fileVeicoli.readLine();
            while(linea != null){
                st = new StringTokenizer(linea);
                codice = Integer.parseInt(st.nextToken());
                if(st.nextToken().equals("auto")){
                    auto = new Auto();
                    auto.setCodice(codice);
                    auto.setTarga(st.nextToken());
                    linea = fileVeicoli.readLine();
                    auto.setModello(linea);
                    linea = fileVeicoli.readLine();
                    auto.setMarca(linea);
                    linea = fileVeicoli.readLine();
                    st = new StringTokenizer(linea);
                    auto.setCapBag(Double.parseDouble(st.nextToken()));
                    auto.setCilindrata(Integer.parseInt(st.nextToken()));
                    linea = fileVeicoli.readLine();
                    auto.setCategoria(linea);
                    linea = fileVeicoli.readLine();
                    auto.setCosto(Double.parseDouble(linea));
                    veicoli.add(auto);
                }
                else{
                    furgone = new Furgone();
                    furgone.setCodice(codice);
                    furgone.setTarga(st.nextToken());
                    linea = fileVeicoli.readLine();
                    furgone.setModello(linea);
                    linea = fileVeicoli.readLine();
                    furgone.setMarca(linea);
                    linea = fileVeicoli.readLine();
                    st = new StringTokenizer(linea);
                    furgone.setRimorchio(Boolean.parseBoolean(st.nextToken()));
                    furgone.setNumeroPosti(Integer.parseInt(st.nextToken()));
                    furgone.setVano(Boolean.parseBoolean(st.nextToken()));
                    linea = fileVeicoli.readLine();
                    furgone.setCosto(Double.parseDouble(linea));
                    veicoli.add(furgone);

                }
            linea = fileVeicoli.readLine();
            }

            System.out.println("TIPO\t\tTARGA\tCODICE\tMODELLO\tMARCA\t\tCOSTO\tBAGAG\tCILIN\tCAT\tRIMORCHIO\tNPOSTI\tVANO");
            for(Veicolo v : veicoli){
                System.out.println(v.toString());
            }
        }catch(Exception e){
            System.out.println("Errore lettura veicoli.");
        }
        try{
            linea = fileClienti.readLine();
            int tmp;
            while(linea != null){
                cliente = new Cliente();
                cliente.setNome(linea);
                linea = fileClienti.readLine();
                while(linea != null && !linea.equals("")){
                    st = new StringTokenizer(linea);
                    tmp = Integer.parseInt(st.nextToken());
                    cliente.addVeicolo(tmp, Integer.parseInt(st.nextToken()));
                    for(Veicolo v : veicoli){
                        if(tmp == v.getCodice()){
                            v.addNoleggio();
                        }
                    }
                    linea = fileClienti.readLine();
                }
                cliente.costoMaggiore(veicoli);
                clienti.add(cliente);
                linea = fileClienti.readLine();
            }

            System.out.println("NOME\t\t\t\tNOLEGGIOCOSTOMAX\t\tNNOLEGGI");
            for(Cliente c : clienti){
                System.out.println(c.toString());
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        String targa = "";

        try{
            System.out.println("Inserisci targa: ");
            targa = tastiera.readLine();
        }catch(Exception e){
            System.out.println("Errore lettura tastiera.");
        }


        for(Veicolo v : veicoli){
            if(targa.equals(v.getTarga())){
                System.out.println("Noleggi: " + v.getNoleggi());
            }
        }
        
    }
}