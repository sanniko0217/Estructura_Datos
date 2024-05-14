/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sanni
 */
public class Variable {

    public String nombre;
    public int tamanio;
    public int ambito;
    public Variable siguiente;
    public Variable anterior;

    Variable(String nombre, int tamanio, int ambito) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.ambito = ambito;
        this.siguiente = null;
        this.anterior = null;
    }
}
