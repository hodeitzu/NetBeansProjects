
package Prueba;
import java.io.*;

public class Prueba {


    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        
        try{
            System.out.print("Dime tu nombre: ");
            String nom = br.readLine();
            System.out.print("Dime tu edad: ");
            int edad = Integer.parseInt(br.readLine());
            System.out.println("Hola "+nom+", ¿tienes "+edad+"años? (S/N)");
    
            String verdad = br.readLine();
            
            
            
            
            
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
