package com.lab2.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(value = {"id","hibernateLazyInitializer"},ignoreUnknown = true)

public class Course extends BaseEntity {

    @Column(columnDefinition = "text")
    private String description;
    private String name;

}
