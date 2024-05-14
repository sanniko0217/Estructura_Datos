package edu.jdc.mvc;

import edu.jdc.controlador.controlador_listaDoble;
import edu.jdc.modelo.NodoDoble;
import edu.jdc.vista.vista_listaDoble;
import java.util.Scanner;

/**
 *
 * @author sanni
 */
public class maind_listaDoble {

    public static void main(String[] args) {

        NodoDoble modelo = new NodoDoble();
        vista_listaDoble vista = new vista_listaDoble();
        controlador_listaDoble controlador = new controlador_listaDoble(modelo, vista);

        while (true) {
            System.out.println("\n menu ");
            System.out.println("\n que accion desea hacer?");

            System.out.println("1. Agregar al inicio");
            System.out.println("1. Agregar al final");
            System.out.println("2. eliminar ");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opcion: ");

            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    controlador.agregarAlInicio(opcion);
                    break;
                case 2:
                    controlador.agregarAlFila(opcion);
                    break;
                case 3:
                    controlador.desengancharNodo();
                    break;
                case 4:
                    controlador.imprimirLista();
                    break;
                case 5:
                    System.out.println("has salido");
                    System.exit(0);
                default:
                    System.out.println("accion no disponible");
            }
        }
    }
}
