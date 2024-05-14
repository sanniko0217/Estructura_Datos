package controller;
import model.GestorDeMemoria;
import view.PantallaDGestorDeMemoria;
/**
 *Tema : Gestor de pilas
 */
public class ControladorGestorDeMemoria {
    //Declaración de variables
    private GestorDeMemoria modelo;
    private PantallaDGestorDeMemoria vista;
    
    //Metodo Constructor
    public ControladorGestorDeMemoria(PantallaDGestorDeMemoria vista) {
        this.vista = vista;
        modelo = new GestorDeMemoria();
    }
    
    //Metodo para asignar memoria
    public void asignarMemoria() {
        modelo.asignarMemoria();
        vista.actualizarPanelDeInformacion();
    }
    //Metodo para liberar memoria
    public void liberarMemoria() {
        modelo.liberarMemoria();
        vista.actualizarPanelDeInformacion();
    }
    //Metodo para obtener el modelo
    public GestorDeMemoria getModelo() {
        return modelo;
    }
}
