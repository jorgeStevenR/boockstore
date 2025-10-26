package com.devsenior.jorge.model;

public class Copia {
    private static int contador = 0;
    private Integer identificador;
    private EstadoCopia estado;
    private Libro libro;

    public Copia(Libro libro){
        this(libro, EstadoCopia.BIBLIOTECA);
    }

    public Copia(Libro libro,EstadoCopia estado){
        this.libro = libro;
        this.estado = estado;
        this.identificador =++contador;  
    }
    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public EstadoCopia getEstado() {
        return estado;
    }

    public void setEstado(EstadoCopia estado) {
        this.estado = estado;
    }

    public Libro getLibro() {
        return libro;
    }

    public static int getContador(){
        return contador;
    }



}
