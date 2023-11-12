package com.cinema.entity;

import com.cinema.enums.State;
import com.cinema.enums.Type;
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
    private List<Genre> genre;

    private String name;
    private double price;

    @Enumerated(EnumType.STRING)
    private Type type;

    @Enumerated(EnumType.STRING)
    private State state;

    private LocalDate releaseDate;
    private int duration;
    private String summary;


}
