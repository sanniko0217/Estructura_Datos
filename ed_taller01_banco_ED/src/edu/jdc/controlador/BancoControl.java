
package edu.jdc.controlador;

import edu.jdc.modelo.cuentaBanco;

/**
 *
 * @author sanni
=
public class BancoControl {

    private cuentaBanco datos;

    public BancoControl(cuentaBanco datos) {
        this.datos = datos;
    }

    public void pedir_datos() {

    }

    public void retirar_depositar_Cont() {
        switch (opcion) {
            case 1:
                System.out.print("\nINGRESE LA CANTIDAD QUE DESEA RETIRAR:");
                //retirar = teclado.nextInt();

                if (saldo >= retirar) {
                    if (saldo < 0) {
                        System.out.println("\nNo hay saldo suficiente para la retirada.");
                    } else {
                        saldo = saldo - retirar;
                        System.out.println("\nDINERO RETIRADO EXITOSAMENTE");
                    }
                } else {
                    System.out.println("\nBALANCE INSUFICIENTE");
                }

                System.out.println("");
                break;

            case 2:
                System.out.print("\nINGRESE LA CANTIDAD QUE DESEA DEPOSITAR:");
                //deposito = teclado.nextInt();
                //saldo = saldo + deposito;
                System.out.println("\nSU DINERO HA SIDO DEPOSITADO EXITOSAMENTE");

                break;

            case 3:
                System.out.println("SALDO : " + saldo);

                break;

            case 4:
                System.out.println("GRACIAS POR USAR EL CAJERO AUTOMATICO");
                System.exit(0);
        }
    }
}
*/
