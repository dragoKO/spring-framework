package com.cinema.spring13ormcinemalab.enums;

public enum Role {

    USER("Regular user"), ADMIN("Admin");

    public final String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
