package com.literAlura.records;
/**
 * Representa un autor con sus datos básicos
 */
public record Autor(
        @JsonAlias("birth_year") Integer nacimiento,
        @JsonAlias("death_year") Integer fallece,
        @JsonAlias("name") String nombre) {

    public Autor {
        Objects.requireNonNull(nombre, "El nombre no puede ser nulo");
        if (nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
    }
}