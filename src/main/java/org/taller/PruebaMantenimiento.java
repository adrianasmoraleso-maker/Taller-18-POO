package org.taller;

public class PruebaMantenimiento {
    public static void main(String[] args) {
        ServicioReparacion reparacion = new ServicioReparacion();
        ServicioLimpiezaISP limpieza = new ServicioLimpiezaISP();
        ServicioCompleto completo = new ServicioCompleto();

        System.out.println("\n===================🛠 Servicio de Mantenimiento 🛠===================\n");
        reparacion.reparar();
        limpieza.limpiar();
        completo.reparar();
        completo.limpiar();
    }
}