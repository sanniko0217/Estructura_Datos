package model;

/**
 * Gestor de pilas
 */
public class NodoVariable {

    //Declaración de variables
    private String nombre;
    private NodoVariable nodoAnterior;
    private NodoVariable nodoSiguiente;
    private int indice;
    
//Metodo Constructor

    public NodoVariable(String nombre) {
        this.nombre = nombre;
        this.nodoAnterior = null;
        this.nodoSiguiente = null;
        this.indice = 0;
    }
//Metodo para obtener el nombre

    public String getNombre() {
        return nombre;
    }
//Metodo para obtener el nodo anterior

    public NodoVariable getNodoAnterior() {
        return nodoAnterior;
    }
//Metodo para asignar el nodo anterior

    public void setNodoAnterior(NodoVariable nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }
//Metodo para obtener el nodo siguiente

    public NodoVariable getNodoSiguiente() {
        return nodoSiguiente;
    }
//Metodo para asignar el nodo siguiente

    public void setNodoSiguiente(NodoVariable nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }
//Metodo para obtener el indice

    public int getIndice() {
        return indice;
    }
//Metodo para asignar el indice

    public void setIndice(int indice) {
        this.indice = indice;
    }
}
