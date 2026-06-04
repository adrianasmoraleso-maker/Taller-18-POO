package org.taller;

class CuentaBasica implements Retirable {
    @Override
    public void retirar(double monto) {
        System.out.println("Retiro de $" + monto + " realizado");
    }
}