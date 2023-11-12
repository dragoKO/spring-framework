package com.cinema.spring13ormcinemalab.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cinema")
@Getter
@Setter
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "cinema_id"))
public class Cinema extends BaseEntity {

    @OneToMany(mappedBy = "cinema")
    private List<MovieCinema> movieCinema;

    private String name;
    private String sponsoredName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location location;

    @Override
    public String toString() {
        return "Cinema{" +
                "movieCinema=" + movieCinema +
                ", name='" + name + '\'' +
                ", sponsoredName='" + sponsoredName + '\'' +
                '}';
    }
}
