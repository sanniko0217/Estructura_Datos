/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.jdc.modelo;

/**
 *
 * @author sanni
 */
public class cuentaBanco {

private String usuario;
private String contrasena;
private int saldo;

    public cuentaBanco() {
    }

    public cuentaBanco(String usuario, String contrasena, int capital) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.saldo = capital;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getCapital() {
        return saldo;
    }

    public void setCapital(int capital) {
        this.saldo = capital;
    }
    
}
