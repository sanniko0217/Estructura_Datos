
package edu.jdc.vista;

import edu.jdc.modelo.nodoEstudiantes;
import java.util.Scanner;

/**
 *
 * @author sanni
 */
public class vistaEstudiantes {

    private Scanner teclado;

    public vistaEstudiantes() {
        this.teclado = new Scanner(System.in);
    }

    public int menuPrinsipal_estudiante() {
        System.out.println("\n menu de gestion de estudiantes");
        System.out.println("\n que accion desea hacer?");

        System.out.println("1. agrgar");
        System.out.println("2. actualizar");
        System.out.println("3. eliminar");
        System.out.println("4. revisar lista");
        System.out.println("5. salir");
        System.out.println("sellecione una opcion");
        int opcion = teclado.nextInt();
        teclado.nextLine();
        return opcion;

    }

    public void printDetallesEstudiante(String nombreEstudiante, String idEstudiante) {

        System.out.println("\n lista de estudiantes");
        System.out.println("esta es la lista de estudiantes ingresados:");

    }

    public nodoEstudiantes agregar_estu() {

        System.out.println("\n agregar estudiante");
        System.out.println("ingrese el nombre y el id del estudiante a agregar:");

        System.out.println("nombre:");
        String nombreEstudiante = teclado.nextLine();
        System.out.println("id:");
        String idEstudiante = teclado.nextLine();
        teclado.nextLine();
        return new nodoEstudiantes(nombreEstudiante, idEstudiante);
    }

    public nodoEstudiantes actualizar_estu() {

        System.out.println("\n actualizar estudiante");
        System.out.println("ingrese el id del estudiante a modificar:");

        System.out.println("nombre:");
        String nombreEstudiante = teclado.nextLine();
        System.out.println("id:");
        String idEstudiante = teclado.nextLine();
        teclado.nextLine();
        
        return new nodoEstudiantes(nombreEstudiante, idEstudiante);
    }

    public void eliminar_estu() {

        System.out.println("\n eliminar estudiante");
        System.out.println("ingrese el id del estudiante que desea eliminar:");

        System.out.println("id:");
        
    }

}
