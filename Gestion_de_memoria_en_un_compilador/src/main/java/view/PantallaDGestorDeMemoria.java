package view;

import controller.ControladorGestorDeMemoria;
import javax.swing.*;
import java.awt.*;
import model.NodoVariable;

/**
 * Gestor de memoria
 */
public class PantallaDGestorDeMemoria extends JFrame {

    //Declaración de variables
    private ControladorGestorDeMemoria controlador;
    private JTextArea panelDeInformacion;

    //Metodo Constructor
    public PantallaDGestorDeMemoria() {
        //Proceso para crear el componente grafico
        setTitle("Gestor de Memoria del Compilador");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        controlador = new ControladorGestorDeMemoria(this);

        JPanel contenedorPanel = new JPanel();
        contenedorPanel.setLayout(new BorderLayout());
        add(contenedorPanel, BorderLayout.CENTER);

        panelDeInformacion = new JTextArea();
        panelDeInformacion.setEditable(false);
        contenedorPanel.add(new JScrollPane(panelDeInformacion), BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(0, 2));
        contenedorPanel.add(panelBotones, BorderLayout.SOUTH);

        JButton botonAsignar = new JButton("Asignar Memoria");
        botonAsignar.addActionListener(e -> controlador.asignarMemoria());
        panelBotones.add(botonAsignar);

        JButton botonLiberar = new JButton("Liberar Memoria");
        botonLiberar.addActionListener(e -> controlador.liberarMemoria());
        panelBotones.add(botonLiberar);

        setVisible(true);
    }

    //Metodo para actualizar la información
    public void actualizarPanelDeInformacion() {
        StringBuilder informacion = new StringBuilder();

        // Obtener información de la lista doblemente enlazada y las pilas
        NodoVariable[] variables = controlador.getModelo().getVariables();
        informacion.append("Variables en la lista:\n");
        for (NodoVariable variable : variables) {
            informacion.append(variable.getNombre()).append("\n");
        }

        //Obtener información 
        informacion.append("\nVariables en la pila de memoria:\n");
        variables = controlador.getModelo().getVariablesEnMemoria();
        for (NodoVariable variable : variables) {
            informacion.append(variable.getNombre()).append("\n");
        }

        //obtener información
        informacion.append("\nVariables en la pila de variables:\n");
        variables = controlador.getModelo().getVariablesEnPila();
        for (NodoVariable variable : variables) {
            informacion.append(variable.getNombre()).append("\n");
        }

        //Deisgnar el texto al panel
        panelDeInformacion.setText(informacion.toString());
    }
}
