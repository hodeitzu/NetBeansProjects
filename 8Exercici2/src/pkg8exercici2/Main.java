/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg8exercici2;
import java.io.*;

/**
 *
 * @author Hodei
 */
/*
2. Funció mostrarMatriuInt , que imprimisca una matriu d’enters. Cal mostrar-la en
forma de matriu on, en cada fila els elements han d’estar separats per comes.
Ajuda’t de la funció mostrarVectorInt .
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
    public static void mostrarMatriuInt(int matriz[][]) {
        for(int i=0;i<matriz.length;i++){
            mostrarVectorInt(matriz[i]);
        }
        
    }
    public static void main(String[] args) {
        
        int [][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        mostrarMatriuInt(matriz);
    }
}
