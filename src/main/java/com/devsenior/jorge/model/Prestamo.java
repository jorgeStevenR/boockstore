package com.devsenior.jorge.model;

import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaDePrestamo;
    private Lector lector;
    private Copia copia;

    
    public Prestamo(Lector lector, Copia copia) {
        this.lector = lector;
        this.copia = copia;
        this.fechaDePrestamo = LocalDate.now();
    }

    public LocalDate getFechaDePrestamo() {
        return fechaDePrestamo;
    }

    public void setFechaDePrestamo(LocalDate fechaDePrestamo) {
        this.fechaDePrestamo = fechaDePrestamo;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Copia getCopia() {
        return copia;
    }

    public void setCopia(Copia copia) {
        this.copia = copia;
    }

}
