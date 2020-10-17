import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{

        System.out.println(args[0]);
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter file = new PrintWriter(new File(args[0]));
        String testo;

        while(!(testo = tastiera.readLine()).isEmpty()){
            file.println(testo);
        }
        file.println();
        file.close();
        
        BufferedReader leggiFile = new BufferedReader(new FileReader(args[0]));
        
        while(!(testo = leggiFile.readLine()).isEmpty()){
            System.out.println(testo);
        }

        leggiFile.close();
        
    }
}