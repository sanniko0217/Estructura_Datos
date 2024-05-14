package edu.jdc.vista;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sanni
 */
public class vista_listaDoble {

    private Scanner scanner;

    public vista_listaDoble() {
        scanner = new Scanner(System.in);
    }

    public int solicitarDato() {
        System.out.print("\n Ingrese el nuevo nodo: ");
        return scanner.nextInt();
    }

    public void imprimirTren(ArrayList<Integer> vagones) {
        System.out.print("\n la lista creada es la siguiente: ");
        for (int vagon : vagones) {
            System.out.print(vagon + " ");
        }
        System.out.println();
    }
}
