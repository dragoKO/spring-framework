package com.cinema.spring13ormcinemalab.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "location")
@Getter
@Setter
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "location.id"))
public class Location extends BaseEntity {

    @OneToMany(mappedBy = "location",fetch = FetchType.LAZY)
    private List<Cinema> cinema;

    private String name;
    private Double latitude;
    private Double longitude;
    private String country;
    private String city;
    private String state;
    private String postalCode;
    private String address;

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
