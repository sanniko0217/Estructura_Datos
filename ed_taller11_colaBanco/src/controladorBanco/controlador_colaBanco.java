/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorBanco;

import ModeloBanco.Cliente;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author sanni
 */
public class controlador_colaBanco {
     private static Queue<Cliente> colaClientes = new LinkedList<>();
    private static int contadorTickets = 0;

    public static void agregarCliente(String nombre) {
        int numeroTicket = ++contadorTickets;
        Cliente cliente = new Cliente(nombre, numeroTicket);
        colaClientes.offer(cliente);
        System.out.println("Cliente " + nombre + " agregado a la cola. Número de ticket: " + numeroTicket);
    }

    public static void atenderCliente() {
        if (!colaClientes.isEmpty()) {
            Cliente cliente = colaClientes.poll();
            System.out.println("Atendiendo al cliente " + cliente.getNombre() + " con el número de ticket " + cliente.getNumeroTicket());
        } else {
            System.out.println("No hay clientes en espera.");
        }
    }
}
