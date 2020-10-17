public class InteriPari extends Interi{
    public InteriPari(int x){
        super();
        if(x%2 == 0){
           super.setValore(x); 
        }
        else{
            super.setValore(0);
        }
    }
}