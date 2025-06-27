package com.literAlura.models;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "Autores")
public class AutorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "born")
    private Integer nacimiento;

    @Column(name = "death")
    private Integer fallece;

    @Column(name = "authorname", unique = true)
    private String nombre;

    @ManyToMany(mappedBy = "authors")
    private List<LibroModel> libros = new ArrayList<>();

    @Version
    private Integer version;

    public AutorModel() {
    }

    public AutorModel(Integer nacimiento, Integer fallece, String nombre) {
        this.nacimiento = nacimiento;
        this.fallece = fallece;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public Integer getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Integer nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Integer getFallece() {
        return fallece;
    }

    public void setFallece(Integer fallece) {
        this.fallece = fallece;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<LibroModel> getLibros() {
        return libros;
    }

    public void setLibros(List<LibroModel> libros) {
        this.libros = libros;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Autor: " + "id=" + id + ", Año born=" + nacimiento
                + ", Año de fallecimiento=" + fallece
                + ", Nombres='" + nombre + '\'';
    }
}
