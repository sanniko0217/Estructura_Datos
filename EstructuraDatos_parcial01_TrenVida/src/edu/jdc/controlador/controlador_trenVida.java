package edu.jdc.controlador;

import edu.jdc.modelo.modelo_trenVida;
import edu.jdc.vista.vista_trenVida;
import java.util.ArrayList;

/**
 *
 * @author sanni
 */
public class controlador_trenVida {

    private modelo_trenVida modelo;
    private vista_trenVida vista;

    public controlador_trenVida(modelo_trenVida modelo, vista_trenVida vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void agregarVagon() {
        int dato = vista.solicitarDato();
        modelo.agregarVagon(dato);
    }

    public void desengancharVagon() {
        int dato = vista.solicitarDato();
        modelo.desengancharVagon(dato);
    }

    public void imprimirTren() {
        ArrayList<Integer> vagones = modelo.getVagones();
        vista.imprimirTren(vagones);
    }
}
