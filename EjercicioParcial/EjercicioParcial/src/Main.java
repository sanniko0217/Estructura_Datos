
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los elementos de la lista (Ingrese 1 para terminar):");
        int valor = scanner.nextInt();
        while (valor != 1) {
            lista.agregar(valor);
            valor = scanner.nextInt();
        }

        System.out.println("Lista original:");
        lista.imprimir();

        lista.removerDuplicados();

        System.out.println("Lista después de eliminar duplicados:");
        lista.imprimir();

        scanner.close();
    }
}