package com.cinema.spring13ormcinemalab.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Genre")
@Data
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "account_details_id"))
public class Genre extends BaseEntity {

    private String name;

    @ManyToMany
    private List<Movie> movie;


}
