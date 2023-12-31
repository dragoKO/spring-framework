package com.cinema.spring13ormcinemalab.enums;

public enum State {
    ACTIVE("Active"), DRAFT("Draft");

    private final String value;

    State(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
