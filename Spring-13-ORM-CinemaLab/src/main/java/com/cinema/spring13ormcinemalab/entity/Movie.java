package com.cinema.spring13ormcinemalab.entity;

import com.cinema.spring13ormcinemalab.enums.State;
import com.cinema.spring13ormcinemalab.enums.Type;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "movie")
@Getter
@Setter
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "movie_id"))
public class Movie extends BaseEntity {

    @OneToMany(mappedBy = "movie", fetch = FetchType.LAZY)
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

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", state=" + state +
                ", releaseDate=" + releaseDate +
                ", duration=" + duration +
                ", summary='" + summary + '\'' +
                '}';
    }
}
