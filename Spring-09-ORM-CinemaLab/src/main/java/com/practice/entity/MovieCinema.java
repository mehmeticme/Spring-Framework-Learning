package com.practice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@Setter
@Getter

public class MovieCinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST},fetch = FetchType.LAZY)
    @JoinColumn(name = "movieId")
    private Movie movie;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST},fetch = FetchType.LAZY)
    @JoinColumn(name = "cinema_id")
    private Cinema cinama;

    @Temporal(TemporalType.TIME)
    private Date dateTime;

    @Autowired
    public MovieCinema(Long movieCinemaId, Date dateTime) {
        this.id = movieCinemaId;
        this.dateTime = dateTime;
    }
}
