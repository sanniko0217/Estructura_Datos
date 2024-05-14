
package vista;

import java.util.Scanner;

/**
 *
 * @author sanni
 */
public class EncriptadorVista {
    public String obtenerEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la contraseña: ");
        return scanner.nextLine();
    }

    public void mostrarResultado(String resultado) {
        System.out.println("Resultado: " + resultado);
    }
}
