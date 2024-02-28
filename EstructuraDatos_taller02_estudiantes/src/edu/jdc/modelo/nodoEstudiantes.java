
package edu.jdc.modelo;

/**
 *
 * @author sanni
 */
public class nodoEstudiantes {
    
    private String nombreEstudiante;
    private String idEstudiante;

    public nodoEstudiantes() {
    }

    public nodoEstudiantes(String nombreEstudiante, String idEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.idEstudiante = idEstudiante;
    }


    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
// areglo bidi objeto 
}
