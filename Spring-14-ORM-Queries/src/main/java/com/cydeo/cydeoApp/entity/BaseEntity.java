package com.cydeo.cydeoApp.entity;


import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

    @Id
    private long id;

}
