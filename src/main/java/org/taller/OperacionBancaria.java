package org.taller;

//interfaz inicial (viola ISP)
public interface OperacionBancaria {
    void transferir(double monto, String destino);
    void retirar(double monto);
    void pagarFactura(String factura, double monto);
}

// Problema: una cuenta simple que solo retira se ve forzada a implementar todo