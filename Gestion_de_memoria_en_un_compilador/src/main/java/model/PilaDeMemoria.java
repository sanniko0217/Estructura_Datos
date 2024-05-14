package model;

/**
 * Gestor de memoria
 * 
 */
public class PilaDeMemoria {

    //Declaración de variables
    private NodoVariable[] pila;
    private int tope;
    //Metodo Constructor

    public PilaDeMemoria() {
        pila = new NodoVariable[100];
        tope = -1;
    }
    //Metodo para validar 

    public boolean estaVacia() {
        return tope == -1;
    }
    //Metodo para expandir la pila

    public void push(NodoVariable variable) {
        if (tope >= pila.length - 1) {
            // Expandir la pila si se llena
            NodoVariable[] nuevaPila = new NodoVariable[pila.length * 2];
            System.arraycopy(pila, 0, nuevaPila, 0, pila.length);
            pila = nuevaPila;
        }
        pila[++tope] = variable;
    }
    //Metodo para validar

    public NodoVariable pop() {
        if (estaVacia()) {
            return null;
        }
        return pila[tope--];
    }
    //Metodo para asignar tamaño

    public int size() {
        return tope + 1;
    }
}
