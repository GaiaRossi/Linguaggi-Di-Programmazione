import java.io.*;
import java.lang.*;

import javax.sound.sampled.SourceDataLine;
public class Main{
    public static void main(String args[]){
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        int a = 0, b = 0;
        try{
            System.out.print("Inserisci un numero intero: ");
            a = Integer.parseInt(tastiera.readLine());
            System.out.print("Inserisci un numero intero: ");
            b = Integer.parseInt(tastiera.readLine());
        }
        catch(Exception e){

        }
        System.out.println("a: " + a + " b: " + b);
    }
}