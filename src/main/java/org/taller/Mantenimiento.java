package org.taller;

public interface Mantenimiento {
    void reparar();
    void limpiar();
}

// Problema: una clase que solo limpia se ve obligada a implementar reparar() también
class ServicioLimpieza implements Mantenimiento {
    @Override
    public void reparar() {
        // No aplica, pero Java obliga a implementarla — esto viola el ISP
        throw new UnsupportedOperationException("Este servicio solo limpia.");
    }

    @Override
    public void limpiar() {
        System.out.println("Limpiando instalaciones.");
    }
}