package com.practice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Regions {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String region;
    private String country;


    @Autowired
    public Regions(int id, String region, String country) {
        this.id = id;
        this.region = region;
        this.country = country;
    }
}
