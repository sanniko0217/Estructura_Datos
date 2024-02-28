/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.jdc.controladores;

import edu.jdc.modelo.nodoEstudiantes;
import edu.jdc.vista.vistaEstudiantes;

/**
 *
 * @author sanni
 */
public class Estudiantes_Controlador {

    private vistaEstudiantes vista_E;
    private nodoEstudiantes miNodo;

    public Estudiantes_Controlador(vistaEstudiantes vista) {
        this.vista_E = vista;
    }

    public void inicio() {

        boolean salir = false;
        while (!salir) {
            int opcion = vista_E.menuPrinsipal_estudiante();
            switch (opcion){
                case 1:
                    //agregar
                case 2:
                    //actualizar
                case 3:
                    //eliminar
                case 4:
                    //lista
                case 5: 
                    //salir
                default:
                    
            }
        }
    }
}
