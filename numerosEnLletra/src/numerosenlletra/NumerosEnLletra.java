/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numerosenlletra;
import java.io.*;
import java.lang.Math.*;

/**
 *
 * @author Hodei
 */

public class NumerosEnLletra {
/*
FUNCIÓN:static int digitUnitats(int q)
DESC: A partir d'una quantitat, retorna el dígit de les unitats
IN: 483
OUT: 3
*/
static int digitUnitats(int q){
    int uni;
    uni=q%10;
    return uni;
}    
/*
FUNCIÓN: static int digitDesenes(int q)
DESC: A partir d’una quantitat, retorna el dígit de les desenes.
IN: 483
OUT: 8
*/
static int digitDesenes(int q){
    int uni;
    uni=q/10;
    uni=uni%10;
    return uni;
}
/*
FUNCIÓN: static int digitCentenes(int q)
DESC: A partir d’una quantitat, retorna el dígit de les centenes.
IN: 483
OUT: 4
*/
static int digitCentenes(int q){
    int uni;
    uni=q/100;
    uni=uni%10;
    return uni;
}
/*
FUNCIÓN: static String desenaEnLletres(int dig)
DESC: A partir d’un dígit corresponent a una desena, retorna la desena en lletra.
IN: 8
OUT: huitanta
*/
static String desenaEnLletres(int dig){
    String digit="";
    switch(dig){
        case 0:digit="cero";break;
        case 1:digit="deu";break;
        case 2:digit="vint";break;
        case 3:digit="trenta";break;
        case 4:digit="quaranta";break;
        case 5:digit="cinquanta";break;
        case 6:digit="seixanta";break;
        case 7:digit="setanta";break;
        case 8:digit="huitanta";break;
        case 9:digit="noranta";break;
    }
    return digit;
}
/*
FUNCIÓN: static String digitEnLletres(int dig)
DESC: A partir d’un dígit (no corresponent a una desena), el retorna en lletra.
IN: 3
OUT: tres
*/
static String digitEnLletres(int dig){
    String digit="";
    switch(dig){
        case 0:digit="cero";break;
        case 1:digit="un";break;
        case 2:digit="dos";break;
        case 3:digit="tres";break;
        case 4:digit="quatre";break;
        case 5:digit="cinc";break;
        case 6:digit="sis";break;
        case 7:digit="set";break;
        case 8:digit="huit";break;
        case 9:digit="nou";break;
    }
    return digit;
}
static String Excep10mas(int dig){
    String digit="";
    switch(dig){
        case 0:digit="deu";break;
        case 1:digit="onze";break;
        case 2:digit="dotze";break;
        case 3:digit="tretze";break;
        case 4:digit="catorze";break;
        case 5:digit="quinze";break;
        case 6:digit="setze";break;
        case 7:digit="dèsset";break;
        case 8:digit="dihuit";break;
        case 9:digit="dèneu";break;
    }
    return digit;
}
/*
FUNCIÓ: static String 3digitsEnLletres(int q3)
DESC: A partir d’una quantitat de 3 dígits (o menys), la retorna en lletra.
IN: 483
OUT: quatre-cents huitanta-tres
*/
static String digits9EnLletres(int num){
    String digits="";
    int div=num;
    int resto=num;
    int cont=3;
    String digitsf=num+" = ";
    
    do{
        div=resto/(int)Math.pow(10, (cont-1)*3);
        //System.out.println(div);
        if(cont==3){
            digits=digits3EnLletres(div)+" milions ";
        }
        else{
            if(cont==2){
                digits=digits+digits3EnLletres(div)+" mil ";
            }
            else{
                digits=digits+digits3EnLletres(div);
            }
        }
        resto %= (int)Math.pow(10, (cont-1)*3);
        //System.out.println(resto);
        cont--;
    }while((resto!=0)&&(cont>0));
    digitsf=digitsf+digits;
    
    return digitsf;
}
static String digits3EnLletres(int num){
    
    String u="",d="",c="";
    String digits="";
    
    u=digitEnLletres(digitUnitats(num));
    d=desenaEnLletres(digitDesenes(num));
    c=digitEnLletres(digitCentenes(num));
    /*System.out.println(c);
    System.out.println(d);
    System.out.println(u);*/
/*-----------------------------XXX--------------------------------------------*/
    if(c!="cero"){
        if(c=="un"){
            digits=digits+"cent ";
        }
        else{
            digits=digits+c+"-cents ";
        }
    }   
/*------------------------------XX--------------------------------------------*/
    if((d=="vint")&&(u!="cero")){//Entre 21 y 29
        digits=digits+d+"-i-"+u;
    }
    else{//Que no sea entre 21 y 29
        if(u=="cero"){//Decenas entre 1 y 9 y Unidades 0.
            if((d=="cero")&&(u=="cero")){
                }
                else{
                digits=digits+d;
            }
                    
            
        }
        else{//Decenas entre 1 y 9 y Unidades que no sean 0.
            if (d=="deu"){
                d=Excep10mas(digitUnitats(num));
                digits=digits+d;
            }
            else{
                    if(d=="cero"){
                        digits=digits+u;
                    }
                    else{
                        digits=digits+d+"-"+u;
                    }
                
            }  
        }
    }
            
        
/*-------------------------------X--------------------------------------------*/
        if ((c=="cero")&&(d=="cero")&&(u!="")){//SOLO UNIDADES(CON VALOR).
            digits=(num+" = "+u);
        }
    
    
    return digits;
}
    public static void main(String[] args) {
        int num=0;
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclat = new BufferedReader(entrada);
        
        while(num!=-1){
        try{
            System.out.println("Dime un numero entero:");
            num=Integer.parseInt(teclat.readLine());
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(digits9EnLletres(num));
        }
    }
}
