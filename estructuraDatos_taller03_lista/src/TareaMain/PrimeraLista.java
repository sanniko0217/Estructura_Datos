/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TareaMain;

import java.util.Scanner;

/**
 *
 * @author sanni
 */
public class PrimeraLista {
    
    private Scanner teclado;
    int opcion = teclado.nextInt();

    public PrimeraLista() {
        this.teclado = new Scanner(System.in);
            }

    public void menuPrinsipal() {
        System.out.println("\n menu de gestion de tareas");
        System.out.println("\n que accion desea hacer?");

        System.out.println("1. agrgar");
        System.out.println("2. completar");
        System.out.println("3. eliminar");
        System.out.println("4. revisar lista");
        System.out.println("5. tareas pendientes");
        
        System.out.println("6. salir");
        System.out.println("sellecione una opcion");
       
        switch (opcion){
                case 1:
                    System.out.println("");
                    //agregarTarea(tarea);
                case 2:
                    System.out.println("");
                    //completarTarea(tarea);
                case 3:
                    System.out.println("");
                    //eliminarTarea(tarea);
                case 4:
                    System.out.println("");
                    listarTarea();
                case 5: 
                    System.out.println("");
                    contarTareasPendientes();
                case 6: 
                    
                default:
                    
            }

    }

    public void agregarTarea(String tarea){
        System.out.println("ingrese nombre de la tarea");
        System.out.println("ingrese descripcion de la tarea");
        
        tarea = teclado.nextLine();
    }
    
    public void completarTarea(String tarea){
        tarea = teclado.nextLine();
    }
    
    public void listarTarea(){
        
    }
    
    public void eliminarTarea (String tarea){
        tarea = teclado.nextLine();
    }
    
    public void contarTareasPendientes(){
        
    }
    
    public static void main(String[] args) {
        
                
    }
    
}
