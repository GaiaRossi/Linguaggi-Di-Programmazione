public class Prova{
    public static void main(String args[]){
        int n = 5;
        Interi[] v = new Interi[n];
        for(int i = 0; i < n; i++){
            if(i%2==0){
                v[i] = new InteriPari(i);
            }
            else{
                v[i] = new Interi(i);
            }
        }
        for(int i = 0; i < n; i++){
            v[i].stampa();
        }
        System.out.println();
    }
}