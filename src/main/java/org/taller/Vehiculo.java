package org.taller;

//Interfaz inicial (viola ISP)
public interface Vehiculo {
    void conducir();
    void cargarMercancias(double peso);
}

// Problema: un auto de pasajeros no carga mercancías, pero se ve forzado a implementarlo