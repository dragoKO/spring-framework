package com.cinema.spring13ormcinemalab.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "genre")
@Getter
@Setter
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "genre_id"))
public class Genre extends BaseEntity {

    private String name;

    @ManyToMany(mappedBy = "genre",fetch = FetchType.LAZY)
    private List<Movie> movie;

    @Override
    public String toString() {
        return "Genre{" +
                "name='" + name + '\'' +
                '}';
    }
}
