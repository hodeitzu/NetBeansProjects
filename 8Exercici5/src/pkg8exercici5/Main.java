/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg8exercici5;
import java.io.*;

/**
 *
 * @author Hodei
 */
/*
5. Fes la funció llegirString que llija una cadena de teclat i la retorne.
*/
public class Main {
    public static void llegirString() {
        char vector[100];
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        try{
            System.out.print("Rellena el vector:");
            vector[100] = br.readLine();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
     




   
    }
}
