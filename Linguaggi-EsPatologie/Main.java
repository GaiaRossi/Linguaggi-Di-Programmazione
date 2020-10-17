public class Main{
    public static void main(String args[]){
        Patologia asma = new Patologia("asma", 10);
        Patologia AllergiaGraminacee = new Patologia("Allergia alle graminacee", 2);

        Paziente paziente = new Paziente("Rossi");

        paziente.aggiungiPatologia(asma);
        paziente.aggiungiPatologia(AllergiaGraminacee);

        System.out.println("Il paziente " + paziente.getCognome() + " ha le seguenti patologie:");
        System.out.println(paziente.toString());

        try{
            paziente.getPatologia(asma).aggrava();
        }
        catch(MoltoGraveException e){
            System.out.println("Asma e' " + e.getMessage());
        }
        
        try {
            paziente.getPatologia(AllergiaGraminacee).attenua();
            paziente.getPatologia(AllergiaGraminacee).attenua();
        } catch (GuaritaException e) {
            System.out.println("AllergiaGraminacee e' " + e.getMessage());
        }

        System.out.println(paziente.toString());

        paziente.aggiungiPatologia(asma);

        if(paziente.rimuoviPatologia(asma)){
            System.out.println("Patologia rimossa.");
        }
        paziente.aggiungiPatologia(asma);
    }
}