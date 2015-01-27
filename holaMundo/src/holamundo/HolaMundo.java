/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;
import java.io.*;
/**
 *
 * @author Hodei
 */
public class HolaMundo {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
  
        final float PI=3.14f;//Declarar constante
        String text = "hola don pepito"; //Clase string que declara la variable text
        text = "hola don jose"; //Se puede modificar la asignación de la clase string
        System.out.println("Hola don pepito, " + text);//Mostrar texto y variable "text" al mismo tiempo concatenando con +
        System.out.printf("%s\n", text);//se puede usar printf igual que siempre
        System.out.println(PI);//Imprimir constante
        System.out.println("Hola Món");//println -> hace un salto de linea /n en c
        
        System.out.print("Com et diuen? ");
        String nom = "";
        try {    
        nom = dataIn.readLine();
        }
        catch( IOException e ) {
            System.out.println("Error en l’entrada de dades");
        }
        System.out.println(nom);
    }
    
}
