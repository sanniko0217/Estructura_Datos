/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladore;

import modelo.ListaVariables;
import modelo.Pila;
import modelo.Variable;


/**
 *
 * @author sanni
 */
public class Compilador {

    ListaVariables listaVariables;
    Pila pilaMemoria;

    public Compilador() {
        listaVariables = new ListaVariables();
        pilaMemoria = new Pila(1000);
    }

    public void declararVariable(String nombre, int tamanio, int ambito) {
        // Verificar si la variable ya existe en el mismo ámbito
        Variable actual = listaVariables.cabeza;
        while (actual != null) {
            if (actual.nombre.equals(nombre) && actual.ambito == ambito) {
                System.out.println("Error: La variable " + nombre + " ya existe en el ámbito " + ambito);
                return;
            }
            actual = actual.siguiente;
        }

        listaVariables.agregar(nombre, tamanio, ambito);
        pilaMemoria.push(tamanio);
    }

    public void liberarVariable(String nombre) {
        Variable actual = listaVariables.cabeza;
        while (actual != null) {
            if (actual.nombre.equals(nombre)) {
                listaVariables.eliminar(nombre);
                int tamanio = pilaMemoria.pop();
                // Liberar memoria en la pila
                System.out.println("La variable " + nombre + " ha sido liberada.");
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("Error: La variable " + nombre + " no existe.");
    }

    public void mostrarVariables() {
        Variable actual = listaVariables.cabeza;
        while (actual != null) {
            System.out.println("Nombre: " + actual.nombre + ", Tamaño: " + actual.tamanio + ", Ámbito: " + actual.ambito);
            actual = actual.siguiente;
        }
    }
}
