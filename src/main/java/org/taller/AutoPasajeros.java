package org.taller;

//Solo conduce, no carga
public class AutoPasajeros implements Conducible {
    @Override
    public void conducir() {
        System.out.println("Auto de pasajeros en marcha");
    }
}