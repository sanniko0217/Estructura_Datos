/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sanni
 */
public class Pila {

    int[] memoria;
    int tope;

    public Pila(int tamanio) {
        this.memoria = new int[tamanio];
        this.tope = -1;
    }

    public void push(int valor) {
        if (tope == memoria.length - 1) {
            System.out.println("Error: Pila llena");
        } else {
            tope++;
            memoria[tope] = valor;
        }
    }

    public int pop() {
        if (tope == -1) {
            System.out.println("Error: Pila vacía");
            return -1;
        } else {
            int valor = memoria[tope];
            tope--;
            return valor;
        }
    }
}
