package org.taller;

public class Camion implements Conducible, TransportadorMercancias {
    @Override
    public void conducir() {
        System.out.println("Camión en marcha");
    }

    @Override
    public void cargarMercancias(double peso) {
        System.out.println("Cargando " + peso + " kg de mercancías");
    }
}