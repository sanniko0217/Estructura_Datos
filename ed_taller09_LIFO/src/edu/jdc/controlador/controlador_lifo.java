package edu.jdc.controlador;

import edu.jdc.modelo.PilaNodo_filo;

/**
 *
 * @author sanni
 */
public class controlador_lifo {

    public boolean balanceo(String cadena) {
        PilaNodo_filo pila = new PilaNodo_filo();
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == '(') {
                pila.push(c); // meter a la pila
            } else if (c == ')') {
                if (pila.estaVacia()) {
                    return false;
                }
                pila.pop();
            }
        }
        return pila.estaVacia();
    }
}
