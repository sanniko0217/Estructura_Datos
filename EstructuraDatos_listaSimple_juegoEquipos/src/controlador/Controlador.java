/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import modelo.ListaCircularSimple;
import nodo.Jugador;

/**
 *
 * @author sanni
 */
public class Controlador {

    private ListaCircularSimple ronda;
    private List<String> equipo1;
    private List<String> equipo2;

    public Controlador(List<String> jugadores) {
        ronda = new ListaCircularSimple();
        equipo1 = new ArrayList<>();
        equipo2 = new ArrayList<>();

        // Agregar jugadores a la ronda
        for (String jugador : jugadores) {
            ronda.insertar(jugador);
        }
    }

    public void realizarSeleccion() {
        Random random = new Random();
        boolean sentidoHorario = true;
        boolean asignarEquipo1 = true; // Variable para llevar la cuenta del equipo

        while (ronda.size() > 1) {
            int movimientos = random.nextInt(6) + 1; // Tirar dado
            Jugador seleccionado = ronda.eliminar(movimientos, sentidoHorario);
            if (asignarEquipo1) {
                equipo1.add(seleccionado.getNombre());
            } else {
                equipo2.add(seleccionado.getNombre());
            }
            asignarEquipo1 = !asignarEquipo1;
            sentidoHorario = !sentidoHorario;
        }

        // Agregar el último jugador al equipo correspondiente
        Jugador ultimo = ronda.eliminar(1, true);
        if (equipo1.size() >= equipo2.size()) {
            equipo1.add(ultimo.getNombre());
        } else {
            equipo2.add(ultimo.getNombre());
        }
    }

    public List<String> getEquipo1() {
        return equipo1;
    }

    public List<String> getEquipo2() {
        return equipo2;
    }
}
