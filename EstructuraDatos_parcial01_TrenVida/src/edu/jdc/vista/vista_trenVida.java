package edu.jdc.vista;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sanni
 */
public class vista_trenVida {

    private Scanner scanner;

    public vista_trenVida() {
        scanner = new Scanner(System.in);
    }

    public int solicitarDato() {
        System.out.print("Ingrese el nuevo vagón: ");
        return scanner.nextInt();
    }

    public void imprimirTren(ArrayList<Integer> vagones) {
        System.out.print("Tren tiene los siguientes vagones: ");
        for (int vagon : vagones) {
            System.out.print(vagon + " ");
        }
        System.out.println();
    }
}
