public class Main{
    public static void main(String args[]){
        Eroe eroe = new Eroe();
        Licantropo licantropo = new Licantropo();
        Vampiro vampiro = new Vampiro();
        
        licantropo.setLuna(true);

        eroe.setForzaFisica();
        licantropo.setForzaFisica();
        vampiro.setForzaFisica();
        
        for(int i = 3; i > 0; i--){
            eroe.combatti();
        }

        vampiro.azzanna();

        if(licantropo.getLuna()){
            licantropo.azzanna();
            licantropo.azzanna();
        }
        else{
            licantropo.combatti();
            licantropo.combatti();
        }

        System.out.println("La forza fisica di eroe e': " + eroe.getForzaFisica());
        System.out.println("La forza fisica del licantropo e': " + licantropo.getForzaFisica());
        System.out.println("La forza fisica del vampiro e': " + vampiro.getForzaFisica());

    }
}