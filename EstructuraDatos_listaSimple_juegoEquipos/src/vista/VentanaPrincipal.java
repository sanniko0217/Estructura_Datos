/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.Controlador;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sanni
 */
public class VentanaPrincipal extends JFrame {

    private JTextField campoNombre;
    private JTextArea areaJugadores;
    private JTextArea areaEquipo1;
    private JTextArea areaEquipo2;
    private List<String> jugadores;

    public VentanaPrincipal() {
        jugadores = new ArrayList<>();
        initComponents();
    }

    private void initComponents() {
        // Configuración de la ventana
        setTitle("Procedimiento de Selección");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel de entrada
        JPanel panelEntrada = new JPanel(new FlowLayout());
        campoNombre = new JTextField(20);
        JButton botonAgregar = new JButton("Agregar Jugador");
        panelEntrada.add(new JLabel("Nombre de Jugador: "));
        panelEntrada.add(campoNombre);
        panelEntrada.add(botonAgregar);
        add(panelEntrada, BorderLayout.NORTH);

        // Panel central
        JPanel panelCentral = new JPanel(new GridLayout(1, 2));

        // Panel de jugadores
        JPanel panelJugadores = new JPanel(new BorderLayout());
        areaJugadores = new JTextArea(10, 20);
        areaJugadores.setEditable(false);
        panelJugadores.add(new JScrollPane(areaJugadores), BorderLayout.CENTER);
        panelJugadores.setBorder(BorderFactory.createTitledBorder("Lista de Jugadores"));
        panelCentral.add(panelJugadores);

        // Panel de equipos
        JPanel panelEquipos = new JPanel(new GridLayout(2, 1));
        areaEquipo1 = new JTextArea(10, 20);
        areaEquipo1.setEditable(false);
        areaEquipo2 = new JTextArea(10, 20);
        areaEquipo2.setEditable(false);
        panelEquipos.add(new JScrollPane(areaEquipo1));
        panelEquipos.add(new JScrollPane(areaEquipo2));
        panelEquipos.setBorder(BorderFactory.createTitledBorder("Equipos"));
        panelCentral.add(panelEquipos);

        add(panelCentral, BorderLayout.CENTER);

        // Acciones de los botones
        botonAgregar.addActionListener(e -> agregarJugador());
    }

    private void agregarJugador() {
        String nombre = campoNombre.getText().trim();
    if (!nombre.isEmpty()) {
        jugadores.add(nombre);
        campoNombre.setText("");
        actualizarListaJugadores();

        // Crear el controlador y realizar la selección de equipos
        if (jugadores.size() >= 2) {
            Controlador controlador = new Controlador(jugadores);
            controlador.realizarSeleccion();
            List<String> equipo1 = controlador.getEquipo1();
            List<String> equipo2 = controlador.getEquipo2();
            mostrarEquipos(equipo1, equipo2);
        }
    }
    }

    private void actualizarListaJugadores() {
        StringBuilder sb = new StringBuilder();
        for (String jugador : jugadores) {
            sb.append(jugador).append("\n");
        }
        areaJugadores.setText(sb.toString());
    }

    public List<String> getJugadores() {
        return jugadores;
    }

    public void mostrarEquipos(List<String> equipo1, List<String> equipo2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String jugador : equipo1) {
            sb1.append(jugador).append("\n");
        }
        for (String jugador : equipo2) {
            sb2.append(jugador).append("\n");
        }

        areaEquipo1.setText("Equipo 1:\n" + sb1.toString());
        areaEquipo2.setText("Equipo 2:\n" + sb2.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaPrincipal ventana = new VentanaPrincipal();
            ventana.setVisible(true);
        });
    }
    
}
