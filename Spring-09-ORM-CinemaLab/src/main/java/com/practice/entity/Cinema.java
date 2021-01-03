package com.practice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String sponsoredName;
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST})
    @JoinColumn(name = "locationId")
    private Location location;

    @Autowired
    public Cinema(Long cinemaId, String name, String sponsoredName) {
        this.id = cinemaId;
        this.name = name;
        this.sponsoredName = sponsoredName;
    }
}
