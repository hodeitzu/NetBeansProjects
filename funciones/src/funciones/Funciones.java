/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package funciones;
import java.io.*;

/**
 *
 * @author Hodei
 */
public class Funciones {
    public static void main(String[] args) {
        EscribirNum();
    }
    
    public static void EscribirNum(){
    BufferedReader teclat = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dime un numero");
        try{
        int num=Integer.parseInt(teclat.readLine());
        }
        catch(Exception e){
         e.printStackTrace();
        }
    }
}
