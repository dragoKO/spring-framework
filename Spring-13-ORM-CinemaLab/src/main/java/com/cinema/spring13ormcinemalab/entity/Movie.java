package com.cinema.spring13ormcinemalab.entity;

import com.cinema.spring13ormcinemalab.enums.State;
import com.cinema.spring13ormcinemalab.enums.Type;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "movie")
@Data
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "movie_id"))
public class Movie extends BaseEntity {

    @OneToMany(mappedBy = "movie")
    private List<MovieCinema> movieCinema;

    @ManyToMany
    @JoinTable(name = "movieGenreRel",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> movie;

    private String name;
    private double price;
    private Type type;
    private State state;
    private LocalDate releaseDate;
    private int duration;
    private String summary;


}
