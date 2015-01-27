/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jubilacion;

import java.io.*;

/**
 *
 * @author Hodei
 */
public class Jubilacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        
        try{
            System.out.print("Dime tu nombre: ");
            String nom = br.readLine();
            System.out.print("Dime tu edad: ");
            int edad = Integer.parseInt(br.readLine());
            int jubi = 65-edad;
            if (edad<65){
                System.out.println("Hola "+nom+", tienes "+edad+" años y te faltan "+jubi+" años para jubilarte.");
            }
            else{ 
                if(edad>65){
                    System.out.println("Hola "+nom+", ya estas jubilado.");
                }
                else{
                    System.out.println("Hola "+nom+", este año te jubilas.");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
