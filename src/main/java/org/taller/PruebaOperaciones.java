package org.taller;

public class PruebaOperaciones {
    public static void main(String[] args) {
        CuentaBasica basica = new CuentaBasica();
        CuentaPremium premium = new CuentaPremium();

        System.out.println("\n===================Operaciones Cuenta===================\n");

        basica.retirar(100);

        premium.retirar(200);
        premium.transferir(500, "Juan Pérez");
        premium.pagarFactura("EPM-2024", 150);

        System.out.println("\n=========================================================\n");
    }
}