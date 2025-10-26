package com.devsenior.jorge.model;

// POJO -> Plain Old Java Objet
// JavaBeans
// DTO -> Data Transfer Objet
// VO -> Value Object
public class Libro {
    private String nombre;
    private String editoria;
    private Integer año;
    private Copia[] copias;
    private Autor autor;
    private TipoLibro tipoLibro;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditoria() {
        return editoria;
    }

    public void setEditoria(String editoria) {
        this.editoria = editoria;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Copia[] getCopias() {
        return copias;
    }

    public void setCopias(Copia[] copias) {
        this.copias = copias;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public TipoLibro getTipoLibro() {
        return tipoLibro;
    }

    public void setTipoLibro(TipoLibro tipoLibro) {
        this.tipoLibro = tipoLibro;
    }

}
