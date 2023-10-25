package com.cinema.spring13ormcinemalab.entity;

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
    private Movie movie;

    @ManyToOne
    private Cinema cinema;

    @OneToMany(mappedBy = "movieCinema")
    private Set<Ticket> tickets;

    private LocalDateTime localDateTime;
}
