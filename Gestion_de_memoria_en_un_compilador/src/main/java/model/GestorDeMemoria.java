package model;

/**
 * Tema : Gestor de memoria
 */
public class GestorDeMemoria {

    //Declaración de variables
    private NodoVariable cabeza;
    private PilaDeMemoria pilaDeMemoria;
    private PilaDeVariables pilaDeVariables;

    //Metodo Constructor
    public GestorDeMemoria() {
        cabeza = null;
        pilaDeMemoria = new PilaDeMemoria();
        pilaDeVariables = new PilaDeVariables();
    }

    //Metodo para asignar memoria
    public void asignarMemoria() {
        NodoVariable nuevaVariable = new NodoVariable("variable_" + (cabeza == null ? 1 : cabeza.getNodoSiguiente().getIndice() + 1));
        agregarVariable(nuevaVariable);
        pilaDeMemoria.push(nuevaVariable);
        pilaDeVariables.push(nuevaVariable);
    }

    //Metodo para liberar memoria
    public void liberarMemoria() {
        if (!pilaDeMemoria.estaVacia()) {
            NodoVariable variable = pilaDeMemoria.pop();
            eliminarVariable(variable);
        }
    }

    //Metodo para agregar la variable
    private void agregarVariable(NodoVariable variable) {
        if (cabeza == null) {
            cabeza = variable;
        } else {
            NodoVariable actual = cabeza;
            while (actual.getNodoSiguiente() != null) {
                actual = actual.getNodoSiguiente();
            }
            actual.setNodoSiguiente(variable);
            variable.setNodoAnterior(actual);
        }
    }

    //Metodo para eliminar la variable
    private void eliminarVariable(NodoVariable variable) {
        if (cabeza == variable) {
            cabeza = variable.getNodoSiguiente();
            if (cabeza != null) {
                cabeza.setNodoAnterior(null);
            }
        } else {
            NodoVariable anterior = variable.getNodoAnterior();
            NodoVariable siguiente = variable.getNodoSiguiente();
            if (anterior != null) {
                anterior.setNodoSiguiente(siguiente);
            }
            if (siguiente != null) {
                siguiente.setNodoAnterior(anterior);
            }
        }
    }

    //Metodo para obtener variables
    public NodoVariable[] getVariables() {
        int count = 0;
        NodoVariable actual = cabeza;
        while (actual != null) {
            count++;
            actual = actual.getNodoSiguiente();
        }
        NodoVariable[] variables = new NodoVariable[count];
        actual = cabeza;
        for (int i = 0; i < count; i++) {
            variables[i] = actual;
            actual = actual.getNodoSiguiente();
        }
        return variables;
    }

    //Metodo para obtener variables
    public NodoVariable[] getVariablesEnPila() {
        int count = pilaDeVariables.size();
        NodoVariable[] variables = new NodoVariable[count];
        for (int i = 0; i < count; i++) {
            variables[i] = pilaDeVariables.pop();
        }
        for (int i = count - 1; i >= 0; i--) {
            pilaDeVariables.push(variables[i]);
        }
        return variables;
    }

    //Metodo para obtener variables en memoria
    public NodoVariable[] getVariablesEnMemoria() {
        int count = pilaDeMemoria.size();
        NodoVariable[] variables = new NodoVariable[count];
        for (int i = 0; i < count; i++) {
            variables[i] = pilaDeMemoria.pop();
        }
        for (int i = count - 1; i >= 0; i--) {
            pilaDeMemoria.push(variables[i]);
        }
        return variables;
    }

}
