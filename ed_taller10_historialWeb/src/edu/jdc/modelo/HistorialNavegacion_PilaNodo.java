/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.modelo;

/**
 *
 * @author sanni
 */
public class HistorialNavegacion_PilaNodo {
    private Stack<PaginaWeb> atras;
    private Stack<PaginaWeb> adelante;
    private paginaWeb_nodo actual;

    public HistorialNavegacion_PilaNodo() {
        atras = new Stack<>();
        adelante = new Stack<>();
        actual = new paginaWeb_nodo("https://example.com", "Página de inicio");
    }

    public void visitarPagina(paginaWeb_nodo pagina) {
        atras.push(actual);
        adelante.clear();
        actual = pagina;
    }

    public paginaWeb_nodo retroceder() {
        if (!atras.isEmpty()) {
            adelante.push(actual);
            actual = atras.pop();
        }
        return actual;
    }

    public paginaWeb_nodo avanzar() {
        if (!adelante.isEmpty()) {
            atras.push(actual);
            actual = adelante.pop();
        }
        return actual;
    }
    
    
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
