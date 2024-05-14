/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodo;

/**
 *
 * @author sanni
 */
public class Jugador {
   // llmarlo nodo, los nodos contiene los jugadores
    private String nombre;
    public Jugador siguiente;

    public Jugador() {
    }

    public Jugador(String nombre, Jugador siguiente) {
        this.nombre = nombre;
        this.siguiente = null;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Jugador siguiente) {
        this.siguiente = siguiente;
    }
    
}

