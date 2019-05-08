package com.codeup.blog.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ads")
public class Ad {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, unique = false)


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ad")
    private List<AdImage> images;
}
