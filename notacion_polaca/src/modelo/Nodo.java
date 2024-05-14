/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sanni
 */
public class Nodo {
    private double valor;
    private String operador;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo(double valor) {
        this.valor = valor;
        this.operador = null;
        this.izquierda = null;
        this.derecha = null;
    }

    public Nodo(double valor, String operador, Nodo izquierda, Nodo derecha) {
        this.valor = 0;
        this.operador = operador;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    
    
}
