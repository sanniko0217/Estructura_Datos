/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es_tarea_listacircularsimple;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author sanni
 */
public class ListaSimpleDoble {

    class Nodo{
        Object dato;
        ListaSimpleDoble.Nodo siguiente;
    }
    
    ListaSimpleDoble.Nodo inicio;
    
    public void insertarInicio(Object v){
        if(inicio == null){ // cuando no se ha creado ningun nodo
            inicio = new ListaSimpleDoble.Nodo();//Se crea un espacio en memoria para el nodo inicio
            inicio.dato = v; // se inserta el dato
            inicio.siguiente = inicio;
        }else{
            ListaSimpleDoble.Nodo nuevo = new ListaSimpleDoble.Nodo();//Se crea un espacio en memoria para el nodo inicio
            nuevo.dato = v;// se inserta el dato
            
            ListaSimpleDoble.Nodo aux = inicio;//aux para recorrer los nodos
             while (aux.siguiente != inicio) {
                 aux = aux.siguiente;
             }
            aux.siguiente = nuevo; //nuevo en su .next apunta hacia nuestro nodo inicio
            nuevo.siguiente = inicio; //ahora inicio apunta a nuestro nodo Nuevo
            
        }
    }
    
   
    
    public void buscar(String palabra) {
        boolean estado = false;
      ListaSimpleDoble.Nodo aux = inicio;
        if (aux != null) {
            while (aux.siguiente != inicio) {
                if (aux.dato.equals(palabra)) {
                    estado = true;
                    break;
                }
                aux = aux.siguiente;
            }
            if (estado) {
                 JOptionPane.showMessageDialog(null, "si esta!");
            }else{
                 JOptionPane.showMessageDialog(null, "No esta!","Erorr",JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    
    //metodo para mostrar la info en un Jlist
    public DefaultListModel<String> mostrarL(){
        DefaultListModel<String> l1 = new DefaultListModel<>();
        
        ListaSimpleDoble.Nodo aux = inicio;
        if( aux != null){
            l1.addElement(" dato | siguiente");
            while ( aux.siguiente != inicio){
                l1.addElement(
                aux.dato + " | " 
              + aux.siguiente.dato);
                
                aux = aux.siguiente;
            }
            l1.addElement(
            aux.dato + " | " 
            + aux.siguiente.dato);
        }
        return l1;
    }
    
   
}
    
    

