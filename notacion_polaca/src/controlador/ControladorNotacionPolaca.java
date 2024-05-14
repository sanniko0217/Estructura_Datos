/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Nodo;

/**
 *
 * @author sanni
 */
public class ControladorNotacionPolaca {
    private Nodo[] pila;
    private int tope;

    public ControladorNotacionPolaca() {
        this.pila = new Nodo[100]; // Tamaño máximo de la pila
        this.tope = -1;
    }

    public double evaluarExpresion(String expresion) {
        String[] tokens = expresion.split(" ");
        for (String token : tokens) {
            if (esOperador(token)) {
                Nodo derecha = pop();
                Nodo izquierda = pop();
                Nodo operacion = new Nodo(token, izquierda, derecha);
                push(operacion);
            } else {
                Nodo operando = new Nodo(Double.parseDouble(token));
                push(operando);
            }
        }
        return pop().getValor();
    }

    private void push(Nodo nodo) {
        if (tope >= pila.length - 1) {
            throw new RuntimeException("Pila llena");
        }
        pila[++tope] = nodo;
    }

    private Nodo pop() {
        if (tope == -1) {
            throw new RuntimeException("Pila vacía");
        }
        return pila[tope--];
    }

    private boolean esOperador(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
}
