package org.taller;

public class ServicioLimpiezaISP implements Limpiable {
    @Override
    public void limpiar() {
        System.out.println("Realizando limpieza");
    }
}