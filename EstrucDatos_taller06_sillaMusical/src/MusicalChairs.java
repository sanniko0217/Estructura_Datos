import java.util.Random;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    boolean occupied;

    Node(int data) {
        this.data = data;
        this.occupied = false;
    }
}

class CircularList {
    Node head;
    int size;

    CircularList(int n) {
        head = null;
        size = 0;

        // Crear la lista circular con n nodos
        for (int i = 1; i <= n; i++) {
            Node newNode = new Node(i);
            if (head == null) {
                head = newNode;
                newNode.next = head;
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.next = head;
            }
            size++;
        }
    }

    void playMusic() {
        Random rand = new Random();
        int steps = rand.nextInt(size) + 1; // Número aleatorio de pasos
        Node current = head;

        // Mover el puntero alrededor de la lista
        for (int i = 0; i < steps; i++) {
            current = current.next;
        }

        // Marcar la silla actual como ocupada
        current.occupied = true;

        // Mostrar el estado actual de la lista
        System.out.println("Sillas ocupadas: ");
        Node temp = head;
        do {
            System.out.print(temp.data + " " + (temp.occupied ? "(Libre)" : "(Ocupada)") + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    void removeSeat() {
    Random rand = new Random();
    Node current = head;
    Node prev = null;
    int steps = rand.nextInt(size);

    // Mover el puntero a la silla a eliminar
    for (int i = 0; i < steps; i++) {
        prev = current;
        current = current.next;
    }

    // Eliminar la silla (nodo)
    if (current == head) {
        // Si se elimina la primera silla
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }
        head = head.next;
        last.next = head;
    } else {
        prev.next = current.next;
    }
    size--;

    // Mostrar el estado actual de la lista
    System.out.println("Silla eliminada: " + current.data);
    System.out.println("Sillas restantes: ");
    Node temp = head;
    do {
        System.out.print(temp.data + " " + (temp.occupied ? "(Ocupada)" : "(Libre)") + " -> ");
        temp = temp.next;
    } while (temp != head);
    System.out.println();
}

    void playGame() {
        while (size > 1) {
            playMusic();
            removeSeat();
        }

        System.out.println("¡El ganador es la silla " + head.data + "!");
    }
}

public class MusicalChairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de jugadores: ");
        int numJugadores = scanner.nextInt();

        CircularList game = new CircularList(numJugadores);
        game.playGame();

        scanner.close();
    }
}

