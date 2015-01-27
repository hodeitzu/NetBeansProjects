/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg8exercici3;
import java.io.*;

/**
 *
 * @author Hodei
 */
/*
3. Funció copiarVector . Rebrà 2 vectors com a paràmetres i ha de copiar el primer
vector al segon. Feu-ho sense utilitzar System.arraycopy .
*/
public class Main {
    public static void mostrarVectorInt(int vector[]){
        for(int i=0;i<vector.length;i++){
            if(i<vector.length-1){
                System.out.print(vector[i]+",");
            }
            else{
            System.out.println(vector[i]);
            }
        }
    }
    public static void copiarVector(int vector1[],int vector2[]) {
        for(int i=0;i<vector1.length;i++){
            vector2[i]=vector1[i];        
        }
    }
    public static void main(String[] args) {
        int vector1[]={1,2,3,4};
        int vector2[]={0,0,0,0};
        System.out.println("Antes");
        System.out.print("Vector1= ");
        mostrarVectorInt(vector1);
        System.out.print("Vector2= ");
        mostrarVectorInt(vector2);
        copiarVector(vector1,vector2);
        System.out.println("Después");
        System.out.print("Vector1= ");
        mostrarVectorInt(vector1);
        System.out.print("Vector2= ");
        mostrarVectorInt(vector2);



   
    }
}
