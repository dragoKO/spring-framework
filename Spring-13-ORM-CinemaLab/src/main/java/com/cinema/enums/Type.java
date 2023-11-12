package com.cinema.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Type {
    PREMIER("Premier"), REGULAR("Regular"),ACTIVE("Active");
    private final String value;
}
