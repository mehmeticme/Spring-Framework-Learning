package com.jackson.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jackson.entity.Movie;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

import javax.persistence.*;
import java.util.HashSet;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "genres")
    @JsonIgnore
    private Set<Movie> movieList = new HashSet<>();

    @Autowired
    public Genre(Long gendeId, String name) {
        this.id = gendeId;
        this.name = name;
    }
}
