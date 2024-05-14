/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorNotacionPolaca;
import java.util.Scanner;

/**
 *
 * @author sanni
 */
public class AplicacionNotacionPolaca {

    private ControladorNotacionPolaca controller;

    public AplicacionNotacionPolaca() {
        this.controller = new ControladorNotacionPolaca();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("incerta una operacion matematica: ");
        String expression = scanner.nextLine();

        double result = controller.evaluarExpresion(expression);
        System.out.println("notacion polaca inversa: " + result);
    }

    public static void main(String[] args) {
        AplicacionNotacionPolaca view = new AplicacionNotacionPolaca();
        view.run();
    }

}
