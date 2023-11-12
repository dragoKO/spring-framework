package com.cinema.spring13ormcinemalab.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity()
@Table(name = "movie_cinema")
@Getter
@Setter
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "movie_cinema_id"))
public class MovieCinema extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    @OneToMany(mappedBy = "movieCinema",fetch = FetchType.LAZY)
    private Set<Ticket> tickets;

    @Column(name = "date_time")
    private LocalDateTime localDateTime;

    @Override
    public String toString() {
        return "MovieCinema{" +
                "localDateTime=" + localDateTime +
                '}';
    }
}
