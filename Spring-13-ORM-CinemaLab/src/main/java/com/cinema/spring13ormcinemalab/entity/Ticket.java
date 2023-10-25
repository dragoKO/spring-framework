package com.cinema.spring13ormcinemalab.entity;

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
    private MovieCinema movieCinema;

    @ManyToOne
    private UserAccount userAccount;


    private LocalDateTime dateTime;
    private int seatNumber;
    private int rowNumber;
}
