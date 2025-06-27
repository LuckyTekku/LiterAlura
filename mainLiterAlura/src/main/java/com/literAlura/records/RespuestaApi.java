package com.literAlura.records;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record RespuestaApi(List<Libro> results) {
}
