/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.controlador;

import edu.jdc.modelo.HistorialNavegacion_PilaNodo;
import edu.jdc.modelo.paginaWeb_nodo;
import edu.jdc.vista.Frm_VistaHistorial;
import java.util.LinkedList;

/**
 *
 * @author sanni
 */
public class ControladorHistorial {
   private LinkedList<paginaWeb_nodo> historial;
    private int indiceActual;

    public ControladorHistorial() {
        historial = new LinkedList<>();
        indiceActual = -1; // No hay páginas en el historial inicialmente
    }

    public void visitarPagina(paginaWeb_nodo pagina) {
        // Eliminar las páginas que están adelante del índice actual
        while (indiceActual < historial.size() - 1) {
            historial.removeLast();
        }
        historial.add(pagina);
        indiceActual++;
    }

    public paginaWeb_nodo retroceder() {
        if (indiceActual > 0) {
            indiceActual--;
            return historial.get(indiceActual);
        }
        return null; // No hay más páginas hacia atrás
    }

    public paginaWeb_nodo avanzar() {
        if (indiceActual < historial.size() - 1) {
            indiceActual++;
            return historial.get(indiceActual);
        }
        return null; // No hay más páginas hacia adelante
    }

    public paginaWeb_nodo getPaginaActual() {
        if (indiceActual >= 0 && indiceActual < historial.size()) {
            return historial.get(indiceActual);
        }
        return null;
    }

    public LinkedList<paginaWeb_nodo> getHistorial() {
        return historial;
    }
}
