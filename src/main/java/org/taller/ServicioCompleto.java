package org.taller;

public class ServicioCompleto implements Reparable, Limpiable {
    @Override
    public void reparar() {
        System.out.println("Reparación completa");
    }

    @Override
    public void limpiar() {
        System.out.println("Limpieza completa");
    }
}