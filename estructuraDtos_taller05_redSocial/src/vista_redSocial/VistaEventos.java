package vista_redSocial;

public class VistaEventos {

    public VistaUsuario getVistaUsuario() {
        return new VistaUsuario();
    }

    public void mostrarMenuAdministrador() {
        System.out.println("=== Menú Principal ===");
        System.out.println("1. Agregar al Inicio");
        System.out.println("2. Agregar E al Final");
        System.out.println("3. Modificar ");
        System.out.println("4. Eliminar Último ");
        System.out.println("5. Eliminar Primer ");
        System.out.println("6. Ver Lista de ");
        System.out.println("0. Salir");
    }

    public class VistaUsuario {

        public void printDetallesEstudiante(String nombreEstudiante, String idEstudiante) {
            System.out.println("Detalles: ");
            System.out.println("Nombre: " + nombreEstudiante);
            System.out.println("ID: " + idEstudiante);
            System.out.println("---------------------------");
        }
    }

}
