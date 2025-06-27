package com.literAlura.dto;

import com.faviomunayco.proyectoliteralura.models.AutorModel;
import jakarta.persistence.*;

import java.util.List;

public record LibroDTO(Long id, String title, List<String> languages, List<AutorDTO> authors) {
}
List<String> languages = new ArrayList<>();
List<AutorModel> authors = new ArrayList<>();