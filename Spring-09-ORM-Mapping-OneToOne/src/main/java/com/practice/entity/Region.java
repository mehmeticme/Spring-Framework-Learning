package com.practice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class Region extends  BaseEntity{

    private String region;
    private String country;

    public Region(String region, String country) {
        this.region = region;
        this.country = country;
    }

    @JoinColumn(name = "region_id")
    @OneToOne(mappedBy = "region")
    Employees employees;
}
