/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloBanco;

/**
 *
 * @author sanni
 */
public class Cliente {
    
    private String NumeroTicket;
    private String NombreCliente;

    public Cliente() {
    }

    public Cliente(String NumeroTicket, String NombreCliente) {
        this.NumeroTicket = NumeroTicket;
        this.NombreCliente = NombreCliente;
    }

    public String getNumeroTicket() {
        return NumeroTicket;
    }

    public void setNumeroTicket(String NumeroTicket) {
        this.NumeroTicket = NumeroTicket;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }
    
    
}
