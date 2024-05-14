/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_redSocial;

import java.util.List;
import java.util.Scanner;
import modelo_redSocial.Evento;
import vista_redSocial.VistaEventos;


public class ControladorEventos {

    private VistaEventos.VistaUsuario vistaUsuario;
    private Evento modelo;

    public ControladorEventos(VistaEventos vista) {
        this.vistaUsuario = vista.getVistaUsuario();
        this.modelo = new Evento();
    }

    public void agregarAlInicio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre : ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el ID : ");
        String id = scanner.nextLine();
        modelo.agregarAlInicio(nombre, id);
    }

    public void agregarAlFinal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre : ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el ID : ");
        String id = scanner.nextLine();
        modelo.agregarAlFinal(nombre, id);
    }

    public void modificar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID a modificar: ");
        String idModificar = scanner.nextLine();
        System.out.print("Ingrese el nuevo nombre : ");
        String nuevoNombre = scanner.nextLine();
        modelo.modificar(idModificar, nuevoNombre);
    }

    public void eliminarAlFinal() {
        modelo.eliminar(false);
    }

    public void eliminarEstudianteAlInicio() {
        modelo.eliminar(true);
    }

    public void verLista() {
        List<Modelo.Estudiante> estudiantes = modelo.getListaEstudiantes();
        for (Modelo.Estudiante estudiante : estudiantes) {
            vistaEstudiante.printDetallesEstudiante(estudiante.getNombre(), estudiante.getId());
        }
    }

}
