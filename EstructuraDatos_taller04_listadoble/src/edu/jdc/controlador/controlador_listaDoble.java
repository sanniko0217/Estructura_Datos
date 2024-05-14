package edu.jdc.controlador;

import edu.jdc.modelo.NodoDoble;
import edu.jdc.vista.vista_listaDoble;
import java.util.ArrayList;

/**
 *
 * @author sanni
 */
public class controlador_listaDoble {

    private NodoDoble modelo;
    private vista_listaDoble vista;
    
    private NodoDoble primerNodo;
    private NodoDoble ultimoNodo;
    

    public controlador_listaDoble() {
        inicio();
    }

    private void inicio() {
        this.primerNodo = null;
        this.ultimoNodo = null;
    }

    public boolean listaVcia() {
        return primerNodo == null;
    }

    public controlador_listaDoble(NodoDoble modelo, vista_listaDoble vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void agregarAlFila(int dato) {
        NodoDoble nuevoNodo = new NodoDoble(dato);
        if (listaVcia()) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;

        } else {
            ultimoNodo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(ultimoNodo);
            ultimoNodo = nuevoNodo;
        }
    }

    public void agregarAlInicio(int dato) {
        NodoDoble nuevoNodo = new NodoDoble(dato);
        if (listaVcia()) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(primerNodo);
            primerNodo.setAnterior(nuevoNodo);
            primerNodo = nuevoNodo;
        }
    }

    public void eliminarPorPosicion(int dat0){
        
    }
    
    public void agregarNodo(int dato) {
        dato = vista.solicitarDato();
        modelo.agregarNodo(dato);
    }
    
    public void desengancharNodo() {
        int dato = vista.solicitarDato();
        modelo.eliminarNodo(dato);
    }

    public void imprimirLista() {
        ArrayList<Integer> vagones = modelo.getNodo();
        vista.imprimirTren(vagones);
    }
}
