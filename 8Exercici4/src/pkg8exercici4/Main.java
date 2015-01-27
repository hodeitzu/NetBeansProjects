/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg8exercici4;
import java.io.*;

/**
 *
 * @author Hodei
 */
/*
4. Funció igualsVectors . Rebrà 2 vectors. La funció ha de retornar un booleà dient si
els 2 vectors són iguals (igual grandària i mateixos elements). Feu-ho sense
utilitzar Arrays.equals.
*/
public class Main {
    public static boolean igualsVectors(int vector1[],int vector2[]){
        boolean respuesta=true;
        if(vector1.length==vector2.length){
        for(int i=0;i<vector1.length;i++){
            if(vector2[i]!=vector1[i]){
                respuesta=false;
            }        
        }
        }
        else{
            respuesta=false;
        }
        return respuesta;
    }

    
    public static void main(String[] args) {
        int vector1[]={1,2,3,4};
        //int vector1[]={1,2,3,4,5};
        int vector2[]={1,2,3,4};
        //int vector2[]={0,0,0,0};
        //int vector2[]={0,0,0,0,0};
        boolean respuesta;
        respuesta=igualsVectors(vector1,vector2);
        System.out.println(respuesta);



   
    }
}
