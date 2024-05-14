package controlador;

import modelo.EncriptadorModelo;
import vista.EncriptadorVista;

/**
 *
 * @author sanni
 */
public class EncriptadorControlador {

    private final EncriptadorModelo modelo;
    private final EncriptadorVista vista;

    public EncriptadorControlador(EncriptadorModelo modelo, EncriptadorVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void encriptarContraseña() {
        String contraseña = vista.obtenerEntrada();
        String contraseñaEncriptada = modelo.encriptar(contraseña);
        vista.mostrarResultado("Contraseña encriptada: " + contraseñaEncriptada);
    }

    public void desencriptarContraseña() {
        String contraseñaEncriptada = vista.obtenerEntrada();
        String contraseñaDesencriptada = modelo.desencriptar(contraseñaEncriptada);
        vista.mostrarResultado("Contraseña desencriptada: " + contraseñaDesencriptada);
    }
}
