/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7exercici2;
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
        
        final int N=10;
        int v[];
        v = new int[N];
        
        for(int i=0;i<v.length;i++){
            try{
            System.out.print("Dime un numero: ");
            v[i] = Integer.parseInt(br.readLine());
        }catch(Exception e){
            e.printStackTrace();
        }
         
        }
        for(int vector:v){
            if(v[v.length-1]!=vector){
                System.out.print(vector+", ");
            }
            else{
                System.out.print(vector+".");
            }
        
        }
    }
    
}
