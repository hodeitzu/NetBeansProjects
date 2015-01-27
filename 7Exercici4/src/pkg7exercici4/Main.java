/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7exercici4;
import java.io.*;

/**
 *
 * @author Hodei
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom="";
        String c1="";
        String c2="";
        String nomComplet;
        BufferedReader teclat = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.println("Dime tu nombre:");
            nom = teclat.readLine();
            System.out.println("Dime tu primer apellido:");
            c1 = teclat.readLine();
            System.out.println("Dime tu segundo apellido:");
            c2 = teclat.readLine();
        }
        catch(Exception e){
            System.out.println("Error!");
        }
        System.out.println("Hola, "+nom+" "+c1+" i "+c2+"!");
        nomComplet=nom+" "+c1+" "+c2;
        System.out.println(nomComplet);
        
//        Mostrar quantes lletres ocupa el nom complet
        String nomNE=nomComplet.replaceAll(" ","");
        int tamany=nomNE.length();
        System.out.println(nomNE);
        System.out.println(tamany);
//        Informar si els 2 cognoms són iguals o diferents.
        if(c1.equals(c2)){
        System.out.println("Son Iguales");
        }
        else{
        System.out.println("Son diferentes");
        }
        
    
}
}