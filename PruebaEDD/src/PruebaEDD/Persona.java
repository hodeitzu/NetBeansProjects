/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaEDD;

/**
 *
 * @author Hodei
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad = 0;
    private int altura = 0;
    private int peso = 0;
    private char genero= 'u';
    private String nif = "";
    private String colorPelo = "unknow";
    
    public Persona(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public Persona(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public Persona(String nombre, String apellidos,char genero){
        this(nombre, apellidos);
        this.genero = genero;
    }
    public void mostrar(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellidos: "+this.apellidos);
        if(this.edad!=0){
            System.out.println("Edad: "+this.edad);
        }
        if(this.genero!='u'){
            System.out.println("Genero: "+this.genero);
        }
        System.out.println("------------------");
    }
}
