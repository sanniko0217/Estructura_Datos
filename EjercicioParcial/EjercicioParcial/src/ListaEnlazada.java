
public class ListaEnlazada {

    ListaNodo cabeza;

    public void removerDuplicados() {
        ListaNodo actual = cabeza;

        while (actual != null) {
            ListaNodo siguiente = actual.siguiente;
            while (siguiente != null && siguiente.valor == actual.valor) {
                siguiente = siguiente.siguiente;
            }
            actual.siguiente = siguiente;
            actual = actual.siguiente;
        }
    }

        public void agregar(int valor) {
        ListaNodo nuevoNodo = new ListaNodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            ListaNodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }
    
   

    public void imprimir() {
        ListaNodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}