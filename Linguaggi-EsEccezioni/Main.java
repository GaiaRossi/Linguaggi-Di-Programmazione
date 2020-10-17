import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String args[]){
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        try{
            Conversione.converti(tastiera.readLine());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}