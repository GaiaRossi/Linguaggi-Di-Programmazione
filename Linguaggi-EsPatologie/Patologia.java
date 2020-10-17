public class Patologia{
    private String patologia;
    private int gravita;

    public Patologia(String patologia, int gravita){
        this.patologia = patologia;
        if(gravita < 1||gravita > 10){
            System.out.println("La gravita inserita e' sbagliata, verra' settata automaticamente a 2.");
            this.gravita = 2;
        }
        else{
            this.gravita = gravita;
        }
    }

    public int getGravita(){
        return gravita;
    }

    public String getPatologia(){
        return patologia;
    }

    public void aggrava() throws MoltoGraveException{
        if(++gravita > 10){
            gravita = 11;
            MoltoGraveException e = new MoltoGraveException("troppo grave");
            throw e;
        }
    }

    public void attenua() throws GuaritaException{
        if(--gravita < 1){
            gravita = 0;
            GuaritaException e = new GuaritaException("guarita");
            throw e;
        }
    }

    public boolean equals(Patologia p){
        return patologia.equals(p.getPatologia());
    }

    public String toString(){
        return patologia + " con gravita' " + gravita;
    }
}