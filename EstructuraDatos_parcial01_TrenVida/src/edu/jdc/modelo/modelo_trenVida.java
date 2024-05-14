package edu.jdc.modelo;

import java.util.ArrayList;

/**
 *
 * @author sanni
 */
public class modelo_trenVida {

    private ArrayList<Integer> vagone;

    public modelo_trenVida() {
        vagone = new ArrayList<>();
    }

    public void agregarVagon(int dato) {
        vagone.add(dato);
    }

    public void desengancharVagon(int dato) {
        vagone.remove((Integer) dato);
    }

    public ArrayList<Integer> getVagones() {
        return vagone;
    }
}
