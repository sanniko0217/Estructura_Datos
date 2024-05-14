/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.modelo;

/**
 *
 * @author sanni
 */
public class PilaNodo_filo {

    Nodo_lifo tope;

    public PilaNodo_filo() {
        this.tope = null;
    }

    public void push(char dato) {

        Nodo_lifo nuevoNodo = new Nodo_lifo(dato);
        nuevoNodo.siguiente = tope;
        tope = nuevoNodo;
    }

    public char pop() {
        if (tope == null) {
            return '\0';
        }
        char dato = tope.dato;
        tope = tope.siguiente;
        return dato;
    }

    public boolean estaVacia() {
        return tope == null;
    }
}
