/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;
import java.io.*;
/**
 *
 * @author Hodei
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        
        try{
            System.out.print("Dóna'm un número: ");
            int s1 = Integer.parseInt(br.readLine());
            System.out.print("Dóna'm altre número: ");
            int s2 = Integer.parseInt(br.readLine());
            int suma=s1+s2;
            System.out.println("La suma es "+ s1 +"+"+ s2 +"="+ suma);
        
        }catch(Exception e){
            //e.printStackTrace();
        }
    }
    
}
