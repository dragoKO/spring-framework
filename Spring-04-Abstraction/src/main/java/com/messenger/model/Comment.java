package com.messenger.model;

import lombok.Data;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Data
public class Comment {
    private String author;
    private String text;
    private String time;

    {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        time = currentTime.format(formatter);
    }

}
