/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindromo;
import java.io.*;

/**
 *
 * @author Hodei
 */
public class Palindromo {
    public static boolean pal(String s){
        if (s.length()<2)
            return true;
        else
            if ((s.charAt(0) == s.charAt(s.length()-1))&&pal(s.substring(1, s.length()-1)))
                    return true;
            else
                    return false;
    
    }
    public static void main(String[] args) {
        System.out.println(pal("anitalavalatina"));




   
    }
}
