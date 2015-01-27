/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerp;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Hodei
 */
public class ScannerP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclat;
        teclat = new Scanner(System.in);
        String nom;
        
        System.out.println("Dime un nombre");
        nom=teclat.next();
        teclat.nextLine();
        System.out.println(nom);
        
    }
    
}
