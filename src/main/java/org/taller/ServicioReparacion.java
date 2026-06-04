package org.taller;

public class ServicioReparacion implements Reparable {
    @Override
    public void reparar() {
        System.out.println("Realizando reparación");
    }
}