package edu.jdc.vista;

import edu.jdc.controlador.controlador_lifo;

/**
 *
 * @author sanni
 */
public class vista_filo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        controlador_lifo controlador = new controlador_lifo();
        
        String cadena1 = "((a+b)*c)";
        String cadena2 = "(a+c))";
        String cadena3 = "(a+b)(b+a))";
        String cadena4 = "((b*a)+(a*c))";
        
        System.out.println("la cadena \"" + cadena1 +controlador.balanceo(cadena1));
        System.out.println("la cadena \"" + cadena2 +controlador.balanceo(cadena2));
        System.out.println("la cadena \"" + cadena3 +controlador.balanceo(cadena3));
        System.out.println("la cadena \"" + cadena4 +controlador.balanceo(cadena4));
        
    }
    
}
