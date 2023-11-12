package com.cinema.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity()
@Table(name = "movie_cinema")
@Data
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "movie_cinema_id"))
public class MovieCinema extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    @OneToMany(mappedBy = "movieCinema")
    private Set<Ticket> tickets;

    @Column(name = "date_time")
    private LocalDateTime localDateTime;
}
