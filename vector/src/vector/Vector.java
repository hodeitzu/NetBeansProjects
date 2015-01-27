/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;
import java.io.*;
/**
 *
 * @author Hodei
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //int vec[] = new int [10];
        int vec[] = {1,2,3,4,5,6,7,8,9,10};
        int vec2[] = {11,12,13};
        System.out.println("VEC:");
        for (int elem:vec) {
            System.out.println(elem);
        }
        
        System.out.println("VEC2:");
        for (int elem2:vec2) {
            System.out.println(elem2);
        }
        System.arraycopy(vec2,0,vec,0,vec2.length>vec.length?vec.length:vec2.length);
        System.out.println("VEC2(0)->VEC(0):");
        for (int elem:vec) {
            System.out.println(elem);
        }
        
    }
    
}
