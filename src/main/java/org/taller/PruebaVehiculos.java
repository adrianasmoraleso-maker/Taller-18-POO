package org.taller;

public class PruebaVehiculos {
    public static void main(String[] args) {
        AutoPasajeros auto = new AutoPasajeros();
        Camion camion = new Camion();

        System.out.println("\n===================Prueba Vehiculos 🚐🚚📨===================\n");

        auto.conducir();

        camion.conducir();
        camion.cargarMercancias(3500);
    }
}