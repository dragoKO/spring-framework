package com.cinema.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity()
@Table(name = "ticket")
@Data
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "ticket_id"))
public class Ticket extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "movie_cinema_id")
    private MovieCinema movieCinema;

    @ManyToOne
    @JoinColumn(name = "user_account_id")
    private UserAccount userAccount;


    private LocalDateTime dateTime;
    private int seatNumber;
    private int rowNumber;

}
