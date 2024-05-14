package edu.jdc.modelo;

import java.util.ArrayList;

/**
 *
 * @author sanni
 */
public class NodoDoble {

  private Object dato;
    private NodoDoble anterior;
    private NodoDoble siguiente;

    public NodoDoble(int dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    } 

    public NodoDoble() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }
    
    

}
