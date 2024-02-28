
package edu.jdc.vista;

import java.util.Scanner;

/**
 *
 * @author sanni
 */
public class cajeroVista {
    
    private Scanner teclado;

    public cajeroVista(Scanner teclado) {
        this.teclado = new Scanner(System.in);
    }
    
    public void menuPrinsipal (){
        System.out.println("\n BIENVENIDO AL BANCO");
        System.out.println("\n para ingresar a su cuente ingrese usuario y contrasena:");

        System.out.println("usuario:");
        //pedir el dato
        System.out.println("contrasena:");
        //pedir el dato
        //if_ else en el controlador 
        //return
    }
    
    public void retirar_depositar_vist (){
        System.out.println("\n que accion desea hacer?");
        System.out.println("1. depositar");
        System.out.println("2. retirar");
        System.out.println("3. salir");
        System.out.println("sellecione una opcion");
        int opcion=teclado.nextInt();
        teclado.nextLine();
        //return opcion;
    }
    
     public void depositar_vist (){
        System.out.println("\n RETIROS");
        System.out.println("cuanto desea depositar???");
        //String depositar controlador = teclado.nextLine();
         System.out.println("su deposito a sido exitoso");
         
        System.out.println("1. volver 2.seguir");
        int opcion=teclado.nextInt();
        teclado.nextLine();
        //return opcion;
    }
    
    public void retirar_vist (){
        //System.out.println("ingrese pin de retiro");
        //System.out.println("NOTA; el pin no es funcional ingrese cualquier numero de 4 digitos");
        //String retirar controlador = teclado.nextLine();
        System.out.println("\n RETIROS");
        System.out.println("cuanto desea retirar???");
        //String retirar controlador = teclado.nextLine();
        
        System.out.println("\n desea hacer alguna otra opcion?");
        System.out.println("1. volver 2.seguir");
        int opcion=teclado.nextInt();
        teclado.nextLine();
        //return opcion;
    }
    
    
    
}
