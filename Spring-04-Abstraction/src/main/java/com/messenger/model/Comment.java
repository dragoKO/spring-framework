package com.messenger.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
public class Comment {
    private String author;
    private String text;
    private final String time;

    {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        time = currentTime.format(formatter);
    }

    public Comment(String author, String text) {
        this.author = author;
        this.text = text;
    }
}
