package com.literAlura.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "libros")
public class LibroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", nullable = false)
    private String title;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "libro_lenguajes", joinColumns = @JoinColumn(name = "libro_id"))
    @Column(name = "lenguaje")
    private List<String> languages = new ArrayList<>();

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH},
            fetch = FetchType.LAZY)
    @JoinTable(name = "libro_autor",
            joinColumns = @JoinColumn(name = "libro_id"),
            inverseJoinColumns = @JoinColumn(name = "autor_id"))
    private List<AutorModel> authors = new ArrayList<>();

    @Version
    private Integer version;

    public LibroModel() {
    }

    public LibroModel(String title, List<String> languages, List<AutorModel> authors) {
        this.title = title;
        if (languages != null) this.languages = new ArrayList<>(languages);
        if (authors != null) this.authors = new ArrayList<>(authors);
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

   public Integer getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "LibroModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", languages=" + languages +
                ", authors=" + (authors != null ? authors.stream().map(AutorModel::getId).toList() : null) +
                '}';
    }
}
