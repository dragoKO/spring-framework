package com.cinema.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cinema")
@Data
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "cinema_id"))
public class Cinema extends BaseEntity {

    @OneToMany(mappedBy = "cinema")
    private List<MovieCinema> movieCinema;

    private String name;
    private String sponsoredName;

    @ManyToOne()
    @JoinColumn(name = "location_id")
    private Location location;

}
