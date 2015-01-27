/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package escalera;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Hodei
 */
public class Escalera {
    public static void escalera_bajar(int num) {
        //System.out.println("Estoy bajando"+num);
        if(num>1){
            escalera_bajar(num-1);
        }
        System.out.println("Estoy subiendo"+num);
    }
    public static void main(String[] args) {
        int num;
        Scanner teclat;
        teclat = new Scanner(System.in);
        
        System.out.println("Dime un numero:");
        num=teclat.nextInt();
        escalera_bajar(num);
        //escalera_subir(num);




   
    }
}
