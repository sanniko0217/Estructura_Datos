package edu.jdc.mvc;

import edu.jdc.controlador.controlador_trenVida;
import edu.jdc.modelo.modelo_trenVida;
import edu.jdc.vista.vista_trenVida;
import java.util.Scanner;

/**
 *
 * @author sanni
 */
public class maind_trenVida {

    public static void main(String[] args) {

        modelo_trenVida modelo = new modelo_trenVida();
        vista_trenVida vista = new vista_trenVida();
        controlador_trenVida controlador = new controlador_trenVida(modelo, vista);

        while (true) {
            System.out.println("\n menu de gestion de vagones del tren");
            System.out.println("\n que accion desea hacer?");

            System.out.println("1. Agregar un vagón");
            System.out.println("2. eliminar un vagón");
            System.out.println("3. Mostrar lista de vagones");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");

            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    controlador.agregarVagon();
                    break;
                case 2:
                    controlador.desengancharVagon();
                    break;
                case 3:
                    controlador.imprimirTren();
                    break;
                case 4:
                    System.out.println("has salido del tren");
                    System.exit(0);
                default:
                    System.out.println("accion no disponible");
            }
        }
    }
}
