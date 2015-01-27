package PruebaEDD;

/**
 *
 * @author Hodei
 */
public class Main {
    public static void main(String[] args) {
        Persona personal = new Persona("Igor","Rodriguez");
        Persona persona2 = new Persona("Igor","Rodriguez",21);
        Persona persona3 = new Persona("Igor","Rodriguez",'H');
        Alumno alumno1 = new Alumno("Igor","Rodriguez","234567");
        personal.mostrar();
        persona2.mostrar();
        persona3.mostrar();
        alumno1.mostrar();
     




   
    }
}
