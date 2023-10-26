package com.cinema.spring13ormcinemalab.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "location")
@Data
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "location.id"))
public class Location extends BaseEntity {

    @OneToMany(mappedBy = "location")
    private List<Cinema> cinema;

    private String name;
    private Double latitude;
    private Double longitude;
    private String country;
    private String city;
    private String state;
    private String postalCode;
    private String address;

}
