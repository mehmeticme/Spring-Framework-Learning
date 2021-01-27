package com.jackson.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"},ignoreUnknown = true)
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String price;

    private String type;

    private String state;

    @Temporal(TemporalType.DATE)
    private Date release_date;

    private Integer duration;

    private String summary;

    @ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST})
    @JoinTable(name = "MovieGenreRel",
            joinColumns = {@JoinColumn(name = "movie_id")},inverseJoinColumns = {@JoinColumn(name = "genre_id")})
    private Set<Genre> genres = new HashSet<>();

    @Autowired
    public Movie(Long movieId, String price, String type, String state, Date release_date, Integer duration, String summary) {
        this.id = movieId;
        this.price = price;
        this.type = type;
        this.state = state;
        this.release_date = release_date;
        this.duration = duration;
        this.summary = summary;
    }
}
