/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7exercici3;
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
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        
        final int N=3;
        final int A=15;
        int v[][];
        v = new int[A][N];
        
        for(int i=0;i<v.length;i++){
            System.out.println("Alumno "+(i+1)+":");
            for(int j=0;j<v[i].length;j++){
                try{
                    System.out.print("Dime una nota: ");
                    v[i][j] = Integer.parseInt(br.readLine());
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
        System.out.print("|");
        for(int i=0;i<v.length;i++){
            if(i==0){
                System.out.print("Notes:| ");
                for(int z=0;z<N;z++){
                    System.out.print((z+1)+" | ");
                }
                System.out.println("");
                System.out.print("|------|");
                for(int z=0;z<N;z++){
                    System.out.print("---|");
                }
                System.out.println("");
            }
            System.out.print("|Alu: "+(i+1)+"| ");
            for(int j=0;j<v[i].length;j++){
                System.out.print(v[i][j]+" | ");
            }
            System.out.println("");
        }
        
    }
    
}
