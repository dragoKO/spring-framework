package com.cinema.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "genre")
@Data
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "genre_id"))
public class Genre extends BaseEntity {

    private String name;

    @ManyToMany(mappedBy = "genre")
    private List<Movie> movie;


}
