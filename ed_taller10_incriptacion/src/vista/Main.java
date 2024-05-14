
package vista;

import controlador.EncriptadorControlador;
import modelo.EncriptadorModelo;

/**
 *
 * @author sanni
 */
public class Main {

    public static void main(String[] args) {

        EncriptadorModelo modelo = new EncriptadorModelo();
        EncriptadorVista vista = new EncriptadorVista();
        EncriptadorControlador controlador = new EncriptadorControlador(modelo, vista);

        controlador.encriptarContraseña();

        controlador.desencriptarContraseña();
    }
    
}
