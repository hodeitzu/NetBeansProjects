/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
1. Fes la funció mostrarVectorInt , que imprimisca un vector d’enters passat com a
paràmetre. Cal mostrar els elements separats per comes i amb salt de línia final.
*/
package pkg8exercici1;
import java.io.*;

/**
 *
 * @author Hodei
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
    public static void main(String[] args) {
        int vector[]={1,2,3,4,5,6,7,8,9,0};
        mostrarVectorInt(vector);
        int vector2[]={3,33,333};
        mostrarVectorInt(vector2);
    }
}
