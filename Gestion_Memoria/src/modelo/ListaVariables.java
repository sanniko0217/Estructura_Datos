/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sanni
 */
public class ListaVariables {

    public Variable cabeza;
    public Variable cola;

    public ListaVariables() {
        this.cabeza = null;
        this.cola = null;
    }

    public void agregar(String nombre, int tamanio, int ambito) {
        Variable nueva = new Variable(nombre, tamanio, ambito);
        if (cabeza == null) {
            cabeza = nueva;
            cola = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            cola = nueva;
        }
    }

    public void eliminar(String nombre) {
        Variable actual = cabeza;
        while (actual != null) {
            if (actual.nombre.equals(nombre)) {
                if (actual == cabeza) {
                    cabeza = actual.siguiente;
                    if (cabeza != null) {
                        cabeza.anterior = null;
                    } else {
                        cola = null;
                    }
                } else if (actual == cola) {
                    cola = actual.anterior;
                    cola.siguiente = null;
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                break;
            }
            actual = actual.siguiente;
        }
    }
}
