package com.tesla;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tesla {
    private int year;
    private  String model;
    private Engine engine;
}
