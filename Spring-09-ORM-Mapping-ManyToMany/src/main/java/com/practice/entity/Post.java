package com.practice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;


@Entity
@Setter
@Getter
@NoArgsConstructor
public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;


    @ManyToMany
    @JoinTable(name = "post_tag_rel",
    joinColumns = {@JoinColumn(name = "post_id")},inverseJoinColumns = {@JoinColumn(name = "tag_id")})
    private Set<Tag> tags = new HashSet<>();




    @Autowired
    public Post(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
