/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import nodo.Jugador;

/**
 *
 * @author sanni
 */
public class ListaCircularSimple {
   
    private Jugador cabeza;
    private int tamanio;

    public ListaCircularSimple() {
        cabeza = null;
        tamanio = 0;
    }

    public void insertar(String nombre) {
        Jugador nuevoJugador = new Jugador(nombre, cabeza);
        if (cabeza == null) {
            cabeza = nuevoJugador;
            cabeza.siguiente = cabeza;
        } else {
            Jugador temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoJugador;
            nuevoJugador.siguiente = cabeza;
        }
        tamanio++;
    }

    public Jugador eliminar(int movimientos, boolean sentidoHorario) {
        if (cabeza == null) {
            return null;
        }

        Jugador temp = cabeza;
        Jugador previo = null;

        for (int i = 0; i < movimientos; i++) {
            previo = temp;
            temp = sentidoHorario ? temp.siguiente : buscarAnterior(temp);
        }

        if (temp == cabeza) {
            cabeza = cabeza.siguiente;
        } else {
            previo.siguiente = temp.siguiente;
        }

        tamanio--;
        return temp;
    }

    private Jugador buscarAnterior(Jugador actual) {
        Jugador temp = cabeza;
        while (temp.siguiente != actual) {
            temp = temp.siguiente;
        }
        return temp;
    }
    
    public int size() {
        return tamanio;
    }
        
 
}
