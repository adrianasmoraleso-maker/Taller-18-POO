package org.taller;

public class CuentaPremium implements Transferible, Retirable, PagadorFacturas {
    @Override
    public void transferir(double monto, String destino) {
        System.out.println("Transferencia de $" + monto + " a " + destino + ".");
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retiro de $" + monto + " realizado.");
    }

    @Override
    public void pagarFactura(String factura, double monto) {
        System.out.println("Pago de factura " + factura + " por $" + monto + ".");
    }
}