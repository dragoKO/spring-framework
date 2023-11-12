package com.cinema.spring13ormcinemalab.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity()
@Table(name = "ticket")
@Getter
@Setter
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


    @Override
    public String toString() {
        return "Ticket{" +
                "dateTime=" + dateTime +
                ", seatNumber=" + seatNumber +
                ", rowNumber=" + rowNumber +
                '}';
    }
}
